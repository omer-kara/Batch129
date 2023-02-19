package day16multidimensicnalarrays;

public class Md06Tekrar {

    public static void main(String[] args) {

        int [] [] a ={{5, 66 },{77 ,6, 88}};

        int small =a[0][0];
        int big =a[0][0];

        for (int [] w : a){
            for (int k: w){

                small = Math.min(small, k);
                big =Math.max(big, k);
            }
        }
        System.out.println(small+big);

    }
}
