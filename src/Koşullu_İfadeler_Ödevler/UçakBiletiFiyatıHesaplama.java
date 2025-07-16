import java.util.Scanner;

 class UçakBiletiFiyatıHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan verileri al
        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş): ");
        int tip = scanner.nextInt();

        // Geçerli veri kontrolü
        if (mesafe <= 0 || yas <= 0 || (tip != 1 && tip != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        // Temel ücret hesaplama
        double birimFiyat = 0.10;
        double normalTutar = mesafe * birimFiyat;
        double yasIndirimi = 0;
        double gidisDonusIndirimi = 0;
        double toplamTutar;

        // Yaş indirimi
        if (yas < 12) {
            yasIndirimi = normalTutar * 0.50;
        } else if (yas >= 12 && yas <= 24) {
            yasIndirimi = normalTutar * 0.10;
        } else if (yas > 65) {
            yasIndirimi = normalTutar * 0.30;
        }

        // Yaş indirimi uygulanmış tutar
        double indirimliTutar = normalTutar - yasIndirimi;

        // Yolculuk tipi kontrolü ve indirim
        switch (tip) {
            case 1: // Tek yön
                toplamTutar = indirimliTutar;
                break;
            case 2: // Gidiş-Dönüş
                gidisDonusIndirimi = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
                break;
            default:
                System.out.println("Hatalı Yolculuk Tipi!");
                return;
        }

        System.out.printf("Toplam Bilet Fiyatı: %.2f TL%n", toplamTutar);
    }
}
