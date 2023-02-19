package day28exeptions;

public class Exceptions01 {//Exception ==> umulmadik kaza denir
    public static void main(String[] args) {
        /*
        1) Exception demek beklenmedik problem demektir. Seyahattete benzinin bitmeis. Arabanin bozulmasi gibi..
        2) Gercek hayatta karsilastigimiz belenmedik problemler icin cozum yollarimiz vardir. Benzin bitince Yol Yardimini arariz.
            Application'lardada  belenmedik problemler icin cozum yollari uratmeliyiz, bu isleme "Exception Hangling" denir.
        3) ExeptionLar temel olarak ikiye ayrilir.
                i)Compile Time Exception : Siz code yazarken farkedilir ve yazdiginiz kodun alti kirmizi cizgi ile cizilir.
                ii)Run Time Exception : Siz code yazarken farkedilmez ama code calistirdiginizda console'da hata alirsiniz.
        4) Exceptionslar disindan error diye adlandirdigimiz "Handle" edilemeyen problemler vardir.
        Gercek hayatta soforun olmesi gibi, handle edilemeyecek durumlar error olarak adlandirilir.
        Applicationlarda "Memory" nin dolmasi "Error" dur.
        Iki tur memory var i) Stack Memory dolarsa "StackOverFlow Error" alirsiniz
                            ii) Heap Memory dolarsa "OutOfMemory Error" alirsiniz.
        5) Yazdiginiz kod calismadiginda problemi bulmak icin "Log" lara bakariz.
        6) if else kullanirsak olusabilecek  her problemi spesifik olarak if parantezinin icine yazmamiz gerekir.
        Ama try catch'te Java ilgili Excaption ile alakali olusabilecek butun problemleri  yakalar.
        7)
         */


        int a=12;
        int b=0;

        divide(a,b);

    }
    //AritmeticException yazdiginiz code'da matemetiksel islem kullaniyorsaniz alinabilecek bir Exception'dir.
    //Nasil handle edilecegini asagiya yazdik.

    public static void divide(int a, int b){//divide ==> bolme demek
        try {//try ==> "dene" demek
            System.out.println(a / b);
            System.out.println("I am here");
        }catch (ArithmeticException e){//catch==> "yakala" demek (ArithmeticException= butun matematiksel hatalari yakalar)
            System.out.println("Do not divide by zero");
        }
        System.out.println("You are here");
    }
    //"Excaption Handlin" de if - else kullanilmaz. Bakiniz 6. note
    public static void divide2(int a, int b){
        if (b==0){
            System.out.println("Do not divide by zero");

        }else {

            System.out.println(a/b);
        }

    }
}
