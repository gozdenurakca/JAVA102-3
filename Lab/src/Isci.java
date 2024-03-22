public class Isci {
    private String isim;
    private double maas;

    public double getMaas() {
        return maas;
    }
    public void setMaas(double maas) {
        if(maas < 0) {
            throw new HataliDeger("maaş", maas);
        } else {
            this.maas = maas;
        }
    }
    public void setIsim(String isim) {
        if(isim == null || isim.trim().length() == 0)
        {
            throw new HataliDeger("isim",isim);
        }
        else {
            this.isim = isim;
        }
    }
    public String getIsim() {
        return isim;
    }

    @Override
    public String toString() {
        return isim + " işçinin maaşı " + maas + " TL'dir.";
    }
}
