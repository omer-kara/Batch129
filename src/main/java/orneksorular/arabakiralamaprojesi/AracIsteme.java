package orneksorular.arabakiralamaprojesi;

import java.time.LocalDate;
import java.time.LocalTime;

public class AracIsteme {
    //-	alınacaksehir, alınacakgun, alıssaati, teslimGunu, teslimSaati (kiralama ile ilgili bilgiler)
private String alinacakSehir;
private LocalDate alınacakGun;
private LocalDate alınacakSaat;
private LocalDate teslimGunu;
private LocalDate teslimSaati;

    public AracIsteme(String alinacakSehir, LocalDate alınacakGun, LocalDate alınacakSaat, LocalDate teslimGunu, LocalDate teslimSaati){
this.alınacakGun = alınacakGun;
this.alınacakSaat = alınacakSaat;
this.teslimGunu = teslimGunu;
this.teslimSaati = teslimSaati;

    }

    public AracIsteme(LocalDate alisTarihi, LocalTime alisSaati, LocalDate teslimGunu, LocalTime teslimSaati) {
    }

    public String getAlinacakSehir() {
        return alinacakSehir;
    }

    public void setAlinacakSehir(String alinacakSehir) {
        this.alinacakSehir = alinacakSehir;
    }

    public LocalDate getAlınacakGun() {
        return alınacakGun;
    }

    public void setAlınacakGun(LocalDate alınacakGun) {
        this.alınacakGun = alınacakGun;
    }

    public LocalDate getAlınacakSaat() {
        return alınacakSaat;
    }

    public void setAlınacakSaat(LocalDate alınacakSaat) {
        this.alınacakSaat = alınacakSaat;
    }

    public LocalDate getTeslimGunu() {
        return teslimGunu;
    }

    public void setTeslimGunu(LocalDate teslimGunu) {
        this.teslimGunu = teslimGunu;
    }

    public LocalDate getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(LocalDate teslimSaati) {
        this.teslimSaati = teslimSaati;
    }
}

