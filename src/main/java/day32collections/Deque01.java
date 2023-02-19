package day32collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    public static void main(String[] args) {

        Deque<Integer> dg = new LinkedList<>();

        dg.add(12);
        dg.add(5);
        dg.add(18);
        dg.add(9);
        dg.add(1);
        System.out.println(dg);//[12, 5, 18, 9, 1]


    }
}
