package advenced_practice.practice02;

public class Q04_RandomMethod_RastgeleHarf {
    public static void main(String[] args) {

        /*
        Rastgele bir harf veren bir method oluşturun ve ardından methodu kullanarak aşağıdakileri yazdırınız.
        ‘A’ ve ‘a’ için “İlk Karakter” yazdırınız.
        ‘B’ ve ‘b’ için “İkinci Karakter” yazdırınız.
        ‘C’ ve ‘c’ için “Üçüncü Karakter” yazdırınız.
        ‘D’ ve ‘d’ için “Dördüncü Karakter” yazdırınız.
        Diğerleri için “Diğer Karakterleri” yazdırınız.
        */

        //Oyunlar bunun gibi sayi getirir

        System.out.println( (int)Math.random()*101);//rastgele bir sayi verecek bu (0 ile 1 arasi bir sayi verecek)
                                                    // Basina bir int verirsek tam sayi aliriz
        String rastgeleHarf = rastgeleHarf().toLowerCase();
        System.out.println(rastgeleHarf);

        switch (rastgeleHarf){
            case "a":
                System.out.println("Ilk karakter");
                break;
            case "b":
                System.out.println("Ikinci karakter");
                break;
            case "c":
                System.out.println("Ucuncu karakter");
                break;
            case "d":
                System.out.println("dorduncu karakter");
                break;
            default:
                System.out.println("Diger karakterler");

        }


    }
    public static String rastgeleHarf (){
        String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxIndex =alfabe.length();
        int rastgeleIndex = (int)(Math.random()*maxIndex);

        String rastgeleHarf = alfabe.substring(rastgeleIndex, rastgeleIndex+1);

        return alfabe.substring(rastgeleIndex, rastgeleIndex+1);
    }


}
