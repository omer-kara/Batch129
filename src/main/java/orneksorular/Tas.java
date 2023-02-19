package orneksorular;

import java.util.Scanner;

public class Tas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kullanicipuani = 0;
        int bilgisayarpuani = 0;
        while (true) {
            System.out.println("tas, makas, kagit seciniz: ");
            String kullanicisecimi = input.nextLine().trim().toLowerCase();
            int bilgisayarsecimi = (int) (Math.random() * 3);
            String bilgisayarsecimiString = "";
            if (bilgisayarsecimi == 0) {
                bilgisayarsecimiString = "tas";
            } else if (bilgisayarsecimi == 1) {
                bilgisayarsecimiString = "makas";
            } else {
                bilgisayarsecimiString = "kagit";
            }
            if (kullanicisecimi.equals("tas") && bilgisayarsecimiString.equals("makas")) {
                kullanicipuani++;
                System.out.println("Kazandiniz! Seciminiz: " + kullanicisecimi + " , Bilgisayar secimi: " + bilgisayarsecimiString);
            } else if (kullanicisecimi.equals("makas") && bilgisayarsecimiString.equals("kagit")) {
                kullanicipuani++;
                System.out.println("Kazandiniz! Seciminiz: " + kullanicisecimi + " , Bilgisayar secimi: " + bilgisayarsecimiString);
            } else if (kullanicisecimi.equals("kagit") && bilgisayarsecimiString.equals("tas")) {
                kullanicipuani++;
                System.out.println("Kazandiniz! Seciminiz: " + kullanicisecimi + " , Bilgisayar secimi: " + bilgisayarsecimiString);
            } else if (kullanicisecimi.equals(bilgisayarsecimiString)) {
                System.out.println("Berabere kaldiniz! Seciminiz: " + kullanicisecimi + " , Bilgisayar secimi: " + bilgisayarsecimiString);
            } else {
                bilgisayarpuani++;
                System.out.println("Kaybettiniz! Seciminiz: " + kullanicisecimi + " , Bilgisayar secimi: " + bilgisayarsecimiString);
            }

            System.out.println("Oyuna devam etmek istiyor musunuz? (evet / hayir)");
            String oyunadevamMI = input.nextLine();
            if (oyunadevamMI.equals("hayir")) {
                break;
            }
        }
        System.out.println(kullanicipuani);
        System.out.println(bilgisayarpuani);
    }}


