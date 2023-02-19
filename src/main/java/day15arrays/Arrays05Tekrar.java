package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05Tekrar {
    public static void main(String[] args) {
        String arr[]={"Michael", "Ajda", "Thomas", "Tom"};


        Arrays.sort(arr,Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(arr));

        String crr[] = {"Michael", "Ajda", "Gabriel", "Reyhane", "Thomas", "Tom", "Ali", "Cin", "Cem"};

        Arrays.sort(crr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));

        int a = 3, b = 5, c;
        c = (a * ++b) / (5 - 12) * (a + b);
        System.out.println(c);


    }





}
