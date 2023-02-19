package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists04Tekrar {

    public static void main(String[] args) {


        List<String> names = new ArrayList<>();

        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");

        List<String>females = new ArrayList<>();

        females.add("Ajda");
        //females.add("Emel");

        boolean t = names.containsAll(females);

        System.out.println(t);

        names.subList(1, 3); //"names" listesindeki index i 1, 2, 3 olan elemanlari bir Listin icinde size verir.


        List<String > subList =  names.subList(1, 3);
        System.out.println(subList);

        //reteinAll ==> ortak küme elemanlari verir.
//        names.retainAll(females);
//        System.out.println(names);

        //homeGoods.retainAll(electronics) homeGoods ile electronics listlerinin ortak elemanlarini homeGoods listi icinde verir.
        //Baska bir deyisle (In other words) homeGoods listesindeki ortak olmayan elemanlari siler.

//        names.retainAll(names);
//        System.out.println(names);


        //isEmpty () listteki hic eleman yoksa size "true" verir, 1 veya daha fazla eleman varsa size false verir.
        //"isEmpty() esasinda "names.size()==0" demektir.
        names.isEmpty();

        boolean l =names.isEmpty();
        System.out.println(l);
    }
}
