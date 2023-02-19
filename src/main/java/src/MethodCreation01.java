package src;

public class MethodCreation01 {

  public static void hosgeldinizSSgDersleri(){
      System.out.println("degerli arkadaslar SSG dersimize Hosgeldiniz");
  }

  public static void isimVeSozIsim(String isim, String soyIsim){
    System.out.println(isim + " "+ soyIsim);
  }

  public static void bolme(int a, int b){
    System.out.println("iki sayinin bolme yapiniz" + (a/b));
  }

    public static void main(String[] args) {

      hosgeldinizSSgDersleri();

      isimVeSozIsim("ahmet", "ali");


    }

}
