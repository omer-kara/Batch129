package day11forloop;

public class ForLoop01 {

    public static void main(String[] args) {

        //Ex1: Verilen bir String de ilk 'a' harfinden onceki tum characteri leri console yazdiriniz.

        //I love Java==> "I love J"

        String s = "I love Java";

        for(int i =0 ; i<s.length()  ; i++){

            if(s.charAt(i)=='a'){   //Character "a" degilse yazdir onu diyoruz
                break;  //ilk "a" yi gorursen loop u kir dedik
            }

            System.out.print(s.charAt(i));//I love J
        }

        System.out.println();

        //Ex 2: Verilen bir stringte son a dan sonraki tum characterleri ters sirada yazdiriniz.
        // Germany ==>yn

//        String t = "Germany";
//
//        for (int i =t.length()-1; i>=0 ; i--){
//
//            if (t.charAt(i)=='a'){
//                break;
//
//            }
//            System.out.print(t.charAt(i));
//        }


        String t = "Germany";

        for (int i =t.length()-1 ; i>=0 ; i-- ){
        char ch = t.charAt(i);
            if (t.charAt(i)=='a'){
                break;
            }
            System.out.print(ch);


        }


    }


}
