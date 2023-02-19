package practice.practiceDTNT;

public class C02_IncrementDecrement {

    public static void main(String[] args) {

        int x=15;
        int y=x--;

        System.out.println("x= " + x);//14
        System.out.println("y: "+ y);//15

        int m=21;
        int n=++m;

        System.out.println("m= " + m);//22
        System.out.println("n: "+ n);//22

        int t=32;
        int u=--t;

        System.out.println("t= " + t);//31
        System.out.println("u: "+ u);//31
    }
}
