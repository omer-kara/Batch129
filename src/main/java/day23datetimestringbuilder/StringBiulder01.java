package day23datetimestringbuilder;

public class StringBiulder01 {
    public static void main(String[] args) {
        /*
        Java da String, "String Class" kullanilarak veya " StringBuilder Class" kullanarak olusturulabilir.
        "String Class" kullanarak urettiginiz Stringler "Immutable"(degistirilemez)dir.
        ""StringBuilder Class" kullanarak urettiginiz Stringler "Mutible"(degistirilebilir) dir
         */
        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        //String i degir´stirdikten sonra ayni String assign(atamak) ederseniz, Java yine yeni bir container olusturur,
        // degismis degeri bu yeni container'in icine koyar ve eski container i gosteren oku yeni conteáiner'a yonlendirir.
        //Dolayisiyla eski container adrssiz kalir, ve "Garbage Collector" adrsssiz olan container'leri siler.'
        String a = "Money";
        a= a +  "More";

        //Mutable
        //StringBuilder kullanarak String uretmenin 1. Yolu;
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);//Python

                sb1.append("!").append("?").append(".");//apend==> eklemek demek
        System.out.println(sb1);//Python!?.

        //StringBuilder kullanarak String uretmenin 2. Yolu;
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());//0

        //StringBuilder kullanildiginda baslangic kapasitesi 16 dir.
        //Kapasite asildiginda varolan kapasite nin iki fazlasi kadar varolan kapasiteye ekleme yapilir.
        // 16 ==> 16*2+2        34==> 34*2+2
        System.out.println(sb2.capacity());//16

        sb2.append("Java");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//23
        System.out.println(sb2.capacity());//34 =16x2+2

        sb2.append("yyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//38
        System.out.println(sb2.capacity());//34*2+2= 70

        //StringBuilder kullanarak String uretmenin 3. Yolu:
        StringBuilder sb3 = new StringBuilder(2);

        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6


        //insert ==> bukadar karakteri es gec daha sonra xx leri ekle demek.
        sb3.insert(2, "xxxxxx");
        System.out.println(sb3);//Flxxxxxxo
        System.out.println(sb3.length());//9

        //toString () methodu StringBuilder'i String'e cevirir.
        //String Class'da var olan ama StringBuilder Class var olmayan split() method gibi
        //method'lara ihtiyac duydugumuzda toString() methodunu kullanarak String Class gecer ve o methodlari kullaniriz.

        sb3.toString().split("l");
        System.out.println("sb3 = " + sb3);

        //Stringi tekrar StringBuildere cevirebilirsiniz
        sb3 = new StringBuilder(sb3);

        //reverse() ==> methodu Stringleri tersine cevirir.
        sb3.reverse();
        System.out.println( sb3);//oxxxxxxlF

        //deleteCharAt() methodu ile istediginiz characterdeki characteri silebilirsiniz
        //deleteCharAt(1) ; index 1 deki characteri siler.
        sb3.deleteCharAt(1);
        System.out.println(sb3);//oxxxxxlF

        //delete (1, 6); index 1 deki characterden index 5 (6 dahil olmadigi icin 5 yazdim) deki
        //charachter e kadar tum characterleri siler.
        sb3.delete(1,6);
        System.out.println(sb3);//olF

        //StringBuilder sb5 teki degerin StringBuilder sb6 ile alfabetik olarak karsilastirir.
        // Aradaki farki ascii deger olarak verir--1...

        //StringBuilder sb5 = new StringBuilder("Java");
        StringBuilder sb6 = new StringBuilder("Java");

        //sb5 alphabetic siralamada once ise sonuc negative olur, sonra ise sonuc positive olur.
        //System.out.println(sb5.compareTo(sb6));//1

        //setCharAt(2, 'm'); index 2 deki character i 'm' ye cevirir.
        sb6.setCharAt(2, 'm');
        System.out.println(sb6);//Jama

        sb6.replace(1, 3, "xyz");
        System.out.println(sb6);//Jxyza


        sb6.substring(1, 3);
        System.out.println(sb6);//Jxyza

        //StringBuilder Class'da kullanmamiza izin verilen substring() method gibi bazi String Class method'lari vardir.
        //bu methodlari StringBuilder ustunde kullaninca StringBuilderin orijinal degeri degismez.
        String s7 = sb6.substring(1, 3);
        System.out.println(s7);//xy
        System.out.println(sb6);//Jxyza














    }
}
