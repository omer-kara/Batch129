package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {
    public static void main(String[] args) {
        //Example 2: Bir interger Listteki 7 haric tum elemanlarin degerlerini 3 artirin.

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(7);
        nums.add(11);
        nums.add(12);

                            //nums ==> <12, 13, 7, 12, 11>
        for (Integer w: nums ) {

            if(w==7){

                continue;

            }
            //set==> Bu listede belirtilen konumdaki öğeyi belirtilen öğeyle değiştirir (isteğe bağlı işlem).
            //indexOf ==> Bu listede belirtilen öğenin ilk geçtiği dizinin dizinini veya bu liste öğeyi içermiyorsa -1'i döndürür.
            //Daha resmi olarak, Objects.equals(o, get(i))) veya böyle bir dizin yoksa -1 olacak şekilde en düşük i dizini döndürür.
            nums.set(nums.indexOf(w), w+3);

        }
        System.out.println(nums);//[15, 16, 7, 14, 15]

        //2.Yol:

        for (int i=0; i<nums.size() ; i++){
            int element = nums.get(i);

            if(element==7){
            continue;
            }
            nums.set(i, element+3);

        }
        System.out.println(nums);
    }

    /*
    nums.indexOf(w) ilk gorunumun index ini verir. List tekrarli elemana sahip ise
    nums.indexOf(w) kullanimi risk olusturabilir. bu yüden bu soruda en guvenli yol "for-loop" tur.
     */

}
/*
package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {

    public static void main(String[] args) {

        //Example 2: Bir Integer List'teki 7 haric tum elemanlarin degerlerini 3 artiriniz
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(7);
        nums.add(12);
        nums.add(11);

        //1.Yol:
                            // 12, 13, 7, 12, 11
        for(Integer w : nums){
            if(w==7){
                continue;
            }
            nums.set(nums.indexOf(w),w+3);
        }
        System.out.println(nums);//[15, 16, 7, 15, 14]

        //2.Yol:
        for(int i=0; i<nums.size(); i++){
            int element = nums.get(i);
            if(element==7){
                continue;
            }
            nums.set(i, element+3);
        }
        System.out.println(nums);//[18, 19, 7, 18, 17]

        /*
            nums.indexOf(w) ilk gorunumun index'ini verir. List tekrarli elemana sahip ise
            nums.indexOf(w) kullanimi risk olusturabilir. Bu yuzden bu soruda en guvenli yol "for-loop" tur.


        }
        }
 */
