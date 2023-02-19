package practice.Practice09;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q01_Arrays_TekrarlariSil {
    //Bir array icerisindeki elementlerin tekrarsiz yazdiran bir kod yaziniz.
    public static void main(String[] args) {
        int [] arr = {10,20,20,20,30,30,40,50,50,60,20,-5};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        int idx=0;
        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i]!=arr[i+1]){

                arr[idx]=arr[i];
                idx++;

            }

        }
        arr[idx]=arr[arr.length-1];
        idx++;
        //idx++; atama yap bir artir demek icin her zaman boyle yazariz
        System.out.println(Arrays.toString(arr));

        int[] arrTekrarsiz = new int[idx];

        for (int i = 0; i < idx; i++) {
            arrTekrarsiz[i]=arr[i];
            System.out.println(Arrays.toString(arrTekrarsiz));
        }
    }

}
