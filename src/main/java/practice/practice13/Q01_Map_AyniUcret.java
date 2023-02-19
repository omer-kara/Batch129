package practice.practice13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q01_Map_AyniUcret {

    //Aşağıda verilen fiyat listesinden fiyatı 29.99 olan ürünlerin adlarını yazdırınız.
    public static void main(String[] args) {
        Map<String, Double> urunler = new HashMap<>();
        urunler.put("Kemer", 19.99);
        urunler.put("Gomlek", 29.99);
        urunler.put("Kazak", 24.99);
        urunler.put("Pijama", 29.99);
        urunler.put("Ayakkabi", 89.99);
        urunler.put("Kravat", 19.99);
        urunler.put("Terlik", 29.99);

        System.out.println("urunler = " + urunler);//urunler = {Kemer=19.99, Kazak=24.99, Kravat=19.99, Ayakkabi=89.99, Terlik=29.99, Pijama=29.99, Gomlek=29.99}

        //1.Yol
        for (  Map.Entry<String, Double> w : urunler.entrySet()){//Map larden (String ve Double) bilgileri entry Set te atayip, icerisinden aldik

            if (w.getValue()==29.99){
                System.out.println(w.getKey());
            }
        }

        //2.Yol
        Collection <Double> fiyatllar = urunler.values();
        System.out.println("fiyatllar = " + fiyatllar);

        Set<String> urunAdlari = urunler.keySet();
        System.out.println("urunAdlari = " + urunAdlari);

        for (int i = 0 ; i<fiyatllar.size() ; i++){
            if (fiyatllar.toArray()[i].equals(29.99)){  //fiyati 29.99 olan urunleri yazdir dedik
                System.out.println(urunAdlari.toArray()[i]);
            }
        }
        
    }

}
