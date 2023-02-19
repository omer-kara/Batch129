package day17arraylist;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ArrayList02Tekrar {
    public static void main(String[] args) {

        //Arraylist olustururken sag tarafa Arraylist yazmak zorundasiniz.
        //Ama sol tarafa ister "ArrayList" yazin isterseniz de "List " yazin, ikiside calisir.
        //char ==> Wpapper class "Chareacter"
        List<Character> initials = new ArrayList<>();
        //initials==> bas harfler
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        //Bir Listte kac eleman oldugunu nasil anlariz?

        int numOfElement = initials.size();
        System.out.println(numOfElement);
        char r = initials.get(2);

        //Ex 1: Verilen bir String List'teki elemanlarin toplam karakter sayisini bulan kodu yaziniz.
        List<String>cities = new ArrayList<>();

        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        int k=0;
        for (String  w  : cities) {
            k = k+ w.length();
        }
        System.out.println(k);

        int top = 0;

        for (int i = 0; i < cities.size(); i++) {

            top+= cities.get(i).length();


        }
        System.out.println(top);

        List<Double>salary = new ArrayList<>();

        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary);

        int idx =0;

        for (Double w : salary       ) {

            salary.set(idx,w*1.20);
            idx++;

        }


        System.out.println(salary);

        }
    }

