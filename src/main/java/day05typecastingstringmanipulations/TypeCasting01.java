package day05typecastingstringmanipulations;

public class TypeCasting01 {
    /*
    Numeric primitive data type'lerinin birbirlerine donusturulmesine "Type Costing" denir.
    Numeric Date Type lar: byte - short - int - long - float - double

    Note: Kucuk data type'lerini buyuk data type ne cevirmeyi Java otomatik yapar.
    Bu isleme "AutoWidening" (Otomatik genisletme) denir.

    Note 2: Buyuk data type lerini kucuk data type lerine cevirmek riskli bir istir# Java bu riskli isi otamatik olarak yapmaz-
    Bu isleme kod yazan lar yapar.

    Bu isleme "ExplicitNarrowing" (Aciktan daraltma) denir.

     */

    public static void main(String[] args) {

        //byte data type ini int data type ina ceviriniz.

        byte age = 13;
        int ageInt = age;//AutoWidening

        //long data type ini short data type ina cevirelim.
        long weight =234;
        short weightShort = (short)weight;//Explicit Narrowing

        //int data type ii float data type ine ceviriniz-

        int population = 700000;
        System.out.println(population);

        float populationFloat = population;
        System.out.println(populationFloat);

        // double data type ini short data type ina ceviriniz.
        double number =12.934;
        System.out.println(number);//12.934

        short numberShort = (short) number;
        System.out.println(numberShort);//12

        //Dikkat!!
        //Dunusum yaptiginiz sayi(260), dönuseceginiz data type inin sinirlarini disinda ise, Java kullandiginiz sayi ile "mod" islemi
        //yapar ve mod isleminin sonucunu sizin yeni degeriniz olur.

        //Example 1:
        short num = 260;
        System.out.println(num);

        byte numByte =(byte) num;
        System.out.println(numByte);

        //Example 2:
        short n = 1023;
        System.out.println(n);

        byte nByte = (byte) n;
        System.out.println(nByte);




    }
}
