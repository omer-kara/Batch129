package Day14arraysforeachloop;

import java.util.Arrays;

public class Arrays04Tekrar {

    public static void main(String[] args) {

        //Ex 1: String bir array olusturunuz. 6 eleman ekleyiniz yellowdan onceki elemanlari yazdiriniz.

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blau";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";


        for (String w : colors){
            if (w.equals("Yellow")){
                break;
            }


            System.out.println(w);

        }
        //Ex 2: String bir array olusturunuz. 6 eleman ekleyiniz yellowdan sonraki elemanlari yazdiriniz.

        String color[] = new String[6];
        color[0] = "Red";
        color[1] = "Orange";
        color[2] = "Blau";
        color[3] = "Yellow";
        color[4] = "Green";
        color[5] = "Brown";

        for (int i= color.length-1 ; i>=0 ; i--){

            if (color[i].equals("Yellow")){
                break;

            }
            System.out.println(color[i]);

        }
        //2.Yol:
        // Yellow elemanin index ini bulunuz ve o index ten daha buyuk index e sahip olan elemanlari yazdir.

        int counter =0;
        for (String w: color ) {

            if (w.equals("Yellow")){
                break;
            }

            counter++;
        }

        for (int i=counter+1; i<color.length ; i++){
            System.out.println(color[i]);
        }

    }
}
