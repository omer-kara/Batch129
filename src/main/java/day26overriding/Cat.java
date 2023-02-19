package day26overriding;

public class Cat extends Mammal {

    public void meow(){

        System.out.println("Cats meow...");
    }

    @Override  //Override Annotation'i==>Ek Açıklamayı Geçersiz Kıl
                //Override kurallarini Java tarafindan kontrol edilmeini saglar

    public void eat() {//Child'daki override edilmis eat() methoduna "Overriding Method" denir.
        //super.eat();//parentteki eat'i kullan demek
        System.out.println("Cat eat...");

    }

    @Override
    public void drink() {
        System.out.println("Cats drink...");
    }

    @Override
    public Animal create() {
        return new Cat();//Cat classinda Cat olusturma
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a+b;
    }
}
