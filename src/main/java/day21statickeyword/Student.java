package day21statickeyword;

public class Student {


        /*
        1)Static variable veya static methodlar(class member=sinif üyeleri) tum objeler icin ortak elemandir.
        2)Static class member'lar uzerinde yapilan degisiklikler tum degisikliler tum object leri etkiler.
        3)Static class menber'lar Class'a, non-static memberler objectlere monte edilir.
        Mesela bir class'dan 100 tane object olusturdugumuzda non-static olanlar 100 kere olusturulur,
        ama static olanlar object sayisindan bagimsiz olarak bir kere oluturulur.
        4)Static class memberlere ulasmak icin object olusturmaya gerek duyulmaz,
        ama non-static class memberlere ulasmak cin object oluturmak sarttir.
        5)static variablerin diger adi"Class Variable" dir
        non-static Variable diger adi"Instance Variable" veya "Object Variable"dir
                 */

        public static String stdName = "Tom Hanks";//static

        public int age = 13;//non static

        //ogrenci isminin ilk harflerini veren methodu olusturunuz.
        public static String getInitials(String name) {//al ilkharfleri demek
                String first = name.substring(0, 1);//char da alina bilir
                String secend = name.split(" ")[1].substring(0, 1);// name.split(" ")[1].substring(0,1);
                                                                        // ikinci keliyi al kes ve 2 kelimenin
                                                                        // ilk harfini al demek
                return first +secend;

        }

        //Ogrenci ismindeki sesli harfleri (a,e,i,o,u) sayan bir method olusturunuz

        public  int countVovels(String name){

                int counter =0;

                for (int i = 0; i < name.length(); i++) {
                char ch =name.toLowerCase().charAt(i);
                        switch (ch){
                                case 'a':
                                case 'e':
                                case 'i':
                                case 'o':
                                case 'u':
                                        counter++;
                                        break;
                        }
                }
                return counter;
        }
}
