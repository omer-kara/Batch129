package day28exeptions;

public class Exceptions05 {
    public static void main(String[] args) {
        int a = 16;
        int b = 2;
        String s = "My Java";
        getCharFromString(s, a, b);


    }

    //Try kisminda birden fazla Exception olusturma ihtimali olan code varsa, coklu catch kullanabilirsiniz.
    //Coklu catch kullandiginiz da Exceptions Class arasinda "parent - child" iliskisi yoksa Catch lerin sirasi
    // onemli degildir. Ama code'daki siralamaya uymak tavsiye edilir.
    //Coklu catch kullandiginiz da Exceptions Class arasinda "parent - child" iliskisi varsa Catch lerin sirasi
    // onemlidir. Child olan Class ustte olmalidir.

    //Exception Class'lar arasinda "parent - child " iliskisi varsa, ya child class'i uste yazarak child ve parent class'lar
    //veya child'i hic kullanmaz sadece parent ile Exception'lari handle etmeye calisirsiniz( Hirsi icin 911# hasta icin 911 gibi)

    public static void getCharFromString (String s, int a, int b){

        try {
            int idx = a/b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero");

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandiniz");
        }


    }
}
