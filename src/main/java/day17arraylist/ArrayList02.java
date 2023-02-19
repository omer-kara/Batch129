package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
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
        int numOfElemant = initials.size();//Listlerin ==>size ==>Eleman sayisi (lenght gibi)

        //Note: Arraylerden bahsederken 'lenght' kullanin, Listlerden bahsederken "size" kullanin.


        //Bir Listten istenen bir eleman nasil alinir?
        //Wpapper class Characteri==> char a cevirir
        char u = initials.get(2);//index ten 3 . charachteri alir.
        System.out.println(u);//M

        //Ex 1: Verilen bir String List'teki elemanlarin toplam karakter sayisini bulan kodu yaziniz.
        List<String>cities = new ArrayList<>();

        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        //1.Yol:Recommended==> Tavsiye
        int sum = 0;
                        //listin ismi kullanilir
        for (String w: cities){

            sum = sum + w.length();
            //cities.get();//get index ile calisir==> getir demek
        }
        System.out.println(sum);//26


        //2.Yol:
        int toplam =0;

        for (int i=0; i<cities.size(); i++){

            toplam = toplam + cities.get(i).length();

        }
        System.out.println(toplam);//26

        //Bir LIstteki istenen bir elemani nasil degistirebiriz?
        // Maimi ==> New York
        cities.set(0, "New York");//replace ==> set oluyor.

        System.out.println(cities);//[New York, Istanbul, Kayseri, Almaty]

        //iscilerin ucretlerini degirtirmek gibi kullanilir. Zam

        //Ex 2 : Maas Liste olusturunuz ve maaslara %20 zam yapiniz.

        List<Double>salary = new ArrayList<>();

        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary);

        //1.Yol:
        int idx = 0;
                            //[19500.25, 8500.75, 32500.5]
        for (Double w : salary){

                salary.set(idx, w*1.20);//set ==> index "0" daki degeri "w*1.20" 1buna cevir demek

                idx++;

        }
        System.out.println(salary);//[23400.3, 10200.9, 39000.6]

        //2.Yol:

        for (int i =0 ; i<salary.size(); i++){

            salary.set(i, salary.get(i)*1.20);//replace == set (Yeni degeri degistir demek)
                                    //(0(get. index degeri), 19.500,25*1,20)
        }
        System.out.println(salary);//[23400.3, 10200.9, 39000.6]


    }
}
