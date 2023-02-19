package day37lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda02 {
    /*
                AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
            herhangi bir elemanla eşleşme durumunda true dönecektir.


            AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
            bu şarta uyması durumunda true dönecektir.


            NoneMatch: Şarta göre Stream içindeki hiç bir
            elemanın şartı sağlamaması durumunda true dönecektir.
     */
    public Lambda02() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        //Lambda textFile dosyasi icindeki metni console'a yazdiran kodu yazdiriniz.
        //lines ==> satir demek
        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).forEach(System.out::println);

        //Lambda textFile dosyasi icindeki metni characteri uppercase yapiniz.
        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(String::toUpperCase).
                forEach(System.out::println);

        //3) LambdaTextFile dosyasini icinde herhangibir kelimenin var olu olmadigini gosteren kodu yaziniz
        /*
        //split Array dondurdugu icin "Line" i alip parcalayip "array" icine yazar.Arrayden cikarmak icin  "flatmap()" ile kelimeleri duz yapariz.sonra
    // "Stream"e ceviricek sonra da "anyMatch()" ile herhangi birinin verecegimiz degerle eslesip eslesmedigini kontrol edecek ve true vericek
         */
        boolean result1 = Files.
                            lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                            map(t-> t.split(" ")).  //stream mi parcala demek
                            flatMap(Arrays::stream).    //Array lari dum duz et demek
                            anyMatch(t->t.contains("Java"));    //Herhangi bir kelime Java ise sonuc true olur
        System.out.println(result1);    //true


        //4) LambdaTextFile dosyasini icindeki her kelimenin "a" icerip icermedigini gosteren kodu yaziniz
        boolean result2 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t-> t.split(" ")).
                flatMap(Arrays::stream).
                allMatch(t-> t.contains("a")); // Her kelime a harfini icerirse sonuc true olur, aksi halde false olur.
        System.out.println(result2);    //false

        //5) LambdaTextFile dosyasini icindeki hicbir kelimanin x icermedigi kodu yaziniz
        boolean result3 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t-> t.split(" ")).
                flatMap(Arrays::stream).
                noneMatch(t->t.contains("x"));  //hicbir "x" kullanilmadi mi diye sorduk.
        System.out.println(result3);//true

        //6) LambdaTextFile dosyasini icinde "r" ile biten kelimeleri sayan odu yaziniz.
        //1.Yol
        long result4 = (int) Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t-> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("r")).
                count();    //say demek
        System.out.println(result4);    //3

        //2.Yol==> tavsiye edilmez
        long result5 = (int) Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t-> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("r")).
                collect(Collectors.toList()).
                size();

        System.out.println(result5);    //3
    }


}
