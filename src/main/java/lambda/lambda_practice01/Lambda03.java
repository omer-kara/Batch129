package lambda.lambda_practice01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda03 {
    public static void main(String[] args) {

        Apartman da01 = new Apartman("dogu", 1, 7000);
        Apartman da02 = new Apartman("bati", 2, 10000);
        Apartman da03 = new Apartman("guney", 3, 12000);
        Apartman da04 = new Apartman("dogu", 5, 15000);

        List<Apartman> daireler = new ArrayList<>(Arrays.asList(da01, da02, da03, da04));

        System.out.println(tumDaireKira5000denBuyukIseTrue(daireler));
        System.out.println("\n ********");
        System.out.println(enAzBirininKatSayisi2IseTrue(daireler));
        System.out.println("\n ********");
        System.out.println(cephesiDoguOlanSayisi(daireler));
        System.out.println("\n ********");
        System.out.println(katSayisiSira(daireler));
        System.out.println("\n ********");
        System.out.println(katSayisiikidenBuyukEnBuyukKira(daireler));
        System.out.println("\n ********");
        katSayisiikidenBuyukEnBuyukKira2(daireler);
        System.out.println("\n ********");
        System.out.println(katsayisi3tenAzOlanKucBuyEnKucukKira(daireler));
        System.out.println("\n ********");
    }
    // SORU1: Tüm dairelerin kira'ları 5000'den buyuk ise return ederek True yazdırın

    public static Boolean tumDaireKira5000denBuyukIseTrue(List<Apartman> daireler) {
        Boolean sonuc = daireler.stream().allMatch(t -> t.getKira() > 5000);   //allMatch==> akistan gelenlerin hepsi sarti sagliyorsa sec demek
        return sonuc;
    }

    // SORU2: Dairelerden En Az Birinin katSayisi 2 ise return ederek True yazdırın
    public static Boolean enAzBirininKatSayisi2IseTrue(List<Apartman> daireler) {
        Boolean sonuc = daireler.stream().anyMatch(t -> t.getKatSayi() == 2);   //anyMatch==> akistan gelenlerin hepsi sarti sagliyorsa sec demek
        return sonuc;
    }

    //SORU3: Dairelerden cephesi 'dogu' olanların, sayısını return ederek yazdırınız.
    public static long cephesiDoguOlanSayisi(List<Apartman> daireler) {
        long sonuc = daireler.stream().filter(t -> t.getCephe().contains("dogu")).count();
        return sonuc;   //2
    }

    //SORU4: Daireleri, katSayisina göre buyukten kucuge sıralayınız.
    // List halinde return ederek yazdırınız.
    public static List<Apartman> katSayisiSira(List<Apartman> daireler) {
        List<Apartman> sonuc = daireler.
                stream().          //Katsayisina gore siralama     //tersten
                        sorted(Comparator.comparing(Apartman::getKatSayi).reversed()).
                collect(Collectors.toList());  //Liste cevirdi
        return sonuc;
    }

    //SORU5: katSayisi 2'den fazla olan daireleri, kiraya gore buyukten kucuge sıralayınız
    // en buyuk kira'sını list halinde return ederek yazdırınız.
    public static List<Integer> katSayisiikidenBuyukEnBuyukKira(List<Apartman> daireler) {
        List<Integer> sonuc = daireler.
                stream().
                filter(t -> t.getKatSayi() > 2).
                sorted(Comparator.comparing(Apartman::getKira).reversed()).
                limit(1).//en buyuk kirayi aldik
                        map(t -> t.getKira()).
                collect(Collectors.toList());
        return sonuc;       //elimizde sadece kira kaldigi icin Interger bir liste atadik   //[15000]
    }

    public static void katSayisiikidenBuyukEnBuyukKira2(List<Apartman> daireler) {
        Stream<Integer> sonuc = daireler.
                stream().
                filter(t -> t.getKatSayi() > 2).
                sorted(Comparator.comparing(Apartman::getKira).reversed()).
                limit(1).//en buyuk kirayi aldik
                map(t -> t.getKira());

        System.out.println(Arrays.asList(sonuc.toArray())); //[15000]

    }
    //SORU6: katSayisi 3'den az olan daireleri, kiraya gore kucukten buyuge sıralayınız
    // en kucuk kira'sini list halinde return ederek yazdırınız.
    public static List<Integer> katsayisi3tenAzOlanKucBuyEnKucukKira (List<Apartman> daireler){
        List<Integer> sonuc = daireler.
                stream().
                filter(t->t.getKatSayi()<3).
                sorted(Comparator.comparing(Apartman::getKira)).
                limit(1).   //en kucuk kira aldik
                map(t->t.getKira()).
                collect(Collectors.toList());
            return sonuc;   //[7000]
    }
}
