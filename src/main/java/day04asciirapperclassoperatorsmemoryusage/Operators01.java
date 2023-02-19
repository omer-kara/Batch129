package day04asciirapperclassoperatorsmemoryusage;

public class Operators01 {
    public static void main(String[] args) {

        /*

        1) +,-,*,/ islemleri Java'da matematik te kullanildigi gibi kullanilir.
        Note 1: int/ int ==> int olur
        Note 2: double + int ==> double olur. Cunku; Java'da matematiksel islemlerde farkli data typeleri kullanilirsa sonuc buyuk data type inda olur.

        2)Java'da "logical operator" lar vardir.
        AND ve Or islemleri "logical operator" lardir.

        I)
            AND isleminden "true" alabilmak icin hersey true olmalidir.
            AND islemi "perfectionist" dir.
            And isleminde bir tane false sonucu false yapar.

        II)
            OR isleminde bir tane true sonucu true yapmaya yeter.
            OR isleminde sonucunun false olmasi icim hersey false olmalidir.
            OR islemi "polyana" gibidir.

        III)
            NOT Operatoru (! true olani false, false olani true yapar.
            !true = false
            !false = treu
            !!true = true

        3)Comparison (Karsilastirma) Operators
        <, >, <=, >=, ==, !=

        Note : Karsilastirma operatorlerini kullandiginizda kesinlikle (treu veya false) alirsiniz.

        Note : Biz AND islemi icin "&&" kullaniriz ama "&" kullanimda gecerlidir.
        Farklari nelerdir?
         "&&" kullanim ilk ifade "false" oldugunda digerlerini kontrol etmez dolayisiyla hizli calisir.
              "&" kullanim ilk ifade ne olursa olsun digerlerini kontrol eder dolayisiyla yavas calisir.
              Bu yuzden biz hep "&&" kullaniriz.


         */
        boolean first = 3<5;
        boolean second = 2+3 !=5;
        boolean third = 2+3*5 >= 19;


        System.out.println(first + " - " + second + " - " + third);
        System.out.println(first && second);

        System.out.println(first || second || third);

    }
}
