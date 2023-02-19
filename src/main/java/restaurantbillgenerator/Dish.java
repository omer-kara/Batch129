package restaurantbillgenerator;
//3
public class Dish { //Dish ==> yemekler
    //yiyeceklerin fiyatlarini okusun ancak degistirilemesin

    private int code;   //yiyeceklerin codu
    private  String name;   //yiyeceklerin ismi
    private double price;   //yiyeceklerin fiyati

    //yiyecekler olusturulurken ozellikler set edilsin

    public Dish(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    //dish objesini yazdirmak icin

    @Override
    public String toString() {
        return "Dish{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
