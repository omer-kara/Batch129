package day16multidimensicnalarrays;

public class Md03 {
    public static void main(String[] args) {

        //Example 2: Bir tane integer multidimensional array olusturunuz
        //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.
        //elemanlara ulasmak icin ini´nen ve nested kullanilir

        int a[][] = {{2, 62, 82}, {3, 13}};

        int sum = 0;

        for (int [] w : a){//arrayleri almak icin yazdik

            for (int k : w ){//arrayin verilerini ve diger arraylerin icini almak icin kullanildi
                sum = sum + k;

            }

        }
        System.out.println(sum);//162

    }
}
