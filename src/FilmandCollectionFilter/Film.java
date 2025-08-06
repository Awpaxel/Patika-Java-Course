package FilmandCollectionFilter;

public class Film {
    // Sınıf özellikleri (private olarak kapsüllenmiş)
    private String ad;
    private int yayinYili;
    private String tur;
    private double imdbPuani;

    // Kurucu metot
    public Film(String ad, int yayinYili, String tur, double imdbPuani) {
        this.ad = ad;
        this.yayinYili = yayinYili;
        this.tur = tur;
        this.imdbPuani = imdbPuani;
    }

    // Getter metotları
    public String getAd() {
        return ad;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public String getTur() {
        return tur;
    }

    public double getImdbPuani() {
        return imdbPuani;
    }

    // toString metodu override edildi
    @Override
    public String toString() {
        return String.format("%s (%d) - Tür: %s, IMDb: %.1f",
                ad, yayinYili, tur, imdbPuani);
    }
}

