package day31collections;

import java.util.LinkedList;

public class LinkedList01Tekrar {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Steve");
        names.add("Carl");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");

        names.addFirst("Cuneyt");
        System.out.println(names);

        names.addLast("Ajda");
        System.out.println(names);// add () methodu ile aynidir.

        names.add(3, "Suleyman");
        System.out.println(names);

        //names.clear();//Listin icindeki butun elemanlarini siler

        names.remove();//elemani ver sileyim demek

        names.remove();//Index i ver sileyim demek

        //Ilk ajda yi siler, sonraki Ajda lari silmez ve loop'u kirar
        names.remove("Ajda");//Object i ver sileyim demek
        System.out.println(names);

        names.add("Suleyman");
        System.out.println(names);

        String r1 = names.remove();// elemanin ismini ver onu Ilk olarak sileyim demek(Kes yapistir)
        System.out.println(r1);
        System.out.println(names);

        names.removeFirstOccurrence("Suleyman");//ilk suleymani sil demek(remove() ile ayni)

        names.removeLastOccurrence("Suleyman");//en son suleymani sil demek removeLast ()  ile ayni)

        //names.set();//index numarasini ver ben onu degistireyim demek

        names.indexOf("Megan");// bir elamanin ilk gorunumunun indeksini verir
        System.out.println(names);

        String r2 = names.peek();//ilk elemani verir ancak silmez(kopyala yapistir)
        System.out.println(r2);//Raj
        System.out.println(names);//[Raj, Megan, Brandon]

        //(Kes yapistir)== remove() methodu ile aynidir
        //remove() bos LikedListte kullanilirsa "hata" verir. poll() bos LikedListe kullanilirsa "null" verir
        names.poll();

        names.pop();//removeFirsr() ile aynidir.(Kes yapistir)


    }
}
