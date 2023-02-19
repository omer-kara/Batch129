package orneksorular;

import java.util.Scanner;

public class Iskonto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen fiyatini giriniz");
        int fiyat = input.nextInt();

        int sum=0;

        if(fiyat>=150){

            sum = fiyat - (fiyat*10/100);


            System.out.println("150 tl uzeri alis veris yaptiginiz icin %10 iskanto yapildi : "+  sum);

        }else            {

            System.out.println("Iyi gunler tekrar bekleriz" );
        }

    }
}
