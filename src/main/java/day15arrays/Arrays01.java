package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    public static void main(String[] args) {
        //Ex 1: Kullanicilari ile beraber bir array olusturunuz
        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi girecek");
        int numOfElements = input.nextInt();

        System.out.println("Girisi sonlandirmak icin Q tusuna basiniz...");

        String stdNames[] = new String[numOfElements];

        for (int i = 1 ; i<=numOfElements ; i++){

            System.out.println("Lutfen " + i + ". ogrencinin adini giriniz");

            String strName = input.next();

            if(strName.equalsIgnoreCase("Q")){
                break;

            }

            stdNames[i-1] = strName;

        }
        System.out.println(Arrays.toString(stdNames));

    }
}
