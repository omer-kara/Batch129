package day13whileloopwhileloop;

import java.util.Scanner;

public class DoWhileLoop03Tekrar {

    public static void main(String[] args) {


        /*
        Username = 'admin' ve Password = "pwd123" dur.

        Kullanicidan username ve password alin. Username ve password dogruysa "Hesabiniza hos geldiniz" yazdirin
        username ve password  yalnis ise 4 kere "Username ve password unuzu giriniz" mesaji versin.
         username ve password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz

         */
        Scanner input = new Scanner(System.in);



        int counter=0;

        String Username = "admin";
        String Password = "pwd123";

        do {
            if (counter==4){
            System.out.println("Hesabiniz bloke olmustur");
}
            System.out.println("Lutfen username giriniz");
            String username =input.next();

            System.out.println("Lutfen password giriniz");
            String password =input.next();




            if (username.equals("admin") && password.equals("pwd123")){
                System.out.println("Hesabiniza hos geldiniz");
                break;
             }

            counter++;

        }while (true);



    }
}
