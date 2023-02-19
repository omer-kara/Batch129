package practice.practice11.abstraction_alan_hesaplama_Tekrar;

public class AbstractionRunner {

    public static void main(String[] args) {
        //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)

        Dikdortgen dikdortgen = new Dikdortgen();
        System.out.println(dikdortgen.alanHesapla(5,4));

        Ucgen ucgen = new Ucgen();
        System.out.println(ucgen.alanHesapla(7, 4));
    }


}
