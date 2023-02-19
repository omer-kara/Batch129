package day18lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {

    public static void main(String[] args) {

        //Example 1: Integer bir List olusturunuz
        //           List'e 5 tane eleman ekleyiniz
        //           Bu elemanlardan 12'yi siliniz.

        List<Integer> ages = new ArrayList<>();

        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(12);

        //Note : Siz Javada tamsayi yazdiginizda, Java o sayinin data typeini otomatik olarak "primitivi int" kabul eder
        //      Bu yuzden remove () methodunun icine yazdiginiz tamsayi eleman olarak degil index olarak kabul edilir.
        //      Tamsayiyi eleman olarak gostermenin birkac yolu vardir.

        //1. Yol:
//        Integer nonPrimitivive = 12;
//        ages.remove(nonPrimitivive);//remove ==> kaldirmak, cikarmak(sadece ilk gorulen 12 yi siler)

        //2.Yol:Recommended==> tavsiye edilir.
        ages.remove((Integer) 12);//Autobaxsing==> burada cift paranteze aliniyor dikkat

        //3.Yol
        //ages.remove(Integer.valueOf(12));//int i alip wparperclass icine atar.

        //ages.remove(ages.indexOf(12));//ilk 12 yi bulacak bunun sonucunda indexini verecek. sonrada remove onu silecek
        //                               (sadece ilk gorulen 12 yi siler)


        System.out.println(ages);//2 method kullanildi.




        List<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);

        List<Integer> silinecekler = new ArrayList<>();
        silinecekler.add(12);
        silinecekler.add(25);



        /*
Removes from this list all of its elements that are contained in the specified collection (optional operation).
Belirtilen koleksiyonda bulunan tüm öğelerini bu listeden kaldırır (isteğe bağlı işlem).
         */
        //removeAll () methodu Lists ile calisir.
        //removeAll () methodu bir veya birden fazla elemanin tum gorunumlerini silmek icin kullanilir.
        nums.removeAll(silinecekler);//sectiginiz tüm elemanlari siler==> Bir <Lists> yapip ondan sonra siler.

        System.out.println(nums);

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 1 . sinav notlari yaziniz");
        int sinavNotlari1 = input.nextInt();
        System.out.println("Lutfen 2. sinav notlari yaziniz");
        int sinavNotlari2 = input.nextInt();

        int topNot = (sinavNotlari1 + sinavNotlari2);

        System.out.println((topNot/2)>=50 ? "Gectiniz": "Kaldiniz");
//        if (50<(topNot/2)){
//            System.out.println("Sinifi Gectin");
//        }else {
//            System.out.println("Sinifta kaldin");
//        }
//        System.out.println(topNot/2);

    }
}
