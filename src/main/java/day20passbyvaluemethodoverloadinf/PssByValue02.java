package day20passbyvaluemethodoverloadinf;

public class PssByValue02 {

    public static void main(String[] args) {

        String name = "Tom Hanks";

        String updatedName = updateName(name, "Jr.");

        System.out.println(name);//Tom Hanks
        System.out.println(updatedName);//Tom Hanks Jr.

    }

                                //yazilacak seyi buraya yazilir, ne yapacagi yazilir(Buraya ekle add)
    public static String updateName(String name, String add){

        name = name + " " + add;
        return name;

    }
}
