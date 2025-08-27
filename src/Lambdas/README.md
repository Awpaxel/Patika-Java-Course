# 📂 Ödev - Lambdas

Bu proje, Java'da **Lambda ifadeleri** kullanarak geleneksel for döngülerinin nasıl daha kısa ve okunabilir hale getirilebileceğini göstermektedir.

## 🎯 Amaç
- Bir liste içindeki sayıları **iki katına çıkarmak**
- Sonuçları **ekrana yazdırmak**
- Geleneksel for döngülerini Lambda ile değiştirmek

---

## 📌 Kullanılan Özellikler
- **Lambda ifadeleri** (`n -> n * 2`)
- **Method Reference** (`System.out::println`)
- **List.replaceAll()** → Listedeki tüm elemanları verilen fonksiyona göre dönüştürür.
- **List.forEach()** → Listedeki her eleman için verilen işlemi uygular.

---

## 📝 Kod

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Başlangıç listesi
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // 1) Lambda ile tüm elemanları 2 ile çarp
        numbers.replaceAll(n -> n * 2);

        // 2) Lambda (method reference) ile ekrana yazdır
        numbers.forEach(System.out::println);
    }
}
