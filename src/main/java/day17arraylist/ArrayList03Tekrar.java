package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03Tekrar {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        cities.remove(1);

        System.out.println(cities);

        boolean r = cities.remove("Miami");
        System.out.println(r);
        System.out.println(cities);
    }
}
