package practice.nighttime;

public class C02_MethodCreation {
    public static void main(String[] args) {

        //protokol tribunu == static
        //Dikdortgenin alanini heesaplayan kodu yaziniz ve kullaniniz.

        System.out.println("dikdortgenin Alani: " + dikdortgenAlani(10, 5));
        System.out.println("dikdortgenin Cevresi: "+ dikdortgeninCevresi(5,15));
        kareninAlani(25);


    }//main

    /*
            Acccess static dataType methodismi(veraible(parametrele))
            modifier

     */
    public static int dikdortgenAlani(int a,int b){
        return a*b; }

    public  static  int dikdortgeninCevresi (int a, int b){
        return 2*(a+b);

        }

    //Karenin alanini hesaplatan kodu yaziniz.

    public static void kareninAlani (int a){

        System.out.println("Karenin Alani : " + (a*a));
    }

}//class
