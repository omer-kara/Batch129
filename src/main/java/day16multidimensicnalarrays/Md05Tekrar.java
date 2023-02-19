package day16multidimensicnalarrays;

public class Md05Tekrar {

    public static void main(String[] args) {

        int a [][] = {{2, 5},{4, 7, 11}};
        int carpim=1;

    for (int [] w: a){

        for ( int k : w){

            carpim = carpim * k;
            k++;
        }


    }
        System.out.println(carpim);

     }
}
