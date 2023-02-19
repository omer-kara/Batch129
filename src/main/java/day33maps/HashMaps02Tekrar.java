package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMaps02Tekrar {
    public static void main(String[] args) {
        HashMap<String , Integer> wordsMap = new HashMap<>();

        String sentence = "Java is easy. Java is OOP. OOP makes Java easy.";
        System.out.println(sentence);

        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);

        String [] wordsArray = sentence.split(" ");
        System.out.println(Arrays.toString(wordsArray));

        for (String w :wordsArray             ) {
            Integer numOfOccurrence = wordsMap.get(w);

            if (numOfOccurrence==null){
                wordsMap.put(w, 1);
            }else {
                wordsMap.replace(w, numOfOccurrence + 1);
            }
        }
        System.out.println(wordsMap);
    }

}
