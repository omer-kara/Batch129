package day02datatypesmethodcreation;

public class MethodCreation01 {
    /* Java`da Method nasil yazilir?

    1) main methodùn disinda olusturulur.
    2)Access Modifier + Return Type + Method Ismi +()

    // Olusturulan method nasil kullanilir
        1) main method un icinden kullanilir
        2) Methodun ismini + () yazin
        3)Islem yapacaginiz sayilari parantezin icinde koyun
     */
    public static void main(String[] args) {
    int sonuc = add (30, 50);

        System.out.println(sonuc);

        long carpmaSonucu = multiply(3,6);
        System.out.println(carpmaSonucu);

        int ucluSonuc = firstTwoMultiplyThirdAdd(2,5,8);
        System.out.println(ucluSonuc);

       double kup = getCube(5);

        System.out.println(kup);

        int dikAlan = dikdörtgen(5, 20);
        System.out.println(dikAlan);

        int dikdörtgenCevre = perimeterOfRechtangle(5,20);
        System.out.println(dikdörtgenCevre);

        double ucgenCevresi = thePerimeterOfTheTriangle(3.14,6);
        System.out.println(ucgenCevresi);

        double ucgenAlani = areaOfTriangle(3.14, 7 );
        System.out.println(ucgenAlani);

    }

    public static int add (int a, int b) {
       return a+b;
    }
    protected static long multiply (int a, int b){
        return a*b;
    }
private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
        return a*b+c;
}
//Access modifeir ä default yapmak access modifeir i yazmayin!
static double getCube(double a){
        return a*a*a;
}

public static int dikdörtgen(int a, int b) {
        return a*b;}

    protected static int perimeterOfRechtangle(int a, int b){
        return 2*(a+b);    }

    public static double thePerimeterOfTheTriangle(double a, double b){
        return 2*a*b;   }

    private static double areaOfTriangle(double a, double b){
        return a*(b*2);    }
}

