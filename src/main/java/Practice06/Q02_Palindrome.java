package Practice06;

import java.util.Scanner;

public class Q02_Palindrome {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
//        System.out.println("Bir string deger giriniz");
//        String str = input.nextLine().replaceAll(" ", "").toLowerCase();// bosluklari sildik
//        String strReverse = "";
//
//        for (int i = str.length()-1; i>=0 ; i--) {
//            strReverse +=str.charAt(i);//buradaki i son index gosteriyor
//        }
//        System.out.println("strReverse = " + strReverse);
//
//        if (str.equals(strReverse)){
//            System.out.println("palindrome ");
//        }else {
//            System.out.println("Palindrome degil");
//        }
        System.out.println("Bir string deger giriniz");
        String str2 = input.nextLine().replaceAll(" ", "").toLowerCase();
        System.out.println("str2 = " + str2);
        
        StringBuilder stb = new StringBuilder(str2);
        System.out.println("stb = " + stb);
        String str2Reverse = stb.reverse().toString();//reverse==> tersi, toString()==> bu veriyi Stringe ceviriyor
        System.out.println("Reverse () sonrasi stb :" + stb );

        if (str2.equals(str2Reverse)){
            System.out.println("palindrome ");
        }else {
            System.out.println("Palindrome degil");
        }
    }
}
