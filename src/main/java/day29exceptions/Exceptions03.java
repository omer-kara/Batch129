package day29exceptions;

import java.io.FileInputStream;// io ==> Input Output
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

    /*
    1) FileInputFoundException ve IOException Compile Time Exceptionlardir. yani code'u yazarken hata aliriz.
    2) FileNotFoundException tum input ve output islemleri ile ilgilidir.
    3) IOException Class, FileInputFoundException Clas'in parentidir.
    4) Isterseniz FileInputFoundException yerine IoException da kullanilabiri.
    5) IOException Class ve FileInputFoundException beraber kullanilacaksa FileInputFoundException ustte, IOException altta kullanilmalidir.
     */

    public static void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("src/main/java/day29exceptions/File01.txt");

            int k = 0;

            while((k= fis.read()) != -1 ){

                System.out.print((char)k);

            }

        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        System.out.println("Hi!");

    }

}
