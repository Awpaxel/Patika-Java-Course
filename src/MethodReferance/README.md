# Method Reference Ödevi

Bu proje, Java'da method reference kullanarak bir liste içindeki isimleri ekrana yazdırmayı amaçlamaktadır. Geleneksel yöntemle yazılmış kodun daha kısa ve okunabilir bir versiyonunu sunmaktadır.

## Proje İçeriği

- **Main.java**: Projenin ana sınıfı. İsimlerin listelendiği ve method reference kullanılarak yazdırıldığı kodu içerir.

## Kullanılan Teknolojiler

- Java 8 veya daha yeni bir sürüm
- Java Collections Framework
- Java Stream API

## Kurulum

1. **Java Geliştirme Ortamı**: Java 8 veya daha yeni bir sürümün bilgisayarınızda kurulu olduğundan emin olun.
2. **IDE**: IntelliJ IDEA veya başka bir Java IDE'si kullanarak projeyi açın.
3. **Proje Dosyaları**: `Main.java` dosyasını oluşturun ve aşağıdaki kodu ekleyin:

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Ayşe");
        names.add("Mehmet");
        names.add("Zeynep");

        // Method reference kullanarak liste elemanlarını yazdırma
        names.stream().forEach(System.out::println);
    }
}