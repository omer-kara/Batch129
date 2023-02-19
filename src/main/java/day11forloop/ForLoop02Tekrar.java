package day11forloop;

public class ForLoop02Tekrar {
    public static void main(String[] args) {

        String s = "Madagaskar";

        for (int i=0 ; i<s.length() ; i++ ){

            if(s.charAt(i)!='a'){
                System.out.print(s.charAt(i));

            }

        }
    }
}
