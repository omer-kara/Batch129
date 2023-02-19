package practice.nighttime;

import java.util.Scanner;

public class C01_Scanner {

    /*
    TechProEd spor salonu icin kullanicidan isim; soyisim; yas; kilo; boy; salona devam edecegi ay suresi bilgilerini alip
    aylik 20 $ olarak toplam ucreti yazdiriniz.




     */
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
        System.out.println("TechProEd salonuna hos geldiniz...");

        System.out.println("Lutfen isminizi giriniz...");

        String tamIsim = input.nextLine();

        System.out.println("Lutfen yasinizi giriniz...");
        byte yas = input.nextByte();

        System.out.println("Lutfen kilonuzu giriniz...");
        double kilo = input.nextDouble();

        System.out.println("Lutfen boyunuzu yaziniz...");
        double boy =input.nextDouble();

        int aylik_Ucret =20;
        System.out.println("aylik ucret= " + aylik_Ucret +"$" );

        System.out.println("Lutfen uyelik suresini giriniz...");
        int aylik = input.nextInt();

        int toplam_Tutar = aylik_Ucret*aylik;

        System.out.println("toplam_tutar =" + toplam_Tutar + "$");

        System.out.println("TamIsim : " + tamIsim+ "\nYasiniz : " +yas+ "\nKilo :" +kilo+ "\nBoy :" + boy +
                "\nOdemeniz gerekn toplam tutar : " + toplam_Tutar + "$");

    }
}
