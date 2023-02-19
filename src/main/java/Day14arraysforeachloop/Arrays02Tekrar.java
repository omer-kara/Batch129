package Day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02Tekrar {
    public static void main(String[] args) {


        //Ex 2: Interger array olusturunuz, icine 6 tane elemen yerlestiriniz,
        //      bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz


        Integer arr []=new Integer [6];

        arr[0]=35;
        arr[1]=12;
        arr[2]=51;
        arr[3]=567;
        arr[4]=9;
        arr[5]=88;

      // Arrays.sort(arr);

        //System.out.println(Arrays.toString(arr));
       // System.out.println(arr[0] + arr[arr.length-1]);


        int minimum = arr[0];
        int maximum = arr[0];
        for (int w:arr){

            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);





        }
        System.out.println(maximum+minimum);


    }
}
