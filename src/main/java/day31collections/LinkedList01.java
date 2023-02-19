package day31collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

    /*
    1)Interfacelerden object olusturulamaz cunku interfacelerin constructor'i yoktur.
    2) Abstract classlardan object olusturulamaz, constructor'lari vardir ama constructor object olusturmada kullanilamaz.
    3)interface'lerin constructor'lari olmadigindan collection olustururken interface isimleri "new" keyword'unden sonra kullanilamaz.
    4)class --> class ==> extends
      class--> interface ==> implements
      interface --> interface ==> extends
      interface --> class ==> Bu mumkun degildir.

    5)ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar. O yuzden eleman silme ve ekleme islemleri coklukla
    yapilacaksa ArrayList kullanmak tavsiye edilmez.
    6)LinkList'ler index kulanmadiklarindan eleman silme ve eklemede re-index yapilmasina gerek yoktur. Bu da LinkList
    leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken
    durumlarda LinkList kullanmak tavsiye edilir.
    7)ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.
    8)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
    bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.
     */

    public static void main(String[] args) {

        List<String> cityNames = new LinkedList<>();

        LinkedList<String>names = new LinkedList<>();
        names.add("Steve");
        names.add("Carl");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");

        System.out.println(names);//[Steve, Carl, Raj, Megan, Brandon]

        names.addFirst("Cuneyt");
        System.out.println(names);//[Cuneyt, Steve, Carl, Raj, Megan, Brandon]

        names.addLast("Ajda");
        System.out.println(names);//[Cuneyt, Steve, Carl, Raj, Megan, Brandon, Ajda]

        names.add(3, "Suleyman");
        System.out.println(names);//[Cuneyt, Steve, Carl, Suleyman, Raj, Megan, Brandon, Ajda]

        names.remove("Ajda");// Ilk Ajda'yi siler ve loop'u kirar
        System.out.println(names);//[Cuneyt, Steve, Carl, Suleyman, Raj, Megan, Brandon]

        names.remove(5);
        System.out.println(names);//[Cuneyt, Steve, Carl, Suleyman, Raj, Brandon]

        names.add("Suleyman");

        System.out.println(names);//[Cuneyt, Steve, Carl, Suleyman, Raj, Brandon, Suleyman]

        String r1 = names.remove();//Ilk elemani siler bu method (Cut + Paste)
        System.out.println(r1);// silinen eleman olan Cuneyt i bana soyledi
        System.out.println(names);//[Steve, Carl, Suleyman, Raj, Brandon, Suleyman]

        names.removeFirstOccurrence("Suleyman");// Suleyman ' in gorunumunu sil demek
        System.out.println(names);//[Steve, Carl, Raj, Brandon, Suleyman]


        names.add("Suleyman");

        names.removeLastOccurrence("Suleyman");//remove ile ayni
        System.out.println(names);//[Steve, Carl, Raj, Brandon, Suleyman]

//        Retrieves, but does not remove, the head (first element) of this list.(Copy + Paste)
//        Returns:the head of this list, or null if this list is empty
//            Bu listenin başını (ilk öğesini) alır, ancak kaldırmaz.(Kopyala + Yapıştır)
//            Döndürür:bu listenin başı veya bu liste boşsa null
        String r2 = names.peek();
        System.out.println(r2);//Steve  ilk elemani verdi ama silmedi.
        System.out.println(names);//[Steve, Carl, Raj, Brandon, Suleyman]


//        Retrieves and removes the head (first element) of this list. (Cut + paste)
//        Returns:the head of this list, or null if this list is empty

        //remove () bos LinkedList'te kullanilirsa "hata "verir, poll() bos LInkedList'te kullanilirsa "null" verir.
        names.poll();

//        Pops an element from the stack represented by this list. In other words, removes and returns the first element of this list. (Cut + Paste)
//        This method is equivalent to removeFirst().
//        Returns:        the element at the front of this list (which is the top of the stack represented by this list)
//        Bu liste tarafından temsil edilen yığından bir öğe çıkarır. Başka bir deyişle, bu listenin ilk öğesini kaldırır ve döndürür.
//        Bu yöntem, removeFirst() yöntemine eşdeğerdir.
//        Döndürür: bu listenin önündeki öğe (bu liste tarafından temsil edilen yığının en üstünde yer alır)
        names.pop();


    }
}
