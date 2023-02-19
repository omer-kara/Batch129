package orneksorular.arabakiralamaprojesi;

public class Arac {
       /* ***********  Araba Kiralama Projesi TASK   ***********
    Bir araç kiralama projesi hazırlayınız.        Arac Talebi adında bir POJO class oluşturunuz.
            -	alınacaksehir, alınacakgun, alıssaati, teslimGunu, teslimSaati (kiralama ile ilgili bilgiler)
         -	marka, model, yakitTipi, vites ve gunlukUcret (araç ile ilgili bilgiler).
            -	Kiralama ile ilgili variable’ları içeren parametreli bir constructor oluşturun.
            -	Araç ile ilgili variable’ları içeren parametreli bir constructor oluşturun.
            -	Tum variable’lar için Getter ve Setter method’ları oluşturun (Encapsulation).
    MusteriveAracBilgileri adında method’ları içeren bir class oluşturunuz.
            -	aracTalep() adında bir method oluşturunuz.        Bu method’da alinacak sehir, teslim edilecek sehir,
    alinacak gun ve teslim edilecek gun ve teslim saati bilgilerini aliniz.        Odenecek toplam gun sayisini yazdırın.
            Dikkat: Teslim gunu, alis gününden daha once olamaz.
            -	arabalar() create ederek, tüm araç modellerini bir list’e atınız.
            (parametre olarak araç ile ilgili bilgileri alan <marka, model, yakıt tipi, vites, gunlukUcret> objeleri list’e atınız.)
    Bu list’i göstererek bir aracı kiralamasını sağlayın.
            -	getAraba() metodu ile seçmiş olduğu aracı gösterin. Odeyeceği toplam miktari yazdirin.
    Onaylar ise, müşteri bilgilerini almak için devam edin.
        -	musteriBilgileri() metodu ile müşteri ile ilgili bilgileri aliniz. AdSoyad, ID, yaş ve telefon.
        -	OdemeBilgieri() metodu ile odeme bilgilerini alacaginiz bir method create ediniz.
            *  Kart numarası uzunluğu 12 olmalıdır, kontrol ediniz.
            */


    private String marka;
    private String model;
    private String yakitTipi;
    private String vites;
    private double gunlukUcret;

    public Arac(String marka, String model, String yakitTipi, String vites, double gunlukUcret){
        this.marka = marka;
        this.model = model;
        this.yakitTipi = yakitTipi;
        this.vites = vites;
        this.gunlukUcret = gunlukUcret;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {
        this.yakitTipi = yakitTipi;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public double getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(double gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }
}