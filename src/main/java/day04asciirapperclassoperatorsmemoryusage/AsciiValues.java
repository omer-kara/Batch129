package day04asciirapperclassoperatorsmemoryusage;

public class AsciiValues {

    //Java'da her karekterin sayisal bir degeri vardir.
    //Bu degerler ASCII degerler olarak adlandirilir.
    //Bu degerlerin tamaminin bulundugu tabloya "ASCII Table" denir.

    public static void main(String[] args) {

    //Herhangi bir character'in ASCII degerlerini bulmak icin o karakteri "int" data type'inda bir variable'in icine koyunuz.

        int ch ='A'; //65
        System.out.println(ch);

        int unlem ='!'; //33
        System.out.println(unlem);

        char c1 = 'K';
        char c2 = '?';

        //Java'da char'larin matematiksel islemlerde kullanirsaniz, Java o char'larin ASCII degerlerini kullanir.
        System.out.println(c1 + c2);//138


    }
}
