package day35Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01Tekrar {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printEvenElements1(nums);
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printKare(nums);
        System.out.println();
        printKup(nums);
        System.out.println();
        printKareleriToplami(nums);
        System.out.println();
        printFarkliElemanlarinKaresi(nums);
        System.out.println();
        getMaxValue(nums);
        System.out.println();
        getMinValue1(nums);

    }
    public static void printElements1(List<Integer> nums){
        for (Integer w: nums){
            System.out.println(w + " ");
        }
    }
    public static void printElements2(List<Integer> nums){
        nums.stream().forEach(t-> System.out.print(t + " "));
    }
    public static void printEvenElements1(List<Integer>nums){
        for (Integer w : nums){
            if (w%2==0){
                System.out.print(w + " ");  //12 14 10 4 12

            }
        }
    }
    public static void printEvenElements2(List<Integer>nums){
        nums.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t + " "));    //12 14 10 4 12
    }
    public static void printKare(List<Integer>nums){
        nums.stream().filter(t-> t%2!=0).map(t-> t*t).forEach(t-> System.out.print(t + " "));
    }
    public static void printKup(List<Integer>nums){
        nums.stream().filter(t-> t%2!=0).distinct().map(t-> t*t*t).forEach(t-> System.out.print(t + " "));

    }
    public static void printKareleriToplami(List<Integer>nums){
        Integer sum = nums.stream().distinct().filter(t-> t%2==0 ).map(t-> t*t).reduce(0, (t, u)-> t+u);
        System.out.println(sum);
    }
    public static void printFarkliElemanlarinKaresi(List<Integer>nums){

        Integer product = nums.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(1, (t, u)-> t*u );
        System.out.print(product);
    }
    public static void getMaxValue(List<Integer>nums){
Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u)-> t>u ? t : u);
        System.out.println(max);
    }
    public static void getMaxValue1(List<Integer>nums){
        Integer max = nums.stream().distinct().sorted().reduce((t,u)->u).get();
        System.out.println(max);
    }
    public static void getMinValue1(List<Integer>nums){
        Integer min = nums.stream().distinct().sorted().reduce(Integer.MAX_VALUE, (t,u)-> u>t ? t : u);
        System.out.println(min);    //4
    }

}
