public class HataliDeger extends RuntimeException{
    public HataliDeger(String degiskenAdi, Object deger) {
        super(degiskenAdi + " " + deger + " OLAMAZ !");
    }
}
