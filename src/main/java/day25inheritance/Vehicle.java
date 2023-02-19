package day25inheritance;

public class Vehicle {//Arac demek
/*
    1) Child Class'dan bir object olusturdugunuzda Constructor'lar
    en ustteki parent classdan baslayarak alta dogru calistirir.
    2) Child Clas daki constructordan Parent Class'daki consructor'a gidebilmek icin "Super()" kullanilir.
    3) Parent Class'da birden fazla consructor varsa istenilen constructor, super() ifadesinin parantezi icine yazilan
    parametreleri yardimi ile secilebilir.
    4) Ayni Class icindeki constructorlari secmek icin "this()" kullanilir.
    Ayni Class'da birden fazla costructor varsa istenilen constructor, "this()" ifadesinin parantezi icine yazilan
    parametreler yardimi ile secilebilir.
    5) "super()" ifadesini yazmak istege baglidir, yazmazsaniz da Java sanki "super()" varmis gibi davranir.
     Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
    6) "super()" ve "this()" ifadeleri constructor icinde her zaman ilk satirda olmalidir.
    7) Bir constructor icinde "super()" ve "this()" ifadeleri sadece bir kere kullanilabilir. Bakiniz 6. kurala ...
    8) Inheritance'da variableleri ve method'lari cagirmak icin "this" veya "super" kullanilir.
    "this" ayni class icindeki variableleri ve method'lari cagirmak icin kullanilir.
    "super" parent class icindeki variableleri ve method'lari cagirmak icin kullanilir.
    9) Inheritance'da object kullanarak variable cagirirsaniz, objectin data type'ini temsil eden class'dan
    variable'i aramaya baslayiniz. O classta yoksa parentlere bakiniz.
    10) Inheritance'da object kullanarak method cagirirsaniz, objectin constructor'ini  temsil eden class'dan
    method'u aramaya baslayiniz. O class'ta yoksa parentlere bakiniz.

    OOP Principals:(prensipler)
    1)Inheritance(Miras)
    2)Polymorphism
    3)Encapsulation
    4)Abstraction(Soyutlama)


     */
    public int price = 12000;

    public void engine(){
        System.out.println("Vehicle engine");
    }
    public Vehicle(){
        System.out.println("Vehicle 1");
    }

    public Vehicle(int price){
        System.out.println("Vehicle 2: " + price);
    }
}
