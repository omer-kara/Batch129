package practice.practice12;

public class Q03_ForLoop_UsAlma {
    //Bir sayının istenen kuvvetini hesaplayan bir method yazınız.
    public static void main(String[] args) {

        System.out.println(kuvvetiniAl(5, 2));
    }

    public static double kuvvetiniAl(double taban, int ust){
       double sonuc=1;
       if (taban==0 && ust==0){
           throw new ArithmeticException("Taban ve ust ayni anda 0 olamaz");
       }

       if (ust>=0){
           for (int i = 0; i <ust ; i++) {
               sonuc *= taban;
           }
           return sonuc;
       }else {
           for (int i = 0; i <Math.abs(ust) ; i++) {
               sonuc *= taban;
           }
           return 1/sonuc;
       }

    }
}
