package day33maps;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class HashMaps03Tekrar {
    public static void main(String[] args) {

        //"Java is Java"==> J=1, a=4, v=1, i=1, s=1

        String cumle = "Java is Java";

        HashMap<String, Integer> harf = new HashMap<>();

        cumle = cumle.replaceAll("[^a-zA-Z]","");
        System.out.println(cumle);

        String [] yeniCumle = cumle.split("");
        System.out.println(Arrays.toString(yeniCumle));

        for (String w : yeniCumle             ) {

            Integer yeniHarf = harf.get(w);
            if (yeniHarf==(null)){
                harf.put(w, 1);
            }else {
                harf.put(w, yeniHarf+ 1);
            }
        }
        System.out.println(harf);
    }
}
