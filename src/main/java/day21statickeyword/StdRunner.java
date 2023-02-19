package day21statickeyword;

import java.util.List;

public class StdRunner {
    public static void main(String[] args) {

        //stdName static oldugundan, ona ulasmak icin object olusturmadim
        //Sadece class ismini kullanmak yeterlidir.
        System.out.println( Student.stdName);
                            //sinif ismi + onject ismi==> burdan aliyor


        //age non-static oldugundan ona ulasmak icin object olusturmak zorundayiz.
        Student std1 =new Student();//bu object
        System.out.println(std1.age);

        Student std2=new Student();

        String initials =Student.getInitials("Tom Cruise");
        System.out.println(initials);//TC(Bas harfleri aldi)

        int vowels = std1.countVovels("Tom Cruise");
        System.out.println(vowels);//4(sesli harfleri saydi)


        //static olanlari object ile cagirmak tavsiye edilmez.
        String s = std1.getInitials("Ali Can");
        System.out.println(s);


        //kisa yol List olusturma
        List<String>names = List.of("Ali", "Veli", "Can", "Kemal");
        System.out.println(names);

    }
}
