package day33maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Hashmaps01Tekrar {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("USA", 400000000);
        hm.put("Germany", 85000000);
        hm.put("Alb", 3000000);
        hm.put("Alb", 2800000);
        hm.put("null", 18000000);

        Set<String> hmKey = hm.keySet();
        System.out.println(hmKey);//[USA, null, Alb, Germany]

        Collection<Integer> hmValues =  hm.values();
        System.out.println(hmValues);//[400000000, 18000000, 2800000, 85000000]
        int sum = 0 ;
        for (Integer w : hmValues){
            if (w!=null){
                sum = sum + w;
            }

        }
        System.out.println(sum);    //505800000

        hm.putIfAbsent("USA", 500000000);//yoksa koy demek
        hm.putIfAbsent("India", 1500000000);//yoksa koy demek
        System.out.println(hm);

//Exemple 2: Yeni ogretmenin maasi standart ucretten 1000TL fazla, eski ogretmenin standartan 2000TL fazla.

        HashMap<String , Integer> salaries = new HashMap<>();
        salaries.put("Ali", 8000);
        salaries.put("Ayse", 5000);
        salaries.put("Tom", 9900);


        String teacherName = "Kemal";
        if (salaries.keySet().contains(teacherName)){
            salaries.put(teacherName, 12000);
        }else {
            salaries.putIfAbsent(teacherName, 11000);
        }
hm.entrySet();

    }
}
