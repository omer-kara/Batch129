package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01Tekrar {
    public static void main(String[] args) {
        //Ex 1: Kullanicilari ile beraber bir array olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Kac ögreci ismi girilecek");
         int ogrenciSayisi = input.nextInt();

        System.out.println("Girisi sonlandirmak icin Q tusuna basiniz...");

         String ogrenciAdlari [] = new String[ogrenciSayisi];

         for (int i =1 ; i<=ogrenciSayisi ; i++){

             System.out.println(" Lutfen " + (i )+ ". ögrenci adini giriniz");

             String ogrenciAdi = input.next();

             if (ogrenciAdi.equalsIgnoreCase("Q")){
                 break;

             }
            ogrenciAdlari [i-1] = ogrenciAdi;
         }
        System.out.println(Arrays.toString(ogrenciAdlari));

    }
}
