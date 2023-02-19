package day05typecastingstringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        //String bir non - primitive data type dir ve ayni zamanda bir class'dir.
        //String methodlarini ogrenecegiz-

        String s = "Java is easy";

        //Example 1: "s" Stringindeki tum characterleri buyuk harf yapiniz.

        String sUpper = s.toUpperCase();
        System.out.println(sUpper); //JAVA İS EASY

        //Example 2: "s" Stringindeki tum characterleri kucuk harf yapiniz.
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Example 3: "s" Stringindeki ilk character'i aliniz.

        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

        //Example 4: "s" Stringindeki ikinci ve sondan ikinci characterleri aliniz ve ekrana yazdiriniz.
        char secondChar = s.charAt(1);//a

        char secondLastChar = s.charAt(10);//s

        //1.Yol: Ayni sitirda yazdirmak icin.
        System.out.print(secondChar);
        System.out.println(secondLastChar);//as

        //2.Yol: Ayni sitirda yazdirmak icin.
        System.out.println("" + secondChar + secondLastChar);//as

        //Example 5: "s" Stringindeki kullanilan character sayisini bulunuz.
        int sLenght = s.length();
        System.out.println(sLenght);//12

        //Example 6: "s" Stringindeki ilk 4 characteri aliniz.

        //substring (0,4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir.
        String sub1 = s.substring(0,4);
        System.out.println(sub1);

        //Example 7: "s" Stringindeki "is" kelimesini aliniz.
        String sub2 = s.substring(5, 7);
        System.out.println(sub2);

        //Example 8: "s" Stringindeki "easy" kelimesini aliniz.
        String sub3 = s.substring(8, 12);
        System.out.println(sub3);


        //Bir charachter den baslayip Stringin sonuna kadar almak isterseniz ikinci index i almayiniz.
        //s.subString (8, 12); yerine  s.substring(8); yaziniz.
        String sub4 = s.substring(8);
        System.out.println(sub4);

        //Example 9: "s" Stringinde "money" kelimesinin var olup olmadigini kontrol ediniz.
        //contains : icermek demektir.
        //Exist: Mevcut
        //Java buyuk ve kucuk harfe duyarlidir

        boolean isExist = s.contains("money");
        System.out.println(isExist);//false

        /*
        Bir method' u ogrenirken 3 sey mutlaka ogrenir
        i)Bu method ne is yapar?
        ii)Bu method u farkli kullanimlari nasildir?
        iii) Bu method size ne return eder?
        */

        //Example 10: "s" Stringinin belli bir harfle baslayip baslamadigini kontrol ediniz.

        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);//true

        //Example 11: "s" Stringinin 6. character itibaren belli bir harfle baslayip baslamadigini kontrol ediniz.
        //toffset ilk 5 karakteri görme demektir.
        //ogrenci numarasi var. hangi bolunmde okudugunu tespiti gibi:2022(17)002.

        boolean isBegin = s.startsWith("i", 5);
        System.out.println(isBegin);







    }
}
