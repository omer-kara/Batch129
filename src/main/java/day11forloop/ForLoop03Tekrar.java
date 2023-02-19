package day11forloop;

public class ForLoop03Tekrar {
    public static void main(String[] args) {

        String s = "Java";

        String t = "";

        for (int i = s.length() - 1; i >= 0; i--) {

            t = t + s.charAt(i);


        }
        System.out.println(t);

        String duz = "adil";

        String ters = "";

        for (int i = duz.length() - 1; i >= 0; i--) {

            ters = ters + duz.charAt(i);
         }

        if (duz.equals(ters)){
            System.out.println(duz + "Palindrome");

        }else {
            System.out.println(duz + " Palindrome degil!");
        }
    }
}
