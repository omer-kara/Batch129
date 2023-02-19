package Day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Ex 2: Interger array olusturunuz, icine 6 tane elemen yerlestiriniz,
        //      bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        Integer ages[] = new Integer[6];

        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;

        System.out.println(Arrays.toString(ages));//[20, 23, 19, 44, 15, 32]


        //Sort methodu array daki elemanlari kucukten buyuge dizer
        //Arrays.sort(ages);//sort sirala demektir

        //System.out.println(Arrays.toString(ages));

        //System.out.println(ages[0] + ages[ages.length-1]);//59 ==> (15 + 44 =59)

        //2.Yol:

        int minimum = ages[0];
        int maximum = ages[0];

        for (int w:ages){

            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);

        }
        System.out.println(minimum);
        System.out.println(maximum);

    }
}
