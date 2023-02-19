package day22staticblocksconstructors;

import java.security.PublicKey;

/*
Constructer nedir?
Clas'dan object uretmemize yarayan code blocklaridir.

Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
Ama bu constructer gozle gorulmez, gozle gorulmeyen otomatik olarak java tarafindan verilen bu constructor'lara
"default constructor"lar "Car(){}" seklindedir.

Siz kendi constructor'inizi olusturdugunuzda Java default constructor'i siler.

Bir class"da farkli parametreler kullanarak istediginiz kadar constructer olusturabilirsiniz.

Farkli constructor'lar sayesinde bir class'dan farkli farkli objectler olusturabilirsiniz.

Interview Sorusu : Method ile Constructor'in farki var midir? Varsa nedir?
Cevap:             Method ile constructor farkli yapilardir.
                   i)Method'larda return type vardir ama constructor'larda return type yoktur
                   ii)Method'larin ismi yaptiklari ise gore developer'lar tarafindan belirlenir.
                      Constructor'larin ismi ise her zaman Class ismi ile ayni olmalidir.

 */
public class Car {
    String make = "Honda";
    String model ="Accord";
    int year = 2023;
    boolean hybrid = true;

    public Car(String make, String model, int year, boolean hybrid){
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;
    }
    Car(String make, String model) {
        this.make = make;
        this.model = model;
        if (year==2023){
            this.year=0;
        }
        if (hybrid==true){
            this.hybrid=false;
        }
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
