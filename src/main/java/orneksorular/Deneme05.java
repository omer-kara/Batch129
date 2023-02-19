package orneksorular;

public class Deneme05 {

    String name = "Emily";
    int age = 20;

    Deneme05(String name, int age) {

        this.age = 24;
        System.out.println(age);//25 ???
        System.out.println(name);//oliver

    }

    public static void main(String[] args) {
        Deneme05 obj = new Deneme05("oliver", 25);
        System.out.println(obj.age);//24
        System.out.println(obj.name);//emily
    }
}
