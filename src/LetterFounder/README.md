# 📄 LetterFounderGame README

## 📝 Proje Açıklaması
Bu proje, Java programlama dili kullanılarak geliştirilmiş basit bir uygulamadır. Kullanıcıdan harf girişi alınır ve bu harf, mevcut bir ArrayList içinde aranır:

Eğer harf listede varsa, bulunduğu eleman "Found" olarak güncellenir.

Eğer harf listede yoksa, listeye eklenir.

Bu işlem 4 kez tekrarlanır.

Program sonunda güncel liste ekrana yazdırılır.

## 🚀 Çalışma Şekli
1️⃣ Program başlatıldığında, başlangıçta rastgele 4 harf içeren bir ArrayList<String> vardır.

2️⃣ Kullanıcıdan 4 kere harf girmesi istenir.

3️⃣ Her giriş sonrası:

Girilen harf listede varsa, ilk bulunduğu konum "Found" olarak güncellenir.

Girilen harf listede yoksa, listeye eklenir.

4️⃣ İşlem sonunda güncel liste ekrana basılır.

## ⚙️ Kullanılan Teknolojiler

Java (JDK 21)

ArrayList veri yapısı

Scanner ile kullanıcıdan girdi alma

indexOf ve contains metotları

## ✅ Proje Özellikleri

Kullanıcı etkileşimli (Scanner ile).

Dinamik liste güncellemesi.

Java koleksiyonları (ArrayList) kullanımı.

## 💻 Örnek Kod
```ArrayList<String> harfListesi = new ArrayList<>();
harfListesi.add("a");
harfListesi.add("b");
harfListesi.add("c");
harfListesi.add("d");

Scanner input = new Scanner(System.in);

for (int i = 0; i < 4; i++) {
System.out.print("Harf giriniz: ");
String girilenHarf = input.nextLine();

    if (harfListesi.contains(girilenHarf)) {
        int index = harfListesi.indexOf(girilenHarf);
        harfListesi.set(index, "Found");
        System.out.println("Harf bulundu, 'Found' ile değiştirildi.");
    } else {
        harfListesi.add(girilenHarf);
        System.out.println("Harf bulunamadı, listeye eklendi.");
    }
    
    System.out.println("Güncel liste: " + harfListesi);
}
