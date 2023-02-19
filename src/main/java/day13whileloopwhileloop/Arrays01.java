package day13whileloopwhileloop;

import java.util.Arrays;

public class Arrays01 {//dizi demek
    public static void main(String[] args) {

        int a=12;  //Bu yapinin icinde sadece 1 tane data depolanabilir, ama biz kod yazarken bir yapinin icinde
        // coklu data demolamak isteriz. Bir yapinin icinde coklu data depolayabilme icin "Array" yapisini olusturulmustur.

        //Array nasil olusturulur?
        //Kac elelman koyacaginizi yazmalisiniz
        //toString ==> adresten stdNames buldurur.

        //Array olusturmak icin Array elemenlarinin "data Type" i ve "eleman sayisi" mutlaka yazilmalidir.
        String stdNames [] =new String[5];

        //Array konsola nasil yazdirilir
        //toString metadhudunu kullanmadan sadece array ismi ile yazdirirsaniz Java o Array in adresini yazdirir.
        System.out.println(Arrays.toString(stdNames));//[null, null, null, null, null]

        //Array elaman ekleme nasil yapilir.

        stdNames[2] = "Ajda";
        stdNames[0] ="Cuneyt";
        stdNames[1] ="Kemal";
        stdNames[3] ="Ezel";
        stdNames[4] ="Besir";
        System.out.println(Arrays.toString(stdNames));

        //Array den spesific bir elamani almak
        System.out.println(stdNames[2]);

        //Ex 1: Array daki her elemani sonuna "!" isareti koyarak ekrana yazdiriniz.

        for (int i =0; i<stdNames.length ; i++){

            System.out.println(stdNames[i] +"!");

        }



    }
}
