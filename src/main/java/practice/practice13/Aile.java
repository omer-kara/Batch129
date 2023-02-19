package practice.practice13;

import java.util.*;

public class Aile {

    private Map<String, String> adSoyad = new HashMap<>();

    private List<String> kardeslerList = new ArrayList<>();//kardesler Listi

    private Map<Integer, List<String> >yasKardesler = new HashMap<>();


    //saklamak icin privite yaptik
    private  Map<Map<String, String>, Map<Integer, List<String>>> aileMap = new HashMap<>();   //Ad soyad yas ve kardesler girilecek

    public Aile (String ad, String soyAd, int yas, String... kardesler){    //String... kardesler==> varrags

        adSoyad.put(ad, soyAd);

        //Varragstan gelen kardeslerin isimlerini giriyorum
        Collections.addAll(kardeslerList, kardesler);
        yasKardesler.put(yas, kardeslerList);

        aileMap.put(adSoyad, yasKardesler);


    }

    public Map<Map<String, String>, Map<Integer, List<String>>> getAileMap() {
        return aileMap;
    }
}
