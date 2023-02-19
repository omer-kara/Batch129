package day34mapsiterators;

import java.util.Hashtable;

public class HashTable01 {

    /*
    1) HashTable "thread-safe" ve "synchronized" dir.
    2) HashTable entry'leri ratsgele siralar
    3) HashTable'lar HashMap'lere gore daha yavaslatirlar
    4) HashTable'lar  "key" lerde ve "value" larda "null" kullanilmasina musaade etmezler.

    Note:i)"multi thread" ve "synchronized" kullanmaniz gerekirse
         ii)"key" ve "value" larda "null" kullanmak yasak ise, HashTable kullanmak gerekir.
     */

    public static void main(String[] args) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();//tam bolenlerini veriyor
        ht.put(1,2);//1 ve -1
        ht.put(2,4);//1,-1,2,-2
        ht.put(6,8);//1,2,3,6,-1,-2,-3,-6

        System.out.println(ht);//{6=8, 2=4, 1=2}




    }

}
