package okulProject;

import java.util.Scanner;

public class Depo {
    static Scanner scan = new Scanner(System.in);
    public static void anaMenu() throws InterruptedException {

        String tercih="";

        do {
        System.out.println("===============Yildiz Koleji===================\n" +
        "===============Ana Menu=================\n" +
        "\n" +
        "\t 1-Okul Bilgilerini Goruntule\n" +
        "\t 2-Ogretmen Menu\n" +
        "\t 3-Ogrenci Menu\n" +
        "\t Q-Cikis\n");
        System.out.println("Lutfen Menuden Tercihinizi yapiniz");
        tercih=scan.nextLine();

        switch (tercih){
            case "1":   //Okul bilgileri
                Depo.okulBilgileriniYazdir();
                break;
            case "2":   //Ogretmen menu
                Ogretmen.ogretmenMenu();
                break;
            case "3":   //Ogrenci menu
                break;
            case "q":
            case "Q"://cikis
                break;
            default:
                System.out.println("Lutfen gecerli bir tercih giriniz");

        }



        }while (!tercih.equalsIgnoreCase("q"));     //q olmadigi mutdetce devam et demek


        Depo.projeDurdur();
    }

    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println("=============Yildiz Koleji===================\n" +
                "\t\t Adres : " + Okul.adres +
                "\n\t\t Telefon : " + Okul.telefon);

        Thread.sleep(2000);
    }

    public static void projeDurdur() {
        System.out.println("Okul projemizden cikiniz");
    }
}
