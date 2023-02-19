package day35Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    /*
    1)Lambda "functional(kullanisli) programing" dir.
    2)"functional programing" ne yapmak gerekir?(What to do?) ile ilgilenir Nasil yapmak gerekir?(How to do?) ile ilgilenmez.
    3)"functional programing" Collection'lar ve Array'ler de kullanilir.
    4)Lambda, Java'ya Java 8'de eklendi.

    "stream()" elemanlari yukardan asagiya dizer."Lambda" list'i "stream" e cevirir öyle calisir.
     "filter()" filtrelemek icin kullanilir.
     "map()" u var olan elemani degistirmek icin kullanilir.
     "distinct()" u tekrarli elemanlari sadece bir kere gosterir ve tekrarsizlari olduklari kadar gosterir.
     Note : Distinct methodu ilk baslara konulursa "Lambda" ya daha az is yaptirmis oluruz.
     "reduce()" u  kullanildiginda cok sayidaki deger bir tane degere donusmus olur.
     Orn; reduce(0,(t,u)->t+u) ==> "t" ilk degeri "sifir" dan alir, daha sonraki degerleri toplamanin sonucundan alir.
     "u" ise degerlerini her zaman "stream" den alir
     get()==> methodu optional data type'ini Integer'a cevirir.

    stream==> akis demek
     */
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printElements1(nums);
        System.out.println();//bosluk icin bunu yazdik

        printsElements2(nums);
        System.out.println();

        printEvenElements1(nums);
        System.out.println();

        printEvenElements2(nums);
        System.out.println();

        printSquareOfOddElements(nums);
        System.out.println();

        printCubeOfDistinctOddElements(nums);
        System.out.println();

        printSumOfSquaresOfDistinctEvenElements(nums);
        System.out.println();

        printProductOfsquerOfDistinctEvenElements(nums);
        System.out.println();

        getMaxValue(nums);
        System.out.println();

        getMaxValue2(nums);
        System.out.println();

        getMaxValue3(nums);
        System.out.println();

        getMinValue1(nums);
        System.out.println();
        getMinValue2(nums);
        System.out.println();
        getMinValue3(nums);
        System.out.println();
        getMinValue4(nums);
        System.out.println();

        getMinGreaterThanSevenEven(nums);
    }
    //1)Create a method to print the list elements on the console in the same line with a
    // space between two consecutive elements.(Structured)(yapılandırılmış)
    //Bir List'teki elemanlari ayni satirda bosluk koyarak yazdiran methodu olusturunuz
    public static void printElements1(List<Integer>nums){

        for (Integer w: nums){
            System.out.print(w + " ");  //12 9 131 14 9 10 4 12 15
        }

    }
    //2)Create a method to print the list elements on the console in the same line with a
    // space between two consecutive elements.(Functional)
    //Bir List'teki elemanlari ayni satirda bosluk koyarak yazdiran methodu olusturunuz
    public static void printsElements2(List<Integer>nums){

        //12 9 131 14 9 10 4 12 15 list elemanlari
        nums.stream().forEach(t -> System.out.print(t + " "));  //12 9 131 14 9 10 4 12 15
    }
    //3)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void printEvenElements1(List<Integer>nums){

        for (Integer w: nums){
            if (w%2==0){
                System.out.print(w + " ");//cift sayilari aldik
            }
        }

    }
    //4)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printEvenElements2(List<Integer>nums){

        nums.
                stream().
                filter(t-> t%2==0). //eleme yapmak icin filter() kullanilir- //filter secme demek
                forEach(t-> System.out.print(t + " "));//herbirini yazdirmak icin forEach() kullaniliyor //12 14 10 4 12
    }
    //5)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
    //  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printSquareOfOddElements(List<Integer>nums){

        nums.
                stream().
                filter(t-> t%2!=0). //filter ==> filtreliyor
                map(t-> t*t).       //map ==> Var olan programi degistirmek icin kullanilir
                forEach(t-> System.out.print(t + " ")); //81 17161 81 225
    }
