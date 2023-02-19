package day29exceptions;

public class Exceptions01 {

    public static void main(String[] args) {
        Object obj =70;
        String str = "";

        try {

            //Birbirine donusturulemecek date typelerini donusturmekte israr ederseniz, ClassCastException atar.
            str =(String)obj; //ClassCastException(class kesme hatasi)

            System.out.println(str);
        }catch (ClassCastException e){
            System.out.println("Her data type i her data type'ine cevrilmez ");
        }

    }


}
