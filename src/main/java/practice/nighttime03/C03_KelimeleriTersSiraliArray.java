package practice.nighttime03;

import java.util.Arrays;
import java.util.Scanner;

public class C03_KelimeleriTersSiraliArray {

    public static void main(String[] args) {



    /*
    INTERWIEW SORUSU
         Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir.
         Sözcükler değişmeden,her giriş satırındaki sözcüklerin sırasını
         tersine çevirmek için kod yazınız.
         Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
         Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir
    */
        String str = "     Kemal Can Kuzu    ";

        String arr[] = str.split(" ");

        String tersString = "";


        for (int i= arr.length-1; i >=0 ; i--){

            tersString +=arr[i]+ " ";

        }

        System.out.println(tersString);
        System.out.println(tersString.trim());

/*
        INTERWIEW QUESTIONS
        Kullanicidan bir String aliniz.
        String'de var olan her character'in sayisini ekrana yazdiriniz.
        Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
        abaa   ==> a=3  b=1
                */
        Scanner input = new Scanner(System.in);

        System.out.println("Bir String giriniz :");

        String str1 = input.nextLine();//alican
        String arr1 []=str1.split("");
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1);

        int counter =0;
                // int i==> index demek
        for (int i = 1; i < arr1.length ; i++) {

            if (arr1[i-1].equals(arr1[i])){

                counter++;

            }else {
                System.out.println(arr[i-1] + "Karakterinin sayisi " +( counter+1) + " kez kullanilmistir");

                counter=0;//Ayni olanlar icin 1 artir.
            }
            if (i==arr1.length-1)//defalarca kodu yazdirmamasi icin sona gelindiginde yazdirmasi icin if kullandik

            System.out.println(arr1[i]+ " karakterinin sayisi " + (counter+1) + " kez kullanilmistir");
        }





    }//main
}