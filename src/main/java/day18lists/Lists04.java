package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {
    public static void main(String[] args) {

        List<String>names = new ArrayList<>();

        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");

        List<String>females = new ArrayList<>();

        females.add("Ajda");
        females.add("Emel");

        //names.containsAll(females) "names" listesinde "females" listindeki "tum elemanlarin" var olup olmadigini kotnrol eder
        //Tamami varsa "true" verir, herhangi biri yoksa sizi false verir.

        boolean r = names.containsAll(females);//namesin sinde hepsi (females ) varmi sorar

        System.out.println(r);//false

        //names.subList(1, 4) "names" listesindeki index i 1, 2, 3 olan elemanlari bir Listin icinde size verir.
        //Ikinci index olan 4. dahil etmez.

        List<String>sublist = names.subList(1, 4);
        System.out.println(sublist);


        //reteinAll ==> ortak küme elemanlari verir.
        names.retainAll(females);
        System.out.println(names);//[Ajda] ilk kumeyi boyle degistirdi
        System.out.println(females);//[Ajda, Emel]


        //Example 1: Elektronik alatler ve ev aletleri listeleriniz var.
        //          Elektronic ev aletleri listesindeyiz.

        List<String>electronics = new ArrayList<>();
        electronics.add("Tv");
        electronics.add("Radio");
        electronics.add("Refrigerator");
        electronics.add("Mobile Phone");
        electronics.add("Notebook");



        List<String>homeGoods = new ArrayList<>();

        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("TV");

        //homeGoods.retainAll(electronics) homeGoods ile electronics listlerinin ortak elemanlarini homeGoods listi icinde verir.
        //Baska bir deyisle (In other words) homeGoods listesindeki ortak olmayan elemanlari siler.
        homeGoods.retainAll(electronics);//Radio

        System.out.println(homeGoods);

        
        //isEmpty () listteki hic eleman yoksa size "true" verir, 1 veya daha fazla eleman varsa size false verir.
        //"isEmpty() esasinda "names.size()==0" demektir.
        names.isEmpty();


        //
        System.out.println(names.hashCode());//2041509

 

    }
}
