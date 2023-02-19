package day20passbyvaluemethodoverloadinf;

public class MethodOverloading01 {

    /*
    Method overloadig==> (Yöntem Aşırı Yükleme, (fazla doldurma))
    1) Method overloading yaparken method ismi degistirilmez
    2) Method overloading yaparken parametreler degistirilir
            i)Parametre degistirilirken, parametrelerin data type leri degistirilebilir.
            ii)Parametre degistirilirken,parametrelerin data type leri farkli ise yerleri degistirilebilir.
            iii)Parametre degistirilirken,parametrelerin sayisi degistirilebilir.
     3) Java icin "ismi" ve "parametreleri" ayni olan iki method tamamiyla aynidir.
     Bu yuzden "ismi" ve "parametreleri"("ismi" ve "parametreleri")==> "Method Signature" olarak adlandirilir.
     4)Method Overloading olustururken return type i degistirmenin hicbir etkisi yoktur.
     Method Overloading olustururken access modifier'i degistirmenin hicbir etkisi yoktur.
     Method Overloading olustururken methodu static veya non-static yapmanin hicbir etkisi yoktur.
     Method Overloading olustururken method body'i degistirmenin hicbir etkisi yoktur.

     5)"privite" methodlar overload edilebilir. Cunku method overloading sadece bir class'in icinde olur.
     "private" olmak ise baska class'lara gidildiginde problem olusturur.


     */
    public static void main(String[] args) {

        add(3,5);

    }
// bir suru is tanimladim
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void add(double a, double b){
        System.out.println(a+b);
    }
    public static void add(double a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, double b){
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
