package practice.practice11.interface_maas_hesapla_tekrar;

public class MaasHesapla implements  Vergi, MaasArtis{


    @Override
    public double yillikEkstra(int calismaYili) {
        return calismaYili*100;
    }

    @Override
    public double saatlikEkstra(int calismaSaati) {
        if (calismaSaati>160){
            return (calismaSaati-160)*10;
        }else {
            return 0;
        }

    }

    @Override
    public double vergi(int calismaYili, double brutMaas) {
        if (calismaYili>=10){
           return brutMaas*0.30;
        }else {
          return brutMaas*0.20;
        }

    }
    public double netMass(int brutMaas, int calismaYili, int calismaSaati){

        return brutMaas+yillikEkstra(calismaYili) + saatlikEkstra(calismaSaati) - vergi(calismaYili, brutMaas);
    }
}
