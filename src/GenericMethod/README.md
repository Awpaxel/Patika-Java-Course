# Generic Method Ödevi

## 📌 Proje Açıklaması
Bu proje, Java'da **Generic Metotların** kullanımını göstermektedir.  
`printArray` adında bir generic metot yazılmıştır ve bu metot, farklı veri tiplerinden (`Integer`, `String` vb.) oluşan dizileri ekrana yazdırmaktadır.

---

## 🛠 Özellikler
- Farklı veri tipleri ile çalışabilen tek bir generic metot (`printArray`).
- **Kod tekrarını önler**, **tip güvenliği** sağlar.
- `Integer` ve `String` tipinde diziler üzerinde örnek uygulamalar içerir.

---

## 📂 Kod Örneği

```java
public class GenericMethodHomework {

    // Generic Metot
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // Satır sonu için
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Generics", "Ödev"};

        printArray(intArray);
        printArray(strArray);
    }
}
```