//6)Create a method to print the "cube" of "distinct" "odd" list elements on the console in the same line with a space between two consecutive elements.
//  Bir list'teki "tek sayi" olan elemanlarin "kup"lerini tekrarsiz olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printCubeOfDistinctOddElements(List<Integer>nums){

        nums.
                stream().
                filter(t->t%2!=0).
                distinct().     //Tekrarsiz elemanlari almak icin yaziyoruz
                map(t->t*t*t).
                forEach(t-> System.out.print(t + " ")); //729 2248091 3375

    }
    //7)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements
    //"Belirgin" "çift" öğelerin "karelerinin" "toplamını" hesaplamak için bir yöntem oluşturun

    //redece() coklu degerleri azaltmak icin kullanilir.
    //reduce(0,(t,u)->t+u);==> basta toplam=0, "t ve u degeri verecegiz sana java ve sen onlari toplayacaksin."
    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer>nums){

         Integer sum = nums.
                 stream().
                 distinct().
                 filter(t->t%2==0).
                 map(t->t*t).
                 reduce(0, (t, u)->t+u );   //redece() coklu degerleri azaltmak icin kullanilir.
                                            // Baslangic degeri 0 verdik toplamada. sonra sana 2 sayi (t, u) vereyim
                                            // ve sen bunlari topla (t+u)dedik
        System.out.println(sum);    //456
    }
    //8)Create a method to calculate the product of the squere of distinct even (cift) elements
    //8) Farklı çift elemanların karesinin çarpımını hesaplamak için bir yöntem oluşturun
    public static void printProductOfsquerOfDistinctEvenElements (List<Integer>nums){
        Integer product = nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(1, (t, u)-> t*u);
        System.out.println(product);    //45158400
    }
    //9)Create a method to find the "maximum value" from the list elements
    //9) Liste öğelerinden "maksimum değeri" bulmak için bir yöntem oluşturun

    //1.Yol
    public static void getMaxValue(List<Integer>nums){
        //Maximum degeri ararken Integer.MIN_VALUE kullanmak genel pratiktir.
        //Minimum degeri ararken Integer.MAX_VALUE kullanmak genel pratiktir.


        Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t : u);
        System.out.println(max);    //131
    }
    //2.Yol
    public static void getMaxValue2(List<Integer>nums) {

        Integer max = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);
    }
    //3.Yol
    public static void getMaxValue3(List<Integer>nums) {

        Integer max = nums.
                stream().
                distinct().
                sorted().     //kucukten buyukge siralamak icin kullandik
                reduce((t, u) -> u).
                get();      //get()==> methodu optional data type'ini Integer'a cevirir.
        System.out.println(max);    //131
    }
    //10)Create a method to find the minimum value from the list elements
    //10) Liste öğelerinden minimum değeri bulmak için bir yöntem oluşturun
    //1.Yol
    public static void getMinValue1(List<Integer>nums) {

        Integer min = nums.
                stream().
                distinct().
                reduce((t, u) -> t>u ? u : t).
                get();      //get()==> methodu optional data type'ini Integer'a cevirir.
        System.out.println(min);
    }
    //2.Yol
    public static void getMinValue2(List<Integer>nums) {

        Integer min = nums.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).  //Comparator.reverseOrder()==> tersten siralamak icin boyle yazildi
                reduce((t, u) -> u).
                get();      //get()==> methodu optional data type'ini Integer'a cevirir.
        System.out.println(min);
    }
    //3.Yol
    public static void getMinValue3(List<Integer>nums) {

        Integer min = nums.
                stream().
                distinct().
                sorted().     //kucukten buyukge siralamak icin kullandik
                reduce((t, u) -> t).
                get();      //get()==> methodu optional data type'ini Integer'a cevirir.
        System.out.println(min);
    }
    //4.Yol
    public static void getMinValue4(List<Integer>nums) {

        Integer min = nums.
                stream().
                distinct().
                reduce((t, u) -> Math.min(t, u)).
                get();      //get()==> methodu optional data type'ini Integer'a cevirir.
        System.out.println(min);
    }
    //11)Create a method to find the minimum value which is greater than 7 and even from the list
//   12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayiyi bul?

    public static void getMinGreaterThanSevenEven (List<Integer>nums){

        Integer min = nums.stream().filter(t->t>7 && t%2==0).sorted().reduce((t,u)->t).get();
        System.out.println(min);
    }

}
