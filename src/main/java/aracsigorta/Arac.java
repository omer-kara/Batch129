package aracsigorta;

import java.util.Scanner;

public class Arac {
    //tipi, primi
    public String type;
    public int prim;

    public void countPrim(int term){
        switch (this.type){         //this.type ==> bu classin type ne bak diyoruz
            case "otomobil":
                this.prim=term==1 ? 2000 : 2500;
                break;
            case "kamyon":
                this.prim=term==1 ? 3000 : 3500;
                break;
            case "Motorsiklet":
                this.prim=term==1 ? 1500 : 1750;
                break;
            case "otobus":
                break;
            default:
                System.out.println("Hatali Giris!!!");
                this.prim=0;
                break;
        }

    }
    private void countPrimBus(int term){        //int term==> tarife donemi
        Scanner input = new Scanner(System.in);
        System.out.println("Otobus tipini giriniz:");
        System.out.println("1. 18-36 kiltuk");
        System.out.println("2. 30 koltuk veya ustu");
        int busType = input.nextInt();
        switch (busType){
            case 1:
                this.prim=term==1 ? 4000 : 4500;
                break;
            case 2:
                this.prim=term==1 ? 5000 : 5500;
                break;
            default:
                System.out.println("Hatali giris!!!");
                break;

        }
    }
}
