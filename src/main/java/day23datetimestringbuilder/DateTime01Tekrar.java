package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01Tekrar {
    public static void main(String[] args) {

        LocalTime mYtime = LocalTime.now();
        System.out.println(mYtime);//10:59:31.546752500

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh-mm-ss a");
        System.out.println(dtf.format(mYtime));//10-59
    }
}
