package day19listsvarargs;

public class Varargs01 {
    public static void main(String[] args) {

        addTwoNumbers(3,5);

        addThreeNumbers(4,7,2);

        add(3,5);//Argument==> (3,5) Method'u cagirirken kullanilan sayilara da "argument" denir.
    }

        //Note : Bir method da 1 den fazla Varargs Parametre kullanilamaz cunku ikincisi "Unreachable Code" olur.
        //Note : Varargs, varargs disindaki parametrelerle kullanilabilir.


    //iki sayiyi toplayan method olusturunuz

    public static void addTwoNumbers(int a, int b){
        System.out.println(a+b);

    }
    public static void addThreeNumbers(int a, int b, int c) {// parametre==> (int a, int b, int c)
                                                            //Method'un parantezleri icine yazilanlara "parametre" denir
        System.out.println(a + b + c);
    }
    //Istediginiz sayida sayiyi toplamak icin bir method olusturunuz

    public static void add( int...a){
        int sum=0;

        for (int w : a){
            sum = sum +w;
        }
        System.out.println(sum);

    }
}
