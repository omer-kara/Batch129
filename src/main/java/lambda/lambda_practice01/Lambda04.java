package lambda.lambda_practice01;

import java.util.stream.IntStream;

public class Lambda04 {
    public static void main(String[] args) {
        System.out.println(birdenXeKadarToplam(10));
        System.out.println("\n ******");
        System.out.println(birdenXeKadarTekSayiTop(10));
        System.out.println("\n ******");
        System.out.println(birdenSonsuzTekSayiBelliTop(10));
        System.out.println("\n ******");
        System.out.println(ikidenSonsuzaKadarGidenCiftSayilarXeKadarYazdir(15));
        System.out.println("\n ******");
        System.out.println(bestenSonsuzGidenBesinKuvvetleriXeKadarYazdir(5));
        System.out.println("\n ******");
        System.out.println(faktoriyel(5));

    }
    //SORU1: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak), toplamını bulup return ederek yazdırınız.
    public static int birdenXeKadarToplam(int x){

        int sonuc = IntStream.range(1,x+1).sum();   //range==> belli aralik demek
                return sonuc;   //55
    }
    //SORU2: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak),
    // tek sayıların, toplamını bulup return ederek yazdırınız.
    public static int birdenXeKadarTekSayiTop(int x){
        int sonuc = IntStream.rangeClosed(1, x).filter(t->t%2!=0).sum();
        return sonuc;   //25
    }
    //SORU3: 1'den sonsuza kadar giden Tek sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız
    public static int birdenSonsuzTekSayiBelliTop(int x){
        int sonuc = IntStream.
                iterate(1,t->t+2).  //iterate==> yinelemek bizim belliledigimiz bir sayidan baslar
                // bizim belirledigimiz sistemde  sonsuza kadar gider denek
                limit(x).
                sum();
        return sonuc;   //100
    }
    //SORU4: 2'den sonsuza kadar giden Çift sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız
    public static int ikidenSonsuzaKadarGidenCiftSayilarXeKadarYazdir(int x){
        int sonuc = IntStream.
                iterate(2, t->t+2).
                limit(x).
                sum();
        return sonuc;   //240
    }
    //SORU5: 5'den sonsuza kadar giden kuvvetlerinden
    // ilk x kuvvetinin toplamını return ederek yazdırınız

    public static int bestenSonsuzGidenBesinKuvvetleriXeKadarYazdir(int x){
        int sonuc = IntStream.
                iterate(5, t->t*5).
                limit(x).
                sum();
        return sonuc;   //3905
    }
    //SORU6: x sayisinin faktoriyelini bulunuz
    public static int faktoriyel(int x){
        int sonuc = IntStream.
                rangeClosed(1,x).
                reduce(1,(a,b)->a*b);   //reduce bize sadece bir sonuc verir.
        return sonuc;//120
    }
}
