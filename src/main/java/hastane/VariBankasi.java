package hastane;

public class VariBankasi {





        String [] doctorIsimleri ={"Mustafa","Ali","Hasan", "Sevilay","Leyla", "Mehmet" };
        String [] doctorSoyIsimleri ={"Aydoğdu","Selim","Koç", "Günes","Kayserili", "Mahmutoğulları" };
        String [] unvanlar ={"Allergist","Norolog","Genel Cerrah", "Cocuk Doktoru","Dahiliye", "Kardiyolog" };

        String [] hastaIsimleri ={"Ayhan","Salih","Hasan", "Ayse","İsmail", "Ali" };
        String [] hastaSoyIsimleri ={"Adali","Bas","Kacan", "Gündoğdu","Kızılırmak", "Can" };
        String [] durumlar ={"Alerji","Bas agrisi","Tırnak batmasi", "Çocuk hastalıklari","Diyabet", "Kalp hastaliklari" };

        int[] hastaIDleri ={111,222,333,444,555,666};

        public void VeriBankasi(String[] doctorIsimleri, String[] doctorSoyIsimleri,
                                String[] unvanlar, String[] hastaIsimleri, String[] hastaSoyIsimleri,
                                String[] durumlar, int[] hastaIDleri) {

            this.doctorIsimleri = doctorIsimleri;
            this.doctorSoyIsimleri = doctorSoyIsimleri;
            this.unvanlar = unvanlar;
            this.hastaIsimleri = hastaIsimleri;
            this.hastaSoyIsimleri = hastaSoyIsimleri;
            this.durumlar = durumlar;
            // this.hastaIDleri = hastaIDleri;
        }

        public void VeriBankasi() {
        }
    }

