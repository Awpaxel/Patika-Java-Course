# Map Entry Homework

## 📌 Açıklama
Bu proje, bir Java **HashMap** içindeki tüm **key-value** çiftlerini ekrana satır satır yazdırmayı amaçlamaktadır.  
Key olarak **String**, value olarak **Integer** veri tipi kullanılmıştır.

## 🛠 Kullanılan Teknolojiler
- **Java 21**
- **HashMap**
- **For-each Loop**
- **Map.Entry**
- **IntelliJIDE Community Edition**

## 📄 Kod Açıklaması
1. `HashMap<String, Integer>` kullanılarak öğrencilerin isimleri ve notları tutulur.
2. `scores.put(key, value)` metodu ile HashMap'e veriler eklenir.
3. `for (Map.Entry<String, Integer> entry : scores.entrySet())` döngüsü ile tüm key-value çiftleri gezilir.
4. `entry.getKey()` ve `entry.getValue()` metodları kullanılarak her satırda key ve value yazdırılır.

## 📋 Örnek Kod
```java
import java.util.HashMap;
import java.util.Map;

public class MapEntryHomework {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        // Key-Value ekleme
        scores.put("Bora", 90);
        scores.put("Sarper", 85);
        scores.put("Okan", 100);
        scores.put("Hilal", 95);
        scores.put("Ali", 75);
        scores.put("Uğur", 80);

        // Key-Value yazdırma
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
```
**Not:** HashMap sıralı değildir, ekrana yazdırılan sıranın ekleme sırası ile aynı olacağı garanti edilmez.

## 📌 Geliştirme Önerileri
LinkedHashMap kullanarak ekleme sırasına göre yazdırma yapılabilir.

TreeMap kullanarak alfabetik sıralama yapılabilir.