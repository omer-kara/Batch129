package day16multidimensicnalarrays;

public class Md05 {
    public static void main(String[] args) {

        //Ex 1: Bir multi-dimensional array olusturunuz
        //Bu arraydeki tum elemanlarin carpimini +concole yazdiran codu yazdiriniz

        int a[][] = {{2, 5}, {4, 7, 11}};
        int carim =1;

        for (int [] w:a){

            for (int k : w){

                carim = carim*k;



            }
        }
        System.out.println(carim);
    }
}
