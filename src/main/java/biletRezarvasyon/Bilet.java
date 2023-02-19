package biletRezarvasyon;

public class Bilet {

    //mesafe, yolculuk tipi, fiyat, koltuk no

    public double distance; //mesafe
    public int typeNo;  //yolcuku tipi
    public double price;      //fiyat
    public int seatNo;  //koltuk no

    //5- bileti yazdiralim
    public void printBilet(Bus bus){

        System.out.println("Toplam tutar: " + this.price);
        System.out.println("---Bilet Detayi----");
        System.out.println("Otobus plaka: " + bus.numberPlate);
        System.out.println("Mesafe : " + this.distance);
        System.out.println("Yolculuk tipi : " + (this.typeNo==1 ? "tek Yon" : "Gidis - Donus"));
        System.out.println("Koltuk No : "+ this.seatNo);
        System.out.println("Keyifli yolculuklar dileriz");

    }
}
