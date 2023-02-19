package day23datetimestringbuilder;

public class StringBuilder01Tekrar {
    public static void main(String[] args) {

        //Inmutable
        String s = "String";

        String a ="Money";

        a =a+"More";

        //Mutable

        StringBuilder sb = new StringBuilder("Python");

        sb.append("!").append("?").append(".");
        System.out.println(sb);//Python!?.

        StringBuilder sb2 = new StringBuilder();
        sb2.append("Java");

        sb2.length();//4
        sb2.capacity();//16

        StringBuilder sb3 = new StringBuilder(2);//kapasiteyi biz belirleye biliriz

        sb3.append("Florida");
        System.out.println("sb3.length() = " + sb3.length());//7
        System.out.println("sb3.capacity() = " + sb3.capacity());//7

        sb3.insert(2,"xxxxx");//araya xxler koyar
        System.out.println("sb3 = " + sb3);

        //toString() methodu StringBuilder'i String'e cevirir.
        //Split kullanmak gibi
        sb3.toString().split("l");

        //String i StringBuildere cevirme
        StringBuilder sb4 = new StringBuilder();


        //reverse String i tersten yazdirir.
        sb3.reverse();
        System.out.println("sb3 = " + sb3);

        sb3.deleteCharAt(1);
        System.out.println(sb3);

        sb3.delete(1,6);
        System.out.println(sb3);

        StringBuilder sb5 = new StringBuilder("Java");
        StringBuilder sb6 = new StringBuilder("Java");

        //karsilastirma yapar, arada fark yoksa 0 verir
        //System.out.println(sb5.compareTo(sb6));

        sb6.setCharAt(2, 'm');
        System.out.println(sb6);//Jama

        sb6.replace(1,3,"xyz");
        System.out.println(sb6);//Jxyza
    }
}
