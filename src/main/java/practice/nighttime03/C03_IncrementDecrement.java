package practice.nighttime03;

public class C03_IncrementDecrement {
    public static void main(String[] args) {

        int a = 12;
        int b = a++;//Post Increment(Sonradan artirma)
        System.out.println(b);
        System.out.println(a);
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\
        int x = 15;
        int y = x--;//Post Decrement (Sonradan azaltma)
        System.out.println(x);
        System.out.println(y);
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\
        int m = 21;
        int n = ++m;//Pre Increment (once artir)
        System.out.println(m);
        System.out.println(n);
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\
        int t = 32;
        int u = --t;// Pre Decrement
        System.out.println(t);
        System.out.println(u);
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\

        int sayı = 10;
        sayı++;
        System.out.println(sayı);
        sayı++;
        System.out.println("pre-incrementten once " + sayı);
        System.out.println(" pre-increment satırında " + ++sayı);
        System.out.println("pre-incrementden  sonra" + sayı);

        System.out.println("post-increment satırında" + sayı++);
        System.out.println("post-incrementdan sonra " + sayı);
        System.out.println(9f / 2f);
        System.out.println(9 / 2);

///////// ****************************************** \\\\\\\\\\\\\\\\\\\\

        int num = 15;
        int num2 = num++;
        System.out.println(num2);
        System.out.println(num);

        int sayı1 = 10;
        int sayı2 = 20;
        int sayı3 = 30;

        sayı2 = sayı1++;
        System.out.println(sayı1 + "," + sayı2 + "," + sayı3);

        sayı3 = ++sayı1;
        System.out.println(sayı1 + "," + sayı2 + "," + sayı3);

        System.out.println(sayı3++);

        System.out.println(--sayı2);

        System.out.println(sayı3++);

        System.out.println(sayı3);
    }//main
}
