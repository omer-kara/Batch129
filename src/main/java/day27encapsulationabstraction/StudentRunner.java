package day27encapsulationabstraction;

public class StudentRunner {

    public static void main(String[] args) {
        Student mySdt = new Student();

        //Student 1
        System.out.println(mySdt.getStdId());
        System.out.println(mySdt.getGpa());
        System.out.println(mySdt.isPoor());

        //Student 2
        mySdt.setStdId("TH123");
        mySdt.setGpa(4.0);
        mySdt.setPoor(false);
    }
}
