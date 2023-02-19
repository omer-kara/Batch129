package day34mapsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {

        /*
        Iterators'lar Loop'ların yaptığı işi yapar.
        Iteratorslar tıpkı loop'ta olduğu gibi elemanı alarak işleme sokar.
        Javanın Iterators'ları ortaya çıkarma sebebi sonsuz Infinite Loop riskini bitirmektir.
        Iterator'larda sonsuz loop yoktur.
        Iterator'lar Java tarafından sonradan oluşturulmuşlardır.
        Loop'ların yaptıkları bütün işlemleri yapabilirler.
        Loop'lar ile Iterator'larin performans farki yoktur ama Iterator'lar eleman silme ve uptade etmede daha basarilidirlar.

        Iki tip Iterator var;
        i)Iterator : Sadece elemanlari remove(silme) edebilirsiniz.
                    Sadece sol'dan sag'a calisir yani tek yonludur.
        ii)ListIterator: Elemani remove( silme) etme, "uptade etme" ve "add" yapabilirsiniz.
                        Hem sol'dan sag'a ve hemde sag'dan sol'a calisabilir, yani cift yonludur.
 */

        List<String> list1 = new ArrayList<>();
        //Iterator
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");

        System.out.println(list1);//[Ali, Can, Aliye]

        Iterator<String > itr1 = list1.listIterator();

        while (itr1.hasNext()){

            itr1.next();
            itr1.remove();
        }
        System.out.println(list1);//[]

        //Example 1:
        List<String> list2 = new ArrayList<>();
        list2.add("Ali");
        list2.add("Can");
        list2.add("Aliye");

        System.out.println(list2);//[Ali, Can, Aliye]

        ListIterator<String> listItr = list2.listIterator();

        while (listItr.hasNext()){
            String el = listItr.next();
            listItr.set(el + "!");

        }
        System.out.println(list2);//[Ali!, Can!, Aliye!]

        //Example 2:
        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");

        System.out.println(list3);

        ListIterator<String> listItr2 = list3.listIterator();

        //Asagidaki  loop pointer'i en saga almak icin yazildi.
        while (listItr2.hasNext()) {

            listItr2.next();//pointer en sona gonderdik
        }

            //Asagidaki (listItr2.hasPrevious()) loop elemanlari en sondan en basa almak icin yazildi.
            while (listItr2.hasPrevious()){
                String el = listItr2.previous();//Sondaki elemandan baslayip degistirir(Senden once eleman varmi diye soruyoruz)
                System.out.println(el + "<==");//Aliye<==        Can<==             Ali<==

                listItr2.set(el + "*");


        }
        System.out.println(list3);
    }
}
