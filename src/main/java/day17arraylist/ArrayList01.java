package day17arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01 {
    /*
    1)Arraylistler(list) coklu data depolamak icin kullanilir.
    2) Arraylistler non-primitive data tipindeki coklu datalari depolamak icin kullanilir.
        List'ler "non primitive" data kabul ederler, arrayler ise "primitive" data veya "referens" kabul ederler

    3) Arraylistleri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur.
        list'ler elemna sayisinda "flexibeldir". ama Arraylar "flexibel" degildir.
    4) Madem "Array" ler elemen sayisinda flexible degil nicin Java "Array "leri iptal etmedi.
    i)Eleman sayisi belli datalari depolamak icin Arrayler tercih edilir.
    ii) Array ler cok hizli calisir.
    iii) Arrayler memory'de cok az yer kaplar.

     */

    public static void main(String[] args) {
        //List nasil olusturulur.
        //Wpappperclass olusturma yaptik. Integer
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);//[] eleman eklemedim list bos.Array.toString yazmiyoruz.

        //Listlere eleman nasil eklenir?
        //Liste eleman eklemek icin add methodunu kullaniriz.  bizim verdigimiz siraya gore yazar//I
        //add() methodu elemanlari sizin verdiginiz sirada "List"e ekler.(Insertion Order)==> icine sokma

        ages.add(9);
        ages.add(12);
        ages.add(10);

        ages.add(1,656);//1 index e 656 sayisini ekle demek.
        ages.add(3, 777);// araya eleman eklemek icin boyle yapariz
        ages.add(888);//en sona eleman eklemek icin kullanilir.

        System.out.println(ages);//[9, 656, 12, 777, 10, 888]

        //List'te coklu eleman nasil eklenir?
        //Bir "List"e coklu eleman eklemek icin o elemanlari once bir Listtin icine koymalisiniz
        //Bir "List" coklu eleman eklemek, o elemanlari once bir List'in icine koymalisiniz.
        ArrayList<Integer> newAges = new ArrayList<>();

        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);//Coklu eleman eklemek icin bu yazilir. En sona yazdirir!!!
        ages.addAll(2,newAges);//"addAll. index" index 2 den sonra siralansin demek icin bunu yaptik
        System.out.println(ages);//[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        //ages.toArray();//array gecmek icin kullanilir Bu listedeki tüm öğeleri uygun sırada
        // (ilk öğeden son öğeye kadar) içeren bir dizi döndürür.
        //ages.clear();// []==> butun datayi silme[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]k icin kullanilir
        System.out.println(ages);//[]

        //contains methodu bir elemanin List'te var olup olmadigini kontrol eder.
        boolean r =ages.contains(656);
        System.out.println(r);//true

        //Bir List in baska bir Liste ile "ayni" olup olmadigini nasil kotrol ederiz?
        //Iki Listin esit olabilmasi icin ayni index te ayni elemanlar olmalidir.
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s = names1.equals(names2);
        System.out.println(s);//false

        //Ex 1: Verilan 2 interger List'te tamamiyla "ayni elemanlarin" olup olmadigini
        //      kontrol eden kodu yaziniz.
        ArrayList<Integer> nums1 = new ArrayList<>();

        nums1.add(8);
        nums1.add(9);
        nums1.add(10);

        ArrayList<Integer> nums2 = new ArrayList<>();

        nums2.add(8);
        nums2.add(10);
        nums2.add(9);

        Collections.sort(nums1);//nums1 kucukten buyuge siralanmis olacak(koleksion coklu datanin biraraya konmasidir.
        Collections.sort(nums2);//nums2 kucukten buyuge siralanmis olacak

        boolean t =nums1.equals(nums2);
        System.out.println(t);//true




    }
}
