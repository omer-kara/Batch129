package day10switchloops;

public class Loops02 {
    public static void main(String[] args) {

        //Ex 1: 21 den 180 e kadar hem 4 hemde 6 ile bolunebilen tum tam sayilari ekrama yazdiran kodu yaziniz.

        for (int i= 21 ; i<181 ; i++){
            if(i%4 ==0 && i%6==0) {
                System.out.print(i +" ");
            }
        }
        System.out.println();
        //Ex 2: Size verilen kucuk harfle yazilmis String in index'i cift sayi olan characterlerini buyuk harf yapiniz
        //      ankara   ==> AnKaRa
        //Note: Yazdiginiz code belli senoryalar icin calisiyor tum senaryolar icin calismiyorsa bu kod lara Hard "code" denir.
        // "Hard code" yanlis yazilmis koddur. mutlaka duzeltilmelidir.
        //Note: Bir String te son "index = lenght () -1" her zaman

        String s ="ankara";
        //index degeri i=0 olmalidir

        for (   int i=0    ; i<s.length()       ;   i++    ){

            String ch =s.substring(i, i+1);
        //substring (alt dizi) i'yi alma bunun ustunde ki sayiyi al demektir.(Hamburger = substring (4, 8) (urge) olur )

            if(i%2==0){
                System.out.println(ch.toUpperCase());
            }

        }






    }
}
