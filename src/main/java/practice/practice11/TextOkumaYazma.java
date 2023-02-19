package practice.practice11;

import java.io.*;

public class TextOkumaYazma {

    //Bir text dosyasındaki her satırın kelime sayısını o dosyada her satırın sonun yazdıran bir kod yazınız.

    /*
    WELCOME
Online IT Courses & It Bootcamps
TechPro Education is a coding bootcamp founded in 2019 by a group of passionate IT field experts with 10 years of teaching experience.
They all have domain knowledge and are actively working in top Fortune 500 companies.
As such, they witness industry progression first-hand and update the curricula where needed, making the online IT Bootcamps content always relevant.
     */
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:/Users/fomer/Downloads/HelloWorld.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String satir = bufferedReader.readLine();
        String yeniDosya ="";

        while(satir!=null){
            yeniDosya+=satir+"\n" + "==> Satir kelime Sayisi : "  + satir.split(" ").length + "\n";

            satir=bufferedReader.readLine();
        }
        System.out.println("yeniDosya = " + yeniDosya);

        FileWriter fileWriter = new FileWriter("C:/Users/fomer/Downloads/TechPro.txt");
        fileWriter.write(yeniDosya);
        fileWriter.close();


    }
}
