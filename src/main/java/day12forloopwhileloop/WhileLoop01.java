package day12forloopwhileloop;


public class WhileLoop01 {
    public static void main(String[] args) {

        //Example 1: 3'den 10 kadar tam sayilari console yazdiriniz.

        //1.Yol:

        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        //2.Yol :while - loop
        //while ==> -iken demek
        int i = 3;

        while (i < 11) {
            System.out.print(i + " ");

            i++;
        }

        System.out.println();
        //example 2: 23 den 12 ye kadar cift sayilari ekrana yazdiriniz.
        int k = 23;


        while (k > 11) {
            if (k%2==0)
            System.out.print(k + " ");

            k--;
        }
        System.out.println();
        //ex 3: Verilen bir tamsayinin rakamlari toplamini console yazdiran kodu yaziniz-

        //Sayi mod % 10 bolunurse sayinin son rakamini verir.

        //Bir rakamlari sayiyi toplamak icin# cikarmak icin, carmak icin num%10 ve num/=10 olarak bulabilir.

        //1.Yol:

        int num = -578;
        num= Math.abs(num);

        int sum = 0;

        while (num>0){
            sum =sum + num%10;
            num/=10;


        }
        System.out.println(sum);

        //2.Yol:

        int a=6841;

        int toplam=0;

        for (int m=a ; m>0  ; m/=10){

            toplam= toplam + m%10;

        }
        System.out.println(toplam);
    }
}

