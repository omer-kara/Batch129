package day30Exceptionsinterface;

public class Exceptions03Tekrar {
    public static void main(String[] args) {

getStudentGrade(120);

getTheNummerOfStudents(-55);

    }
    public static void getStudentGrade(int grade){
        if (grade<0 || grade>100){
            try {
                throw new InvalidStudentGradeException("Students grades cannot be less than zero or greater than 100");
            } catch (InvalidStudentGradeException e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println(grade);
        }

    }
    public static void getTheNummerOfStudents(int numOfStudents){

        if (numOfStudents<0){
            try {
                throw new InvalidNumberException("Student number cannot be negative");
            }catch (InvalidNumberException e){
                System.err.println(e.getMessage());
            }
        }else {
            System.out.println(numOfStudents);

        }
    }
}
