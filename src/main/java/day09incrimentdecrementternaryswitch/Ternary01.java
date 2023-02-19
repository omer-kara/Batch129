package day09incrimentdecrementternaryswitch;

public class Ternary01 {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        int r1= a<7 ? a++ : ++b;

        System.out.println(r1);//21 false ve ya true gore degisebilir.(b++(20) veya ++b(21))
        System.out.println(a);//10
        System.out.println(b);//21

        //Example 2: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //  -4==> -1*-4     4==>4       0==>0

        int u= -8;
        int k = u<0 ? u*-1 : u;
        System.out.println(k);


        int c = -4;
        int r2 = c<0 ? -1*c : c;
        System.out.println(r2);//4

        //Example 3: Iki sayinin isareti ayni ise bu sayilarin carpan isaretleri
        int m= 5;
        int n= -6;

        Object t= (m>0 && n>0) || (m<0 && n<0) ? m*n : "Farkli isaretli sayilari carpamiyorum";

        Object r3 =(m>0 && n>0) || (m<0 && n<0) ? m*n : "Farkli isaretli sayilari carpamiyorum";

        //Object Java da butun "Non-primitive Data Type" (Class).(int + String) gibi (Object = Adem)
        //Object her Classi hepsinin babasidir. Object classin "parenti"(babasi) yoktur.
        //Farkli data type lari icin ortak bir variable olusturmak istadiginizde data type olarak Object kullanabilirsiniz.
        //Java'da "Object" insanlik aleminde "Hz.Adem" e benzer
        //(Object)Buyuk harfle baslayanlar Non-primitivedir.

        System.out.println(r3);

        //Example $: Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.
        int p = -436;
        int r = Math.abs(p);

        String l= r>99 && r<1000 ? p + "Dogru "  : p +  "Yanlis";

        System.out.println(l);

        String r4 = r>99 && r<1000 ? p + " uc basamaklidir " : p + " uc basamakli degildir ";


        int z =-555;
        boolean r5 = (z>99 && z<1000) || (z>-99 && z<-1000);
        System.out.println(r4);


    }


}
