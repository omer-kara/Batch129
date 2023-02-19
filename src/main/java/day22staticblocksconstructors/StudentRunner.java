package day22staticblocksconstructors;

public class StudentRunner {

    public static void main(String[] args) {
        Student std1 = new Student("Ali Can", 13, 7,"AC13G7", "istanbul");

        Student std2= new Student("Tom Hanks", 21,"TH2112" );

        System.out.println(std1);//Student{name='Ali Can', age=13, grade=7, stdId='AC13G7', address='istanbul'}
        System.out.println(std2);//Student{name='Tom Hanks', age=21, grade=0, stdId='TH2112', address='null'}

    }


}
