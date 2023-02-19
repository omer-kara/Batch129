package mentorCalismasi;

public class Runner {
    public static void main(String[] args) {
        Fahrrad myFahrrad = new Fahrrad();

        System.out.println(myFahrrad.model);
        System.out.println(myFahrrad.fiyat);

        myFahrrad.hiz();
        myFahrrad.kalite();

    }
}
