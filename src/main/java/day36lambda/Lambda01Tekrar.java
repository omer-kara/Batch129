package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01Tekrar {
    public static void main(String[] args) {

        //1)Creat a methot to find the of the elements greater than 5, distinct, in reverse order in a list
        //1)Bir listede 5'ten büyük, farklı, ters sırada elemanları bulmak için bir yöntem oluşturun

        List<Double> myList = new ArrayList<>();

        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);

        List<Double> half = getHalfOfElemantGreaterThanFiveDistinctReversed(myList);
        System.out.println(half); //[19.2, 13.4, 6.0, 3.5]

                List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jhon");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");

        printAllAlphabeticallyUpperDistinct(list);
        System.out.println();
        printAllAlphabeticallyLowerDistinct(list);
        System.out.println();
        printAllSortWithLenghtUpperDistinct(list);
        System.out.println();
        printAllSortWithLastCharUpperDistinct1(list);
        System.out.println();
        printAllSortWithLastCharUpperDistinct2(list);
        System.out.println();
        printAllSortWithLenghtUpperDistinctSameLeghtInAlphaticalOrder(list);
        System.out.println();
//        System.out.println(removeElementIfTheLeghtGreaterThanFive(list));
//        System.out.println(removeElementIfStartsWithAorEndsWithd(list));
        System.out.println();
        System.out.println(printLeghtSquare(list));
        System.out.println();
        System.out.println(printElementsLenghtEven(list));


    }
    //1)Creat a methot to find the of the elements greater than 5, distinct, in reverse order in a list
    //1)Bir listede 5'ten büyük, farklı, ters sırada elemanları bulmak için bir yöntem oluşturun
    public static List<Double> getHalfOfElemantGreaterThanFiveDistinctReversed(List<Double> myList){
        return myList.stream().
                distinct().
                filter(t-> t>5). map(t-> t/2).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
    }
    //2) Tum List elemanlarini buyuk harfle afbetic sirada tekrarsiz olarak yazdiriniz
    public static void printAllAlphabeticallyUpperDistinct(List<String> list){
    list.
            stream().
            distinct().
            map(t-> t.toUpperCase()).   // String'i Buyuk harfe cevirdik
            sorted().
            forEach(t-> System.out.print(t + " ")); //AJDA ANGELİNA BRAD CUNEYT JHON TOM

    }
    //3) Tum List elemanlarini kucuk harfle afbetic siranin tersine tekrarsiz olarak yazdiriniz

    public static void printAllAlphabeticallyLowerDistinct(List<String> list){
        list.
                stream().
                distinct().
                map(t-> t.toLowerCase()).
                sorted(Comparator.reverseOrder()).
                forEach(t-> System.out.print(t + " ")); //tom jhon cuneyt brad angelina ajda
    }
    //4) Tum List elemanlarini buyuk harfle uzunluklarina artan sirada tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLenghtUpperDistinct(List<String> list) {
        list.
                stream().
                distinct().
                map(t-> t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).    //Harflerin uzunluguna gore siraliyor
                forEach(t-> System.out.print(t + " ")); //TOM JHON AJDA BRAD CUNEYT ANGELİNA
    }
    //5) Tum List elemanlarini buyuk harfle, son harflerine gore artan sirada, tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLastCharUpperDistinct1(List<String> list) {
        list.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).    //Son characteri almak icin yaziyoruz
//                sorted(Comparator.reverseOrder()).
                forEach(t-> System.out.print(t + " ")); //AJDA ANGELİNA BRAD TOM JHON CUNEYT
    }
    //tersten yazdirdik
    public static void printAllSortWithLastCharUpperDistinct2(List<String> list) {
        list.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(Utils::getLastChar).reversed()).    //Son characteri almak icin yaziyoruz
                // ve reverse() methodu Stringi ters cevirdi.
                forEach(Utils::printInTheSameLineWithSpace); //CUNEYT JHON TOM BRAD AJDA ANGELİNA
    }
    //6) Tum List elemanlarini buyuk harfle uzunluklarina artan sirada tekrarsiz olarak yazdiriniz
    //Uzunluklari ayni olan elemalar alfabetik sirada olsunlar.
    public static void printAllSortWithLenghtUpperDistinctSameLeghtInAlphaticalOrder(List<String> list) {
        list.
                stream().
                distinct().
                map(String::toUpperCase).   ////String::printAllSortWithLenghtUpperDistinct yapisina "method reference" denir ==> buyuk harfe donusturduk
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).  //Uzunluklarina gore dizmek
                forEach(System.out::println);

    }
    //7)Character sayisi 5 ten fazla olan elemanlari siliniz ve sonucu list olarak yazdiriniz
//    public static List<String> removeElementIfTheLeghtGreaterThanFive(List<String> list){
//        list.               //Dikkat : burda stream() methodu kullanilmadi!!!!
//                removeIf(t-> t.length()>5); //Bir elemani belli sarta gore silmek istiyorsaniz RemoveIf() kullanilir
//        return list;    //[Tom, Jhon, Ajda, Tom, Brad]
//    }
    //8) "A" ile baslayan veya "d" ile biten elemanlari siliniz

    //Bazen "Strema()" method'u bize lazim olan methodlara ulasmamiza engel olur bu yuzden
    //stream() methodunu kullanmayiz. "removeif()" methodunda oldugu gibi.

    //Fakat stream() methodunu daha sonradan kullanmamiz gerekebilri. Bu durumda stream() methodunu
    //kullanarak istedigimiz method'lara ulasiriz, distinct() methoduna ulastigimiz gibi.

    //Sonuc bize list olarak lazim ise "collect(Collectors.toList())" ile sonucu list'e ceviririz.

//    public static List<String> removeElementIfStartsWithAorEndsWithd(List<String> list) {
//        list.
//                removeIf(t->t.startsWith("A")|| t.endsWith("d"));
//        return list.stream().distinct().collect(Collectors.toList());    //[Tom, Jhon, Tom, Cuneyt]
//        //Burada ilk once Stream() yaptik sonra List'e gere donduk==>collect(Collectors.toList()   ==> Liste geri cevirdik
//    }
    //9) List elemanlarinin character sayilarinin karelerini aliniz bir List olarak ekrana yazdiriniz

    public static List<Integer> printLeghtSquare(List<String> list){
        return list.
                stream().
                //map(t->t.length()*t.length()).
                map(Utils::getLengthSquare).
                collect(Collectors.toList());    //[9, 16, 16, 64, 9, 16, 36]

    }
    //10) List elemanlarindan character sayisi cift sayi olanlari bir List icinde ekrana yazdiriniz
    public static List<String> printElementsLenghtEven(List<String> list){
        return list.
                stream().
                //filter(t-> t.length()%2==0).    //Characterin uzunluguna bakilacak, cift ise yazdir denilecek
                filter(Utils::isLenghtEven).
                collect(Collectors.toList());   //[Jhon, Ajda, Angelina, Brad, Cuneyt]
    }
}
