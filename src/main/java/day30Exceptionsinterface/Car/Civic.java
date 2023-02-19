package day30Exceptionsinterface.Car;

/*
1) Bir interface'i bir Classin parenti yapmak icin "implements" keywordunu kaullaniriz
2) Java parentlar "Class" oldugunda "multiple parent" a musade etmez ama biz bazen "multiple parent" a ihtiyac duyariz.
Bu ihtiyaclari gidermek icin Java "interface" ismini verdigini yeni bir yapi olusturdu.
Bu yapi sayesinde bir "Class" icin coklu "interface parent" olusturabiliriz.
3) Coklu interface parent'lerin herbirinin  icine ayni isimli methodlar koyabiliriz
Mesela Ac'nin, Engine'in ve Secury'in iclerine run methodu koymak gibi.
Child Class herhangi birini override ettiginde hepsini override etmis gibi olur,
sonrada Body'i Child Classta yazarak uygulamasini yapmis olur.
 */

public class Civic implements Ac,Engine, Security {
    @Override
    public void coll() {
        System.out.println("Civic cools perfectly");
    }

    @Override
    public void run() {
        System.out.println("Ac runs perfect");
    }
}
