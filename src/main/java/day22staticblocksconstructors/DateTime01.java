package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Locale;

public class DateTime01 {
    public static void main(String[] args) {

        //Date Class
        Date myDate = new Date();//bu bir obje
        System.out.println(myDate);//Sat Jan 07 21:26:42 CET 2023

        System.out.println(myDate.getTime());//1673123342244 ==>1 ocak 1970 den su ana kadarki mili saniye miktari

        //Icinde bulundugumuzu an masil alinir.
        System.out.println(LocalDate.now());//2023-01-07

        System.out.println(LocalTime.now());//21:34:41.609719700

        System.out.println(LocalDateTime.now());//2023-01-07T21:36:00.486220700

        //Dunyanin herhangi bir saat dilimindeki saati nasil aliriz?
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-08T05:44:41.044016400

        //Ileriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5));//2030-01-07

        //Geriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-05

        //Ilerki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().plusHours(3));//00:56:52.015092100

        //Geriki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().minusMinutes(45));//21:13:27.965066700

        //Zamanda belli bir bolumu nasil aliriz?
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());//22:1

        //Tarih'de belli bir bolumu nasil aliriz?
        System.out.println(LocalDate.now().getMonth() + ":" + LocalDate.now().getDayOfMonth());//JANUARY:7

        //Iki tarih nasil karsilastirilir?
        //02/13/2005 - 03/01/2007

        boolean result = LocalDate.of(2005,02,13).isBefore((LocalDate.of(2007,01,03)));
        System.out.println(result);//true

        boolean result1 = LocalDate.of(2005,02,13).isAfter((LocalDate.of(2007,01,03)));
        System.out.println(result1);//false

        //Tarihlerin formatlarini nasil degistirilir. //kucuk m==> minute, buyuk M==> Mounth
        //M--> Tek rakamla ay nosunu yazar- MM--> Iki rakamla ay nosunu yazar
        //MMM--> Uc isminin ilk uc harfini yazar - MMMM--> Ay isminin tamamini yazar

        //d--> Tek rakamla gun nosunu yazar - dd--> Iki rakamla gun nosunu yazar
        //yy--> Yilin son iki rakamini yazar - yyyy--> Yilin tamamini yazar
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");//Pattern ==> Kalip demek
        //burasi class          //burasi object

        System.out.println(dtf.format(LocalDate.now()));//07/01/2023
    }

}
