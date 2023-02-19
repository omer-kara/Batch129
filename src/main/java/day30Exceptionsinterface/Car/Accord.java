package day30Exceptionsinterface.Car;//interface==> arayuz demek

public class Accord implements Ac, Engine, Security {//impliment uygula demek
    @Override
    public void coll() {
        System.out.println("Accord cools super");


    }

    @Override
    public void run() {
        System.out.println("Engine runs super");
    }
}
