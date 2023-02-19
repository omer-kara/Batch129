package day05typecastingstringmanipulations;

public class StringManipulations01Tekrar {

    public static void main(String[] args) {

        String s= "Java is easy";

        String BuyukHarf = s.toUpperCase();
        System.out.println(BuyukHarf);

        String kucukHarf = s.toLowerCase();
        System.out.println(kucukHarf);

        char firstChar = s.charAt(0);
        System.out.println(firstChar);

        char secandChar = s.charAt(1);
        char secondLastChar = s.charAt(10);

        System.out.println(secandChar + " " + secondLastChar);

        int sLenght = s.length();
        System.out.println(sLenght);

        String sub1 = s.substring(0,4);
        System.out.println(sub1);

        String sub4 = s.substring(8);
        System.out.println(sub4);

        boolean isExist = s.contains("money");
        System.out.println(isExist);

        boolean isExist1 = s.contains("is");
        System.out.println(isExist1);

        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        boolean isStart1 = s.startsWith("i", 5);
        System.out.println(isStart1);



    }
}
