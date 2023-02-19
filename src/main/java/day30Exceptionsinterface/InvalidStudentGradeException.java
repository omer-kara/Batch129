package day30Exceptionsinterface;

public class InvalidStudentGradeException extends Exception{//InvalidStudentGradeException ==> gecersiz ogrenci notu hatasi

    /*
    1) Kendi application'iniza ozel kurallar olusturmak icin kendi "Exception Classlarinizi" olusturabilirsiniz
    2) Olusturdugunu Exception Classlar i)Compile Time Exception ii) Run Time Exception olabilir.
    3) Compile Time Exception olusturmak icin classinizi parent'i "Exception Classlar" olmalidir.
    4) "Run Time Exception" olusturmak icin class'inizin parenti RunTimeException Class olmalidir.
    5) Kendi olusturdugumuz Exception Classlara "Custom Exception Class" denir
     */
    public InvalidStudentGradeException(String message){// burasi costuroctor

        super(message);

    }
}
