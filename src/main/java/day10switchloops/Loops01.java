package day10switchloops;

public class Loops01 {
    /*
    Code Standarts
    i)Tekrar(Repetition) olmamalidir.
    ii)Dynamic olmalidir.
    iii)Tamir (Fix) ve uptade (yenileme) kolay yapilabilmelidir.

     */
    public static void main(String[] args) {

        //Exaple 1: Ekrana 5 kere "Hi" yazdiriniz.
        //1.Yol: tavsiye edilmez.

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.Yol:
        //Ayni adimlar tekrar yapilmasi gerektiginde "Loop" lar kullanilir.
        //Dort tane loop var; i) for-loop ii) while-loop iii)do-while loop iv) for-each-loop

        //i) for-loop
        //1-Baslangic degeri, 2) Loop'un calisma sartini yaziniz 3) Increment/Decrement
        for (int i = 1; i < 6; i++) {
            //i=1 1 den basliyor 6 ya kadar calis demek.
            System.out.println("Hi!");
        }

        //Ex 1: 11'den 44 'e kadar tum tam sayilari ekrana yazdiran kodu yaziniz

        for (int i = 11; i < 15; i++) {
            System.out.println(i);
        }

        //Ex 3:40 dan 23 e kadar tum citf tam sayilari ekrana yazdiran kodu yaziniz

        for (int i = 40; i > 22; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //Ex 4: 18 den 56 a kadar tum tek sayilari yazdiran kodu zayiniz
        for (int i = 18; i < 57; i++) {

            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
