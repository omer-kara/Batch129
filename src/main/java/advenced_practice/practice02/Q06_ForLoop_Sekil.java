package advenced_practice.practice02;

public class Q06_ForLoop_Sekil {
    /*
		Şekli Yazdırınız:
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        */
    public static void main(String[] args) {
        char ch ='A';
        for (int i=0; i<6 ;i++){//Satir sayisini olusturyor

            for (int j=0; j<=i ; j++){//Bu satiridaki karakter sayisini artiriyor
                System.out.print((char)(ch+i)+" "); /*

        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        */

            }

            System.out.println();
        }
    }
}
