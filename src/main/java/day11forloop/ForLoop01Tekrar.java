package day11forloop;

public class ForLoop01Tekrar {

    public static void main(String[] args) {

        String s = "I love Java";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'e') {
                break;

            }
            System.out.print(s.charAt(i));

        }
        System.out.println();

        String l="Germany";
        for (int i = l.length()-1 ; i>=0 ; i--) {

        if (l.charAt(i)=='a'){
            break;

        }
        System.out.print(l.charAt(i));
        }

    }
}
