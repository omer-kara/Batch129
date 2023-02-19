package day11forloop;

public class ForLoop04Tekrar {
    public static void main(String[] args) {

        //Example 1: 5 den 8 e kadar tam sayilarin toplamini veren kodu yaziniz.
        // 5+ 6 +7 +8 =26
        int top = 0;
        for (int i = 5 ; i<9 ; i++){
            top = top + i;




        }
        System.out.println(top);

        //Ex 2: 7 den 9 a kadar tam sayilarin carpimini veren kodu yaziniz.
        //7*8*9= 504

        int carp = 1;
        for (int i = 7 ; i<=9 ; i++) {
            carp = carp * i;

        }
        System.out.println(carp);

    }
}
