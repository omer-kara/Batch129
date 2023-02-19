
    package hastane;

    public class Durum {

        private String aktuelDurum;
        private boolean aciliyet;

        public Durum(String aktuelDurum, boolean aciliyet) {
            this.aktuelDurum = aktuelDurum;
            this.aciliyet = aciliyet;
        }

        public Durum() {
        }

        public String getAktuelDurum() {
            return aktuelDurum;
        }

        public void setAktuelDurum(String aktuelDurum) {
            this.aktuelDurum = aktuelDurum;
        }

        public void setAciliyet(boolean aciliyet) {
            this.aciliyet = aciliyet;
        }

        public boolean isAciliyet() {
            return aciliyet;
        }

    }

