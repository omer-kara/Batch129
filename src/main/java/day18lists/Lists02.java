package day18lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists02 {
    public static void main(String[] args) {

        List<Integer> ages = new ArrayList<>();

        //Exaple 1: Bir tane Integer Lists olusturunuz
        //      Bu Listte birbirine en yakin iki tamsayisiyi yaziniz
        //      [12, 23, 9, 11 35] ==> 12,11
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(9);
        nums.add(11);
        nums.add(35);

        Collections.sort(nums);//[9, 11, 12, 23, 35] list kucukten buyuge siralama methodu

        System.out.println(nums);

        int minDiff = nums.get(1) - nums.get(0);//geht(1) ==> index 1 deki veriyi getir demek.


        //               idx 1 -      idx 0
        //                  11      - 9    = 2

        // indexlerde for loop kullanilir.
        //lenght ==> listlerde (size) oluyor

        //2. elemanda baslamak icin i '0 'yerine '1 'den baslatilmali;

        for (int i = 1; i <nums.size() ; i++) {

            //Math.min==> 2 veriden hangisi kucuk ise onu almak icin kullanilir
            minDiff = Math.min(minDiff, nums.get(i) - nums.get(i-1));

        }
        System.out.println(minDiff);
        for (int i = 1; i < nums.size(); i++) {

            if (nums.get(i)-nums.get(i-1)  == minDiff){

                System.out.println(nums.get(i-1) + " and " + nums.get(i));

            }
        }

    }
}
/*
package day18lists;

        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;

public class Lists02 {

    public static void main(String[] args) {

        //Example 1: Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 9, 11, 35] ==> 12, 11

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(9);
        nums.add(11);

        Collections.sort(nums);

        int minDiff = nums.get(1) - nums.get(0);

        for(int i=1; i<nums.size(); i++){
            minDiff = Math.min(minDiff, nums.get(i)-nums.get(i-1));
        }
        System.out.println(minDiff);

        for(int i=1; i<nums.size(); i++){
            if(nums.get(i)-nums.get(i-1) == minDiff) {
                System.out.println(nums.get(i-1) + " and " + nums.get(i));
            }
        }
    }
}
*/