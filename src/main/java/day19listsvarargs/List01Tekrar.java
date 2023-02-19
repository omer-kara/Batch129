package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List01Tekrar {
    public static void main(String[] args) {

        //Example 1: Verilen bir List teki elemanlari tekrarsiz olarak yazdiriniz.
        //[2, 3, 2, 2, 3, 5]==> [2, 3, 5]
        List<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(2);

        List<Integer>newList = new ArrayList<>();
        for (Integer w : arr) {
            if (!newList.contains(w)){
                newList.add(w);
            }
        }
        System.out.println(newList);

        //Ex 2: Musteriden urun ismini aliniz.
        //Mustaerinin ismini verdigi urun listede varsa urunun ismini yazdiriniz
        //Mustaerinin ismini verdigi urun listede yoksa "Out os stack" yazdiriniz.

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen urun ismini giriniz");

        List<String> products = new ArrayList<>();
        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("PC");
        products.add("Notebook");
        products.add("Mobile Phone");

        String product = input.nextLine();

        for (String w : products) {

        if (w.equals( product)){

            System.out.println(product + ". urun bulunmaktadir");
break;
        }else {
            System.out.println(product + "Out os stack");
}

        }

    }
}
/*
Scanner input=new Scanner(
System.in
);
        System.out.println("cikmak isterseniz q ya basiniz");
        List<String> products = new ArrayList<>();
        products.add("tv");
        products.add("radio");
        products.add("iPad");
        products.add("pC");
        products.add("notebook");
        products.add("mobile Phone");

        do {
            System.out.println("urunun adini yaziniz");
            String urun = input.nextLine().toLowerCase();
            for (String w : products) {
                w=w.toLowerCase();

            }  System.out.println(products);
            if (urun.equalsIgnoreCase("q")) {
                break;
            } else if (products.contains(urun)) {
                System.out.println("urun stokta var");
            } else {
                System.out.println("urun stokta yok");
            }

        }while(true);
 */