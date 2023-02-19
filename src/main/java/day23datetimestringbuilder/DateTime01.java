package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        //Example 1: Time i formatlayin

        LocalTime myTime = LocalTime.now();

        System.out.println(myTime);//18:30:06.110606100

        //hh ==> 12 lik saat sistemini kullanilir. HH==> 24 luk saat sistemini kullanilir.
        //hh kullandiginizda AM veya Pm demelisiniz, bunu demek icin "a" yazmaniz yeterlidir. Yani ; "hh:mm a"
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH-mm");
        System.out.println(dtf.format(myTime));//06-33
    }
}
