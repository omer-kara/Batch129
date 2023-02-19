package day33maps;

import java.util.*;

public class HashMaps01 {
    public static void main(String[] args) {
        /*
        1) Map'lerde "USA = 400.000.000" seklinde data depolamamiz gerektiginde kullanilir.
        2) "USA = 400.000.000"  datasinin "USA" kismi "Key" olarak adlandirilir ve key'ler "unique" dir.
        3) "USA = 400.000.000" datasinin "400.000.000" kisnmi "value" olarak adlandirilir. ve "value" ler "tekrarli" olabilir
        4) Map'lerde depoladiginiz herbir data'ya "Entry" denir, "Eleman" denmez.
        5) "Entry" ler "unique" dir. Cunku key kisimlari unique oldugundan herbir "Entry" digerlerinden farklidir.

        6) "HashMap" cok hizlidir cunku "HashMap" ler "entry" leri siralama ile ugrasmazlar.
        7) "HashMap" lerde bir tane "key"i "null" yapabilirsiniz.
        8) "HashMap" lerde birden fazla kere "value" u "null" yapabilirsiniz.
        9) "HashMap" ler "multi thread" icin kullanilmaz ve "synchronization" yoktur.

         */

        //HashMap nasil olusturulur?
        HashMap<String, Integer> hm = new HashMap<>();
        System.out.println(hm);//{}

        hm.put("USA", 400000000);
        hm.put("Germany", 85000000);
        hm.put("Albania", 3000000);
        //Ayni "key" i kullanarak yeni bir "entry" eklerseniz var olan "value" u update etmis olursunuz.
        hm.put("Albania", 2800000);
        hm.put(null, 1200000);
        hm.put(null, 1800000);//{null=1800000, USA=400000000, Germany=85000000, Albania=2800000}
        hm.put("Myanmar", null);
        hm.put("Btuhan", null);//{null=1800000, Myanmar=null, USA=400000000, Btuhan=null, Germany=85000000, Albania=2800000}

        //HashMap'lerde sadece "key" leri almak istiyorum
        Set<String> hmKeys = hm.keySet();
        System.out.println(hmKeys);//[null, Myanmar, USA, Btuhan, Germany, Albania]

        //HashMap'lerde sadece "value" leri almak istiyorum.
        //Example 1: hm Map'indeki ulkelerin toplam nufusunu bulunuz.
        Collection<Integer> hmValues = hm.values();
        int sum = 0;

        for (Integer w:hmValues) {
            if (w!=null){
                sum = sum + w;
            }

        }
        System.out.println(sum);//489600000
        
        //HashMa'lerde belirli bir "key" nin "value" sunu nasil alabiliriz?
        Integer usaPopulation = hm.get("USA");
        System.out.println("uasPopulation = " + usaPopulation);

        //replace() methodu varolan bir "key"nin "value" sini degistirmek icin kullanilir.
        hm.replace("Bhutan", 35000000);//nufusu degistiriyor
        System.out.println(hm);//{null=1800000, Myanmar=null, USA=400000000, Btuhan=null, Germany=85000000, Albania=2800000}

        hm.putIfAbsent("USA", 700000000);//Burada o isimde biri varsa ekleme yapmiyor.
        System.out.println(hm);//{null=1800000, Myanmar=null, USA=400000000, Btuhan=null, Germany=85000000, Albania=2800000}

        hm.putIfAbsent("India", 700000000);//Burada o isimde biri yoksa ekleme yapiyor.
        System.out.println(hm);//{null=1800000, Myanmar=null, USA=400000000, Btuhan=null, Germany=85000000, Albania=2800000, India=700000000}

        //Exemple 2: Yeni ogretmenin maasi standart ucretten 1000TL fazla, eski ogretmenin standartan 2000TL fazla.

        HashMap<String, Integer>salaries = new HashMap<>();

        salaries.put("Ali", 8000);
        salaries.put("Ayse", 5000);
        salaries.put("Veli", 9000);
        salaries.put("Tom", 9900);

        //String teacherName="Tom";
        String teacherName="Kemal";
        if (salaries.keySet().contains(teacherName)){
            salaries.putIfAbsent(teacherName, 12000);
        }else {
            salaries.put(teacherName, 11000);
        }
        System.out.println(salaries);//{Tom=9900, Veli=9000, Ayse=5000, Kemal=11000, Ali=8000}

        //replace("USA", 400000000,500000000); methodu key USA ve Value 400000000 is value'u 500000000 yapar.
        hm.replace("USA", 400000000,500000000);
        System.out.println(hm);//{null=1800000, Myanmar=null, USA=500000000, Btuhan=null, Germany=85000000, Albania=2800000, India=700000000}

        //getOrDefault() olan key lerin degerini verir, olmayan key ler icin de sizin ikinci parametreye yazdiginiz degeri verir.
        Integer r =  hm.getOrDefault("Btuhan", 0);
        System.out.println(r);

        //hm.entrySet(); methodu "Map"i "Set"e cevirir. Map'ler loop kullanamaz.
        //Setlerin metodlarini kullanabilmek icin entrySet(); methodunu kullanarak Map'i Set'e cevirebiliriz
        //Map'i Set 'e cevirdigimizde Set'in butun ozellikilerini kullanabiliriz. Mesela : Loop gibi...
        //entrySet() methodunu kullandiginizda elde ettiginiz Set'in elemanlari  "Map.Entry<String,Integer>" seklinde bir Map olur.
        // Bu yuzden elemanlar icin Map method'lari kullanilabilir.
        //
        Set<Map.Entry<String,Integer>> myEntries = hm.entrySet();
        System.out.println(myEntries);//[null=1800000, Myanmar=null, USA=500000000, Btuhan=null, Germany=85000000, Albania=2800000, India=700000000]

        //Example 3: Ulke ismindeki chacter sayisini ulke nufusuna ekleyen ve sonucunu console yazdiran kodu yaziniz
        for (Map.Entry<String, Integer> w : myEntries){

        if (w.getValue()!= null && w.getKey()!=null){
            int toplam =w.getValue() + w.getKey().length();
            System.out.print (" : "+ toplam);// : 500000003 : 85000007 : 2800007 : 700000005
        }



        }

    }
}
