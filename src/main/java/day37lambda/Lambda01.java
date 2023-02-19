package day37lambda;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println(getSumOfAllElements(myList));//60

        System.out.println(getSumFromSevenToSeventy());//

        System.out.println(getMultiplicationFromThreeToNine1());

        System.out.println(getMultiplicationFromThreeToNine2());

        System.out.println(getFactorial(5));

        System.out.println(getSumOfEvensBetweenTwoInt(15,4));

        System.out.println(getSumOfDigitsBetweenTwoInts(120, 90));

    }

    //1)Verilen list'deki tum sayilarin toplamini veren method'u olusturunuz
    //reduce(Math::addExact)    ==> tam olarak topla demek
    public static int getSumOfAllElements(List<Integer> myList){
        return myList.stream().reduce(Math::addExact).get();    //60
    }
    //Example 2: 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.
    //iNtegerlerden bir stram olustur dedik, 7 ile 70 arasinda secim yaptir demek

    //rangeClosed==> baslangis ve bitis araligi veriyor
    //Intstream==> integerlari yukardan asagi diziyor.
    //reduce(Math::addExact)    ==> toplamak icin bunu yaziyoruz
    //getAsInt()    ==> bunu Integer e cevir demek

    /*
    Note: Her zaman bize verilen list ile islem yapamayabiliriz
      Bunun icin IntStream methodunu kullaniriz.
      rangeClosed(startInclusive, endInclusive) methodu bize
      baslangıc ve bitis degeri kapsayan degiskenlerle islem yapmamızı saglar
     */
    public static int getSumFromSevenToSeventy(){

        return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();   //2464
    }

    //3)3'den 9 kadar tum tam sayilarin carpimini veren methodu olusturunuz.

    public static int getMultiplicationFromThreeToNine1(){

        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();   //181440    ==>rangeClosed()==> []
    }
    //range(3, 10)  ==> inl sayi dahil ikinci sayi haric isleme sok demek
    public static int getMultiplicationFromThreeToNine2() {
        return IntStream.range(3, 10).reduce(Math::multiplyExact).getAsInt();   //181440    range()==> [ )
    }
    //4) Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.


    public static int getFactorial (int x){

        if (x==0){
            return 1;
        } else if (x<0) {
            System.out.println("Factoriyel islemi negatif sayilarla yapilamaz");
            return -1;
        }else {
            return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();   //120
        }


        }
    public static int getFactorial2 (int x){

        return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
    }

    //5) Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu giriniz
    public static int getSumOfEvensBetweenTwoInt(int a, int b){

        if(a>b){        // ilk sayiyi kucuk verdiginde program calismaz bunu onlemek icin bu kodu yazdik
            int temp=a;
            a=b;
            b=temp;

        }
        return IntStream.range(a+1, b).filter(Utils::isNumberEven).sum();   //50
    }
    //6)Size verilen iki tam sayi arasindaki tum tamsayilarin rakamlari toplamini veren kodu yaziniz
    // 12 ve 18 ==> 13 14 15 16 17 ==> 4+5+6+7+8 = 30
    public static int getSumOfDigitsBetweenTwoInts (int a, int b){
        if(a>b){
            int temp=a;
            a=b;
            b=temp;

        }
        return IntStream.range(a+1,b).map(Utils::getSumOfDigits).sum(); //30
    }
}
