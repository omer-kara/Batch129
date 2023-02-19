package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01Tekrar {
    public static void main(String[] args) {
        //Example 1: Integer bir List olusturunuz
        //           List'e 5 tane eleman ekleyiniz
        //           Bu elemanlardan 12'yi siliniz.

        List<Integer> sehir = new ArrayList<>();

        sehir.add(55);
        sehir.add(103);
        sehir.add(12);
        sehir.add(98);
        sehir.add(23);

//        Integer nonPrimitivive = 12;
//        sehir.remove(nonPrimitivive);

        sehir.remove((Integer) 12);

        //sehir.remove("12");
        //sehir.remove(2);
        System.out.println(sehir);


        List<Integer> silinecekler = new ArrayList<>();

        silinecekler.add(23);
        silinecekler.add(55);

        sehir.removeAll(silinecekler);

        System.out.println(sehir);



    }
}
