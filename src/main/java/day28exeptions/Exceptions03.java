package day28exeptions;

public class Exceptions03 {
    public static void main(String[] args) {


        String s = "Java";
        getCharFromString(s, 2);//v
        getCharFromString(s, 4);//String index out of range: 4==> range ==> aralik demek

    }
    // Stringlerde var olmayan index'ler kullanildiginda Java StringIndexOutOfBoundsException atar
    public static void getCharFromString(String s, int idx){

        try {
            char ch = s.charAt(idx);
            System.out.println(ch);

        }catch (StringIndexOutOfBoundsException e){//StringIndexOutOfBoundsException==> aralikta olamayan index hatasi var demek
            System.out.println("Olmayan index kullanma hatasi yaptiniz..." + e.getMessage());
            System.out.println("e.getCause() = " + e.getCause());//Cause ==> Hatanin sebebini soyler, null
            e.printStackTrace();//Hatanin tumunu gosterir

        }

    }

}
