package day05typecastingstringmanipulations;

public class StringManipulations02Tekrar {

    public static void main(String[] args) {

        String s = "Learn Java eran money";

        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        String s1 = s.replace("money", "dollar");
        System.out.println(s1);

        String s3 = s.replace("a", "*");
        System.out.println(s3);

        String s4 = s.replace("a", "xxx");
        System.out.println(s4);

        String s5 = s.replace("e", "");
        System.out.println(s5);

        String t = "Ali 13 yasindadir!...";

        String wecselnAlleZAhle = t.replaceAll("[0-9]", "");
        System.out.println(wecselnAlleZAhle);

        String s6 = t.replaceAll("[a-zA-Z]", "!");
        System.out.println(s6);

        String s7 = t.replaceAll("[eaiouAEIOU]", "?");
        System.out.println(s7);

        String s8 = t.replaceAll("[^a-z]", "<>");
        System.out.println(s8);

        String s9 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(s9);

        String s10 = t.replaceAll("[^ ]", "-" );
        System.out.println(s10);


    }
}
