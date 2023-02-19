package day15arrays;

public class Arrays02Tekrar {

    public static void main(String[] args) {

        //Ex 2: Bir stringteki sesli harflerin sayisini bulan kodu yaziniz.
        //      a-e-i-o-u-A-E-I-O-U

        String s="Java brings you money";

//        int a = s.replaceAll("[^aeiouAEIOU]","").length();
//        System.out.println(a);

        String sayisi[] =s.split("");

        int counter =0;

        for (String w :sayisi             ) {

            switch (w.toLowerCase()){//switch ==> degistirmek demek
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":



                    counter++;

            }


        }

        System.out.println(counter);
    }
}
