package day03scanner;

public class RunnerTekrar {

    public static void main(String[] args) {

        CarTekrar mycar = new CarTekrar();

        System.out.println(mycar.fiyat);
        System.out.println(mycar.model);
        mycar.hareket();
        mycar.dur();


        Student tomHanks = new Student();
        System.out.println(tomHanks.name);
        System.out.println(tomHanks.address);
        System.out.println(tomHanks.grade);
        tomHanks.study();
        tomHanks.feed();


    }
}
