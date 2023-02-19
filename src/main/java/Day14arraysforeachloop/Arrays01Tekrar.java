package Day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01Tekrar {
    public static void main(String[] args) {


        //Ex 1: String array olusturun icine 5 eleman ekleyin sonrada ilk eleman ile son elmanin icerdigi
        // karakter sayilari toplamini ekrana yazdirin
        String arr [] = new String[5];
        arr [0]="Math";
        arr [1]="Edeb";
        arr [2]="kimya";
        arr [3]="tarih";
        arr [4]="cografya";

        System.out.println(Arrays.toString(arr));//[Math, Edeb, kimya, tarih, cografya]


        //  arr[0].length()==> arr nin ilk elemanini aldik,
        // sonra arr[arr.length-1].length()==> ile arr nin son elemanini aldik
        System.out.println(arr[0].length() + arr[arr.length-1].length());

        //Ex 2: String array olusturun, icine 5 tane eleman ekleyin, tum elamanlarin
        // icerdigi karakter sayilari toplamini ekrana yazdirin.
        String arr1 [] = new String[5];
        arr1 [0]="Math";
        arr1 [1]="Edeb";
        arr1 [2]="kimya";
        arr1 [3]="tarih";
        arr1 [4]="cografya";

        int sum=0;

        for (int i = 0; i < arr1.length; i++) {

            sum = sum +arr1[i].length();



        }System.out.print(sum);

        System.out.println();

        int top=0;
        for (String w : arr1){

            top =top + w.length();
        }
        System.out.println(top);
    }
}
