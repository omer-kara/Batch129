package lambda.lambda_practice01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {

        List<String> meyve = new ArrayList<>(Arrays.asList("elma", "portakal", "uzum", "cilek", "greyfurt", "nar",
                "mandalina", "armut", "elma","keciboynuzu", "elma"));

        ilkHarfeVeyac(meyve);
        System.out.println(" \n ***********");

        elemanlariBasinaVeSonunaYildiz(meyve);
        System.out.println(" \n ***********");

        System.out.println(karakterSayisinaGoreBuyKucSirKarSayEnBuyIlk3(meyve));
    }
// SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari, Method References ile aralarında bosluk bırakarak yazdıralım
    //filter(t-> t.startsWith("e") || t.startsWith("c") ==> ilk harfin e veya c oldugunu kontrol ettik

    public static void ilkHarfeVeyac(List<String > meyve){

        meyve.stream().filter(t-> t.startsWith("e") || t.startsWith("c")).forEach(Utils::yazdir);   //elma cilek elma elma

    }
// SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim
    //Bir sey degisiklik yapmak istiyorsak "map" kullaniriz
    public static void elemanlariBasinaVeSonunaYildiz(List<String > meyve){

    meyve.stream().map(t-> "*" + t + "*").forEach(Utils::yazdir);
    //*elma* *portakal* *uzum* *cilek* *greyfurt* *nar* *mandalina* *armut* *elma* *keciboynuzu* *elma*

}
// SORU3 : List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız,
// karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız

    //sortet() ==> siralamak icin kullaniriz
    //Comparator.comparing()    ==> neye gore siralayacagimizi yazariz
    //reversed()    ==>ters yazdirmak icin kullaniyoruz
    //toString()    ==> gelen akisin, bunun bir String oldugunnu belirtmek icin yazilir
    //limit(3)  ==> en buyuk ilk 3 elemanini almak icin yazdik


    public static List<String> karakterSayisinaGoreBuyKucSirKarSayEnBuyIlk3(List<String > meyve){
        List <String> sonuc = meyve.
                stream().
                sorted(Comparator.comparing(t-> t.toString().length()).
                reversed()).
                limit(3).
                collect(Collectors.toList());   //Liste cevirmek icin yazdik
        return sonuc;   //[keciboynuzu, mandalina, portakal]

    }
}
