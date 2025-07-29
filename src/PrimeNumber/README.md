# 📌 Recursive Kullanarak Asal Sayı Kontrolü – Java Ödevi

Bu projede, Java programlama dili kullanılarak **recursive (özyinelemeli)** metotlar ile bir sayının **asal** olup olmadığını kontrol eden bir program geliştirilmiştir.

---

## 🎯 Projenin Amacı

- Kullanıcıdan pozitif bir tam sayı almak
- Bu sayının **asal sayı** olup olmadığını `recursive` yöntemle kontrol etmek
- Sonucu kullanıcıya bildirmek

---

## 📚 Konu Başlıkları

- Recursive (özyinelemeli) metot kullanımı
- Java `Scanner` sınıfı ile kullanıcıdan giriş alma
- Temel sayı kuralları (asal sayı kavramı)
- Koşullu ifadeler (`if`, `else`)

---

## 🔁 Asal Sayı Nedir?

Asal sayı, **yalnızca 1'e ve kendisine bölünebilen**, 1'den büyük pozitif tam sayılardır.  
Örnek asal sayılar: `2, 3, 5, 7, 11, 13, 17, 19...`

---

## 🧠 Recursive Metot Mantığı

```java
public static boolean isAsal(int sayi, int bolen) {
    if (sayi <= 1) return false;
    if (bolen == 1) return true;
    if (sayi % bolen == 0) return false;
    return isAsal(sayi, bolen - 1);

Java 21+ (veya 8+)

IntelliJ IDEA / Eclipse / VS Code

Terminal veya Java destekli IDE

👨‍💻 Hazırlayan
📘 Java Eğitimi / Ödev

✍️ Öğrenci: Bora Süt
