package day26overriding;

public class Animal {

    /*
    1) Parent classdaki method'u Child Class icinde ozellestirerek kullanmaya "Overriding" yapmak denir.
    2) Overriding method'un parantezine, method'un ismine dokunulmaz, mehhod'un body'si degistirilir.
    3) @Override,  Override Annotation'i==>(Ek Açıklamayı Geçersiz Kıl) Override kurallarini Java tarafindan kontrol edilmeini saglar
    4) Overriding'de parent clas'taki method'a "Overridden Method", Child class'taki method'a ise "Overriding Method" denir
    5) "private" methodlar "overide" edilemez.
    6) Child clas'taki Override edilmis method(Overriding Method )'un
    access modifier'i Parent Class'daki override edilmis method(Overridden Method)'un
    acces modifier'inden dar olamaz.

    Overridden Method ==> protected ise Overriding Method ==> protectet + public
    Overridden Method ==> default ise Overriding Method ==> default + protectet + public
    Overridden Method ==> private ise Overriding Method ==> override olmaz ki access modifier'i olsun.(Bkz 5 kural)

    7) Child Class'ta override edilen Method'un (Overriding Method) return type'in method'un return ettigi data type'inin aynisi veya o data type'inin
    parent'i olarak secilebilir.
    8) Method'un return type'i "Primitive" ise Overriding yaparken return type degistirilemez. Cunku; return type ya ayni olur veya parent'dan secilir,
    ama primitive'ler arasinda "paretn-child ilskisi" olmadigindan parent'dan secmek mevzu bahis olamaz. O zaman tek secenek aynisi olmalidir kalir.
    9) Method'un return type'i "Wrapper Class" ise, Overiding yaparken return type degistirilemez. Cunku; retur type ayni olur veya parentten secilir,
    ama Java bir wrapper class'i digerinin paret'i yapmadigindan parent'ten secme ihtimali yoktur, geriye sadece aynisi olma ihtimali kalir.
    10)Method'un return type'i "Void" ise Overriding yaparken return type degistirilemez.

    11) Final kelimesini "Variable"larda kullanabilirsiniz.
                    ->final variable ise
                    i) mutlaka değer atanmalıdır
                    ii) ilk atanan değer değiştirilemez

        12)Final kelimesini "Method" larda kullanabilirsiniz.
                     ->method final ise;
                      i)methodun body'si değiştirilemez
                      ii)method body'si değiştirilemeyince override yapmak mümkün olmaz

        13)Final kelimesini "Class"larda kullanabilirsiniz.
                       ->class final ise;
                       i)o class'ın child'ı olamaz
        14) "final" methodlar ve "static" methodlar "override" edilemezler.
        15)"Ovirride" yapabilmek icin "Inheritance" sarttir. Baska bir ifade ile parent child iliskisi sattir.
        16)Method Overloading "Compile(derlemek) Time Polymorphism(coklu gorunum)" dir, Method Overriding "Run Time Polymorphohism" dir.
        16)Method Overloading "static Polymorphism" dir, Method Overriding "dynamic Polymorphohism" dir.
        public int add(){2+b+2+5}==> Overriding
      */
    public void eat(){//Parent'daki override edilmis eat() methoduna "Overridden Method" denir.
        System.out.println("Aninals eat...");
    }
    public void drink(){
        System.out.println("Aninals drink...");
    }
    public Animal create (){
        return new Animal();
    }
    public int add(int a, int b){
        return a+b;
    }
    public Integer multiply(int a, int b){
        return a*b;
    }
}
