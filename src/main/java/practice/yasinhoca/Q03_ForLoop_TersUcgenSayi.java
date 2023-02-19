package practice.yasinhoca;

public class Q03_ForLoop_TersUcgenSayi {

    /*
        Şekli Yazdırınız:
          1 2 3 4 5 6
           2 3 4 5 6
            3 4 5 6
             4 5 6
              5 6
               6
    */



    public static void main(String[] args) {//Satir kotrolu
        for (int i =1 ; i<=6 ; i++){

            for (int bosluk =1 ; bosluk<i ; bosluk++ ){
                System.out.print(" ");

            }
            for (int j = i;  j<=6; j++) {//Sutun kontrolu

                System.out.print(j+ " ");
            }
            System.out.println();
        }

    }
}
