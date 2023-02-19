package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        System.out.println(cities);//[Miami, Istanbul, Kayseri, Almaty]

        //remove () methodu index ile kullanirsa o index'teki elemanlari siler.
        //index te silma yaparsan Emin misin diye sorar.
        String n = cities.remove(1);
        System.out.println(n);//
        System.out.println(cities);//[Miami, Kayseri, Almaty]


        //remove () methodu eleman ile kullanilirsa ilk gorunumu siler.
        //remove () methodu eleman ile kullanilirsa size o elemani silip silmadigini ifade eden
        // true veya false verir.
        //Eger eleman Listte var ise elemani siler ve size true der.
        //Eger eleman Listte yok ise elemani silemediginden ve size false der.

        Boolean p = cities.remove("Kayseri");
        System.out.println(p);
        System.out.println(cities);//[Miami, Almaty]

    }

}
