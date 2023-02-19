package day30Exceptionsinterface.Car;

public interface Ac {
    //interfacelerin icine "concrete" method konulamaz, cunku concrete methodlarda body vardir#
//    body vardir ve body o methodun isi nasil yapacagini belirtir. Isin nasil yapilacagi
//    bir cok detay icerir ve bu Child Class'larda kafa karisikligina sebep olur.
//    Halbuki sadece yapilmasi gerekn isi soyleyip nasil yapilacagini Childe birakirsaniz
//    Child Classin kafa karisikligini engellmis olursaniz.


//    interface'ler "concrete" methodlar icermezler, dolayisiyla interface deki hicbirsey istege
//    bagli degildir, hersey Child Classlar icin mecburidir. Bu yuzden interfacelere "to-do list" de denir.

//    Interface deki tum "methodlar" otomatik olarak "public"tir, "abstract" dir, "static" degildir.

//    interface'lerdeki "variabler" otomatik olarak "public" dir, "static" dir, "final" dir.

    // Body si yoktur==>{} interfaceler Abstracttir.


    public void coll();

    void run();

    public static final int price = 2000;//Bu Varialbedir.

    String model ="Mitsubischi";
}
