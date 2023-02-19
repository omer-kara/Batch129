package day17arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01Tekrar {
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

        ages.add(3,777);

        System.out.println(ages);

        ArrayList<Integer>newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2,newAges);//[9, 12, 8, 9, 10, 10, 777, 8, 9, 10]
        System.out.println(ages);

        //ages.toArray();
        //ages.clear();
        System.out.println(ages);

        boolean r =ages.contains(777);
        System.out.println(r);

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean t = names1.equals(names2);
        System.out.println(t);

        ArrayList<Integer> nums1 = new ArrayList<>();

        nums1.add(8);
        nums1.add(9);
        nums1.add(10);

        ArrayList<Integer> nums2 = new ArrayList<>();

        nums2.add(8);
        nums2.add(10);
        nums2.add(9);

        Collections.sort(nums1);
        Collections.sort(nums2);

        boolean n = nums1.equals(nums2);
        System.out.println(n);






    }
}
