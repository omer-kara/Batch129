package day04asciirapperclassoperatorsmemoryusage;

public class WrapperClass {

    public static void main(String[] args) {


        //primitive = char, boolean , byte, short, int, float, double
        //Wrapper Class: Character - Boolean -Byte - Short - Integer - Long - Float -Double
        //Wrapper classlar non-primitive dir. oyuzden memory de cok yer kaplarlar, o yuzden sart degilse wrapper class kullanmayi tercih etmeyiz.


        //Wrapper lerin icinde Method vardir- Primitive icinde method yoktur.


        int n = 12; //"n" yazip "nokta koyarsaniz hic method goremezsiniz, cunku "primitiler" method icermez

        Integer m = 12; //"m" yazip "nokta koyarsaniz bircok method gorursunuz, cunku "Wrapper class" method icerir

        byte p = 23;
        byte r = 43;

        //Example 1: Short data type inin minimum ve maximum degerlerini kod yazarak bulunuz.

        short maxShort =Short.MAX_VALUE;
        System.out.println(maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);


        //Example 2: int data type'inin minimum degeri ile byte data type'inin maximum degerinin toplamini bulunuz.
        int minInt = Integer.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;

        System.out.println("Toplam " + (minInt + maxByte));

        //Primitiyi - Wrapper Class yapmaya Autoboxing denir.
        //Wrapper Class - Primitive yapmaya Unboxing denir.

        //Example 3:  i) Pirimitive int i Wrapper Integar a ceviriniz(Autoboxing)
        int num =22;
        Integer wrapperNUm = num;
        System.out.println(wrapperNUm);

        //ii)Wrapper Byte i primitive byte e cevir.(Unboxing)
        Byte k = 43;
        byte primitiveK = k;
        System.out.println(primitiveK);

        //Example 4: i)Primitive char'i Wrapper Character'e ceviriniz.(Autoboxing)
//
        char initial = 'T';
        Character initialWrapper = initial;

        //ii)Wrapper Boolean'i primitive boolean'a ceviriniz.(Unboxing)


                Boolean isOld = true;
        boolean isOldWrapper = isOld;

        //Example 5: Size String olan verilen iki fiyatin toplamini ekrana yazdiriniz

        //+ Toplama: Sayilari 3+ 5= 8

        //Birlestirme(Concatenation) + : String "Ali" + "Can" = AliCan

        String shirt = "2300";
        String shose = "5200";

        //Java'da "+" sembolü iki sayı arasında kullanılırsa "toplama işlemi" olur.
        //Java'da "+" sembolü iki String arasında veya bir Strin ve bir sayı arasında kullanılırsa "concatenation işlemi" olur.
        //"concatenation işlemi" birleştirme yapar.
        //Note: Concatenation işleminde Java matematikteki işlem önceliği kurallarını kullanır.
        //Islem onceligi kurallari: 1) Once uslu sayilar 2) Parantez ici islemler yapilir 3) Carpma ve bolme 4) Toplama ve cikarma
        System.out.println(shirt + shose);

        //Integer.valueOf(String): String bir rakami int veri yapar.
        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shose);
        System.out.println(toplamFiyat);

        //Example 6_ Size String olarak verilen iki fiyatin toplamini ekrana yazdiriniz
        //Note: valueOf () methodu tum karakterleri rakam olan Stringleri sayilari cevirir.
        //      Eger valueOf() methodu kullanirken String'in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz.
        //      Bu hatayi duzeltmeyi ileride ogrenecegiz.

        String tv ="$11000";
        String radio = "$3000";

        System.out.println(tv + radio);//$11000$3000
                int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);





    }
}
