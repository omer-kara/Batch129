package Practice06.yasinhoca;

import java.util.Arrays;

public class Q06_Arrays_Simetrik {

    // Bir Array'in simetrik olup olmadığını kontrol eden bir method oluşturunuz.

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};

        System.out.println(isSimetrik(arr));

    }


    public static boolean isSimetrik(int[] arr) {
        boolean isSimetrik = false;
        //

        for (int i = 0; i < arr.length/2; i++) {

        if (arr[i] == arr[arr.length - 1 - i]) {//arr.length-1-i]geriye dogru sayilari almak icin yazdik
                isSimetrik = true;


            } else {
                isSimetrik = false;
                break;
            }

        }
        return isSimetrik;
    }
}



