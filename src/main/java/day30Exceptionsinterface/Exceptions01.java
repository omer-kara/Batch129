package day30Exceptionsinterface;

public class Exceptions01 {

    // Her app in database'i vardir varil seklinde gosterilir genellikle kisaca DB yazarlar
// App ile DB ile surekli iletisim vardir, username ve pwd orda cunku
// App in database e ulasma hamlesine hit denir. DB ile connection kurulur
// App in DB ile bglanti kurduktan sonra cloud saniye basina para keser bundan dolayi islem sonrasi connection kesilmeli
// Giris bilgileri yanlissa yahut her halukarda islem bitiminde connection kesilmelidir yoksa fatura agir gelir clouddan
// Gunluk hayatta oldugu gibi IT de de her halukarda yapilmasi geereken isler vardir java bunun icin bir yapi olusturmustur;

    /*
    1) Exception olsa da, olmasada calistirmamiz gerekn kodlari "finally block" icine yazariz.
    2) DB ile baglantiyi kesmek isini yapan kodlar gibi kodlar her halukarda calistirilmalidir. Bu tarz kodlari
    finally block icine koyariz.
    3) "try block" yalniz kullanilamaz
    "try block" + 1 "catch block" + 1 "finally block" mumkundur.
    "try block" + coklu "catch block" mumkundur.
    "try block" + coklu "catch block" + 1 "finally block" mumkundur.
    "try block" + 1 "finally block" mumkundur.
    4) Coklu "finally block" kullanilmaz


     */
    public static void main(String[] args) {

        int a =12;
        int b= 4;

        int c[]={3,6,9,12};
        m(c,a,b);
    }
    public static void m (int [] c, int a, int b){

        try {
            int idx = a/b;
            int element = c [idx];
            System.out.println(element);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
        }finally {
            System.out.println("Cut the connection with the DB");//DB ile baglantiyi kes
        }



    }
}
