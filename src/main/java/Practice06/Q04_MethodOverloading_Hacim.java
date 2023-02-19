package Practice06;

public class Q04_MethodOverloading_Hacim {
    //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir kod yaziniz.(Method overloading kullanınız)
    //Method overloading==> ayni isimimli islemleri ayni metod ile yapmak

    public static void main(String[] args) {
        Hacim obje = new Hacim();
        int kupunHacmi = obje.hacimHesapla(5);
        System.out.println("kupunHacmi = " + kupunHacmi);
        
        int karaPrizmeninHacmi = obje.hacimHesapla(5, 4);
        System.out.println("karaPrizmeninHacmi = " + karaPrizmeninHacmi);

        int dikdortgenPrizmaninHacmi = obje.hacimHesapla(2,3,4);
        System.out.println("dikdortgenPrizmaninHacmi = " + dikdortgenPrizmaninHacmi);
        
        int kupunHacmi2 = obje.hacimHesapla(2);
        System.out.println("kupunHacmi2 = " + kupunHacmi2);
    }
}
