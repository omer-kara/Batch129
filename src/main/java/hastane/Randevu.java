package hastane;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Randevu {






        static LocalDate randevuGunu;
        static String randevuSaati;
        static Scanner input = new Scanner(System.in);

        public static void tarihOlusturma() {

            do {
                System.out.println("Lütfen size uygun randevu tarihini su formatta " +
                        "giriniz \"yyyy-MM-dd\"");
                String tarih = input.nextLine();

                try {
                    randevuGunu = LocalDate.parse(tarih);
                } catch (Exception e) {
                    //  System.out.println("Lütfen girişi belirtilen şekilde yapınız, Yıl-Ay-Gün");
                }

                boolean result = false;
                try {
                    result = randevuGunu.isAfter(LocalDate.now());
                } catch (Exception e) {
                    // System.out.println("Lütfen girişi belirtilen şekilde yapınız, Yıl-Ay-Gün");
                }

                boolean result2 = false;
                try {
                    result2 = randevuGunu.isBefore(LocalDate.of(2023, 8, 30));
                } catch (Exception e) {
                    //     System.out.println("Lütfen girişi belirtilen şekilde yapınız, Yıl-Ay-Gün") ;
                }

                if (result == true) {

                    if (result2 == true) {
                        System.out.println("Randevu gununuz basarili bir sekilde kaydedilmistir");
                        break;

                    } else {
                        System.out.println("Ancak 2023-8-30 tarihine kadar termin verebiliyoruz.");
                    }

                } else {
                    System.out.println("Müsait olmayan ya da hatali bir randevu saati girdiniz.");
                }
            }while(true);

        }

        public static void saatOlusturma() {
            List<String> saatler = new ArrayList<>();
            saatler.add("09:30");
            saatler.add("09:45");
            saatler.add("10:00");
            saatler.add("10:30");
            saatler.add("11:15");
            saatler.add("13:30");
            saatler.add("14:45");
            saatler.add("15:30");
            saatler.add("16:00");

            do {

                System.out.println("Lütfen asagidaki uygun randevu saatlerinden birini giriniz: " +
                        "\n" + saatler);

                randevuSaati = input.nextLine();
                if (saatler.contains(randevuSaati)) {

                    boolean silindiMi = saatler.remove(randevuSaati);
                    if (silindiMi) {

                        System.out.println("Randevu saatiniz basarili bir sekilde kaydedilmistir");

                        break;}


                } else {
                    System.out.println("Müsait olmayan ya da hatali bir randevu saati girdiniz.");
                }

            } while (true);

        }

        public static void randevuOlusturma() {

            tarihOlusturma();
            saatOlusturma();

            System.out.println("" +
                    "\nRandevu saati........: " + randevuSaati +
                    "\nRandevu Gününüz.....: " + randevuGunu );
            slowPrint("Ana menuye yönlendiriliyorsunuz...",50);
            System.out.println();
        }

        public static void slowPrint (String text,int delay){
            for (char c : text.toCharArray()) {
                System.out.print(c);
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

