package day18lists;


import java.util.ArrayList;
import java.util.List;

public class Lists03Tekrar {
    public static void main(String[] args) {

        //Example 2: Bir interger Listteki 7 haric tum elemanlarin degerlerini 3 artirin.

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(7);
        nums.add(11);
        nums.add(12);

        for (Integer w : nums) {

            if (w==7){
                continue;




            }
            nums.set(nums.indexOf(w), w+3);




        }
        System.out.println(nums);
        for (int i = 0; i < nums.size(); i++) {
            int element = nums.get(i);
            if (element==7){
 continue;
            }

            nums.set(i, element+3);



        }
        System.out.println(nums);
    }

}
