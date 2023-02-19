package day37lambda;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Lambda01Tekrar {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);
        System.out.println(tumSayilarinToplami(myList));
        System.out.println();
        System.out.println(yediYetmis(7, 70));
        System.out.println();
        System.out.println(uctenDokuza(3,9));
        System.out.println();
        System.out.println(faktoryel(5));
        System.out.println();
        System.out.println(ikiTamSayiArasi(20,10));
    }
    public static int tumSayilarinToplami (List<Integer> myList){
        return myList.stream().reduce(Math::addExact).get();    //60
    }
    public static int yediYetmis (int x, int y ){
        return IntStream.rangeClosed(7,70).sum();   //2464
    }
    public static int uctenDokuza(int x, int y){
        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();   //181440
    }
    public static int faktoryel(int x){
        if (x==0){
            return 1;
        } else if (x<0) {
            return -1;
        }else {
            return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();//120
        }

    }
    public static int ikiTamSayiArasi(int x, int y){
        if (x>y){
            int temp=x;
            x=y;
            y=temp;
        }

        return IntStream.rangeClosed(x, y).filter(t->t%2==0).sum();
    }
    public static int tumTamSayilariTopla(int x, int y){
        if (x>y) {
            int temp = x;
            x = y;
            y = temp;
        }
        return IntStream.range(x+1,y).sum();
    }

}
