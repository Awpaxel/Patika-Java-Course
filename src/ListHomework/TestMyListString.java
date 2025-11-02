package ListHomework;

public class TestMyListString {
    public static void main(String[] args) {
        System.out.println("===== String Tipi ile Generic Test =====");
        MyList<String> isimler = new MyList<>(5);

        System.out.println("Başlangıç Kapasitesi: " + isimler.getCapacity());

        isimler.add("Ali");
        isimler.add("Ayşe");
        isimler.add("Mehmet");
        isimler.add("Fatma");
        isimler.add("Ahmet");

        System.out.println("Liste: " + isimler);
        System.out.println("Eleman Sayısı: " + isimler.size());
        System.out.println("Kapasite: " + isimler.getCapacity());

        // Kapasite aşımı - otomatik olarak 2 katına çıkacak
        isimler.add("Zeynep");
        System.out.println("\nYeni eleman eklendi.");
        System.out.println("Liste: " + isimler);
        System.out.println("Yeni Kapasite: " + isimler.getCapacity());

        // İsim arama
        System.out.println("\n'Mehmet' adı indeksi: " + isimler.indexOf("Mehmet"));
        System.out.println("'Veli' adı var mı? " + isimler.contains("Veli"));
        System.out.println("'Ali' adı var mı? " + isimler.contains("Ali"));

        // SubList
        MyList<String> ilkUcIsim = isimler.subList(0, 2);
        System.out.println("\nİlk 3 isim: " + ilkUcIsim);

        // Array'e dönüştürme
        Object[] isimDizisi = isimler.toArray();
        System.out.println("\nArray'e dönüştürüldü. İlk eleman: " + isimDizisi[0]);
    }
}

