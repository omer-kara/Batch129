package src;

public class SchoolRunner {
    public static void main(String[] args) {

        School obj = new School();

        System.out.println(obj.IsActivite);
        System.out.println(obj.yil);
        System.out.println(obj.okulIsmi);

        School.okulIsmiYazdir("Start okulu");
        School.yil(2023);

        System.out.println(obj.isActivite(false));

        Calculator.cikarma(12,3);
        Calculator.cikarma(19,6);

        MethodCreation01.bolme(12,87);
    }
}
