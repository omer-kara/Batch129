package lambda.lambda_practice01;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        //Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8)==> liste eleman eklemenin farkli yolu
        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));

        ciftVePozitifLamExYazdir(sayi);
        System.out.println(" \n ***********");

        ciftVePozitifMetRef(sayi);
        System.out.println(" \n ***********");

        kareYazdir(sayi);
        System.out.println(" \n ***********");

        kareTekrarsiz(sayi);
        System.out.println(" \n ***********");

        buyuktenKucugeSirala(sayi);
        System.out.println(" \n ***********");

        pozitifKupBirlerBas5(sayi);
        System.out.println(" \n ***********");

        toplamMetRef(sayi);
        System.out.println(" \n ***********");

        toplamLambdaEx(sayi);
        System.out.println(" \n ***********");

        System.out.println(pozitifElemanlarinCarpimiLamEx(sayi));
        System.out.println(" \n ***********");

        System.out.println(ciftElKareKucBuySirListReturn(sayi));
        System.out.println(" \n ***********");

    }

    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozitifLamExYazdir(List<Integer>sayi){
        sayi.stream().filter(t->t%2==0  && t>0).forEach(t-> System.out.print(t + " ")); //12 6 8

    }
    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın

    //forEach(Utils::yazdir);       ==> Util klasindan yazdir methodunu kullandik
    public static void ciftVePozitifMetRef(List<Integer>sayi){
        sayi.stream().filter(t->t%2==0 && t>0).forEach(Utils::yazdir);  //12 6 8
    }
    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void kareYazdir (List<Integer>sayi){
        //sayi.stream().map(t-> t*t).forEach(Utils::yazdir);
        sayi.stream().map(Utils::kareBul).forEach(Utils::yazdir);//25 64 144 0 1 144 25 25 36 81 225 64
    }
    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void kareTekrarsiz (List<Integer>sayi) {
        sayi.stream().map(Utils::kareBul).distinct().forEach(Utils::yazdir);//25 64 144 0 1 36 81 225
    }
    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    //Comparator.reverseOrder() ==> buyukten kucuge siralar
    public static void buyuktenKucugeSirala (List<Integer>sayi){
        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils::yazdir);//15 12 9 8 6 5 5 1 0 -5 -8 -12
    }
    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız

    public static void pozitifKupBirlerBas5 (List<Integer>sayi){
        sayi.stream().filter(t-> t>0).map(t->t*t*t).filter(t-> t%10==5).forEach(Utils::yazdir);//125 125 3375
    }
    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın
    //reduce(Integer::sum) ==> akistan gelen elemanlarin toplamak icin yazdik, bundan sonra herhangi bir method kullanamayiz(Terminal method)
    //reduce() methodu, terminal methoddur. Terminal methodundan sonra hicbir "foreach gibi" method kullanilmaz.
    public static void toplamMetRef(List<Integer>sayi){
        Optional<Integer> sonuc = sayi.stream().reduce(Integer::sum);
        System.out.println(sonuc);  //Optional[36]
    }
    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
    //reduce(0,(a,b)->a+b) ==> akistan gelen elemanlari toplamak icin yazdik, ilk deger olarak biz (identity)="0" verdik.
    /*
     Orn; reduce( 0,(t,u)->t+u) ==>  "t" ilk degeri "sifir" dan alir, daha sonraki degerleri toplamanin sonucundan alir.
"u" ise degerlerini her zaman "stream " den yani akista bize ne verilmis ise (orn List) oradan alir .
 //reduce( 0,(t,u)->t+u) burada bu codu int bir konteyner a koydugumuzda kizarmaz
 //cunku herhalukarda  "0" bir deger oldugu icin "Optional Integer" a da gerek kalmaz.
 //Aksi takdirde "0 Identity"  olmadiginda Java, Ya listte hic eleman yoksa(null ise)!!!  diye kizarir.
 //Java null i Integer kabul etmedigi icin hata verir , bunu engellemek icin java "Optional IInteger" a cevirir
     */
    public static void toplamLambdaEx (List<Integer>sayi){
        int sonuc = sayi.stream().reduce(0,(a,b)->a+b);
        System.out.println(sonuc);  //36
    }
    //SORU9 : Listin pozitif elemanlarının, carpımını Lambda Expression ile return ederek yazdırın
    public static int pozitifElemanlarinCarpimiLamEx (List<Integer>sayi){

        int sonuc = sayi.stream().filter(t-> t>0).reduce(1,(a,b)-> a*b);
        return sonuc;   //1944000
    }
    //SORU10 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız

    //collect(Collectors.toList() ==> List'e cevirmek icin yazdik
    //List<Integer> // Object olusturken return type List<Integer> yaptik
    public static List<Integer> ciftElKareKucBuySirListReturn (List<Integer>sayi) {
        List<Integer> sonuc = sayi.stream().filter(t -> t % 2 == 0).map(t -> t * t).sorted().collect(Collectors.toList());
        return sonuc;   //[0, 36, 64, 64, 144, 144]
    }
}
