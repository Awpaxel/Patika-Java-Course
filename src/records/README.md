# 📘 Java Records Ödevi

Bu proje, **Java Records** yapısını kullanarak basit bir öğrenci kayıt sistemi oluşturmayı amaçlamaktadır.  
Java `record` sınıfları immutable (değiştirilemez) veri tutmak için kullanılan özel sınıf türleridir.

---

## 🎯 Senaryo
Bir okul, öğrencilerinin bilgilerini saklamak için basit bir kayıt sistemi geliştirmek istemektedir.  
Her öğrencinin:
- **Adı**
- **Soyadı**
- **Öğrenci Numarası**

gibi bilgileri olacaktır.

Bu bilgiler `record` kullanılarak saklanacak, ardından öğrenciler oluşturulup ekrana yazdırılacaktır.

---

## 🛠 Kullanılan Yapılar
- `record` → Immutable veri taşıyıcı (Java 14+ ile geldi, Java 16’da stabil oldu)
- `List` → Öğrencileri listelemek için
- `Set` → `equals` ve `hashCode` testleri için
- `Map` → Öğrencileri ID numarasına göre saklamak için

---

## 📂 Dosya Yapısı
src/

└── records/

├── Student.java # Record tanımı

└── Main.java # Öğrencileri oluşturan ve test eden ana sınıf


---

## 💻 Student.java (Record Tanımı)

```java
package records;

public record Student(String firstName, String lastName, int studentId) {

    // Kompakt constructor (opsiyonel doğrulama)
    public Student {
        if (firstName == null || firstName.isBlank()
                || lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("İsim / soyisim boş olamaz.");
        }
        if (studentId <= 0) {
            throw new IllegalArgumentException("Öğrenci numarası pozitif olmalı.");
        }
    }

    // Ekstra metod
    public String fullName() {
        return firstName + " " + lastName;
    }
}
