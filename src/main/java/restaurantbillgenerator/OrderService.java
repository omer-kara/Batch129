package restaurantbillgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//10-Order islemler
public class OrderService {
    Scanner input = new Scanner(System.in);
    List<Order> orderList = new ArrayList<>();

    //11-Siparis olusturma
    public void createOrder(DishService dishService){
        int dishCode;
        do {
            System.out.println("Lütfen ürün kodu giriniz:(ÇIKIŞ için 0 giriniz.) ");
            dishCode=input.nextInt();//code ile ürünü bulmamız gerekiyor--->12
            if(dishService.findByDishCode(dishCode)!=null){
                Dish dish=dishService.findByDishCode(dishCode);
                System.out.println("Adet giriniz:");
                int number=input.nextInt();
                //bu yemek daha önce sipariş edilmiş mi--->13
                Order order;
                if (findByOrderByDish(dish)!=null){
                    order=findByOrderByDish(dish);
                    order.numOfDish+=number;
                    order.setPrice();
                }else {
                    order = new Order(dish, number);    //orderCode:otomatik
                    order.setPrice();
                    this.orderList.add(order);
                }
            }
            //Siparis olusturma altta sparis listesinde goruntuleme-->14
            listOrders();

        }while(dishCode!=0);}



    //14:siparisleri listele
    private void listOrders() {
        this.orderList.
                forEach(order-> System.out.printf("Siparis Kodu:%-5s  Lezzet Kodu:%-4s  Lezzet adi:%-15s Adet:%-2s\n",
                        order.orderCode,order.dish.getCode(),order.dish.getName(),order.numOfDish));
    }

    //13-dish bilgisi ile siparis bulma
    private Order findByOrderByDish(Dish dish){
for (Order order: this.orderList){
    if (order.dish.equals(dish)){
        return order;
    }

}
return null;

    }
    //15-siparis iptali
    public void deleteOrder(){
        System.out.println("Iptal etemek istediginiz siparisin kodunu giriniz:");
        int code= input.nextInt();
        boolean isValid = false;
        for (Order order:this.orderList){
            if (order.orderCode==code){
                System.out.println("Iptal etmek istediginiz miktari giriniz");//3 urfa istedi
                int num=input.nextInt();//2 iptal

                if (order.numOfDish>num){
                    order.numOfDish-=num;
                    order.setPrice();
                    System.out.println("Siparis iptal edildi"+order.dish.getName());;

                }else if (order.numOfDish==num){
                    this.orderList.remove(order);
                    System.out.println("Siparis iptal edildi"+order.dish.getName());;
                }else {
                    System.out.println("Hatali giris!");
                }
                isValid=true;
                break;
            }else {
                isValid=false;


            }
        }
        if (!isValid){
            System.out.println("Siparis kodu gecersiz!");
        }
    }
    //16-hesabi olusturma
    private void printBill(){
        double total=0;
        System.out.println("         Lezzet Fisiniz         ");
        for (Order order : this.orderList){
            System.out.printf("Siparis Kodu:%-6s Lezzet Kodu:%-4s Lezzet adi:%-15s Adet%-2s Tutar:%-6s Lira\n",
            order.orderCode,order.dish.getCode(),order.dish.getName(),order.numOfDish,order.orderPrice);
            total+=order.orderPrice;
        }
        System.out.println("Toplam Tutar:" + total);
        System.out.println("Afiyet olsun...");
        this.orderList.clear();
    }

}
