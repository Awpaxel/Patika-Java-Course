# En Yakın İki Sayıyı Bulma - Java Uygulaması

Bu proje, Java dilinde `ArrayList<Integer>` kullanarak 10 benzersiz pozitif sayı içeren bir liste oluşturur ve bu listedeki birbirine en yakın iki sayıyı bulur.

---

## 📌 Özellikler

- Kullanıcı tarafından verilen veya kod içinde sabit olarak eklenen pozitif, benzersiz tam sayılar.
- Liste küçükten büyüğe sıralanır.
- En küçük farkı veren iki sayı belirlenir ve ekrana yazdırılır.


---

## 🔗 Özet Çözüm Adımları

1. 10 elemanlı benzersiz pozitif sayı listesi oluşturulur.
2. Liste `Collections.sort()` ile küçükten büyüğe sıralanır.
3. Ardışık iki sayı arasındaki farklar hesaplanır.
4. En küçük fark tespit edilerek hangi iki sayıya ait olduğu bulunur.
5. Sonuçlar ekrana yazdırılır.

---

## 📂 Nasıl Çalıştırılır?

1. Projeyi bir Java IDE’sinde açın (IntelliJ IDEA, Eclipse, NetBeans, vs.).
2. `FindingClosest2Number.java` dosyasını çalıştırın.
3. Konsolda sıralı listeyi ve en yakın iki sayıyı görebilirsiniz.

---

✨ **Hazırlayan:** [Bora Süt](#)  
📅 **Tarih:** 05/08/2025

## 🚀 Kullanılan Java Özellikleri

- `ArrayList<Integer>`
- `Collections.sort()`
- For döngüsü ile ardışık fark kontrolü
- Koşullu ifadeler (`if`)
- Temel değişken tipleri: `int`

## 📝 Örnek Çıktı
```
[1, 5, 7, 9, 12, 15, 16, 20, 28, 30]
En yakın sayılar: 15 ve 16
Aralarındaki fark: 1
