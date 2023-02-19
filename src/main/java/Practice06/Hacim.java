package Practice06;

public class Hacim {

    public int hacimHesapla(int a){//overloading de isimler ayni olmak zorunda
        return a*a*a;
    }
    public int hacimHesapla(int a, int b){
        return a*a*b;
    }
    public int hacimHesapla(int a, int b, int c){
        return a*b*c;
    }
}
