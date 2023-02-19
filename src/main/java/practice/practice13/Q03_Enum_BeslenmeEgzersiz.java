package practice.practice13;

public class Q03_Enum_BeslenmeEgzersiz {
    //Aylara göre sebze ve meyve tavsiyesi içeren ve toplam yapılması gereken egzersiz saatlerini söyleyen bir kod yazınız.
    //20 saat üstü egzersiz yapılacak ayları ekrana yazdırınız.

    public static void main(String[] args) {
//        System.out.println("BeslenmeEgzersiz.Ocak = " + BeslenmeEgzersiz.Ocak.toplamEgzersizSaati);
//        System.out.println("BeslenmeEgzersiz.Ekim.AyinMeyvesi = " + BeslenmeEgzersiz.Ekim.ayinMeyvesi);
//        System.out.println("BeslenmeEgzersiz.valueOf(\"Mart\").AyinMeyvesi = " + BeslenmeEgzersiz.valueOf("Mart").ayinMeyvesi);
//
//        BeslenmeEgzersiz.values()[1].ayinMeyvesi = "Poytakal";  //ayin meyvesini degistirdim
//        System.out.println("BeslenmeEgzersiz.Subat.ayinMeyvesi = " + BeslenmeEgzersiz.Subat.ayinMeyvesi);

        for (BeslenmeEgzersiz w : BeslenmeEgzersiz.values()){
            if (w.toplamEgzersizSaati>20){
                System.out.println(w);
            }
        }
    }
}
