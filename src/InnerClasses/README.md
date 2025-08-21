# 📂 Inner Classes Ödevi - Çalışan ve İletişim Bilgileri

## 📌 Proje Açıklaması
Bu proje, **Java Inner Class (İç Sınıf)** konusunu pekiştirmek amacıyla hazırlanmıştır.  
Senaryoya göre bir **çalışanın temel bilgileri** (adı, soyadı) dış sınıfta (**Employee**) tutulurken, çalışana ait **iletişim bilgileri** (telefon ve e-posta) ise **iç sınıfta (ContactInfo)** saklanmaktadır.

Bu yapı sayesinde iletişim bilgileri **sadece çalışana bağlıdır** ve başka yerde tek başına kullanılamaz. Böylece kapsülleme (encapsulation) ve OOP mantığı daha net kavranır.

---

## 🎯 Hedefler
- **Sınıflar ve Nesneler** konusunu pekiştirmek
- **Inner Class (İç sınıf)** kullanımını öğrenmek
- Çalışan nesneleri ile iletişim bilgilerini ilişkilendirmek
- Konsol çıktıları üzerinden sınıfların ilişkisini göstermek

---

## 🏗️ Sınıf Yapısı

### 1. Employee (Dış Sınıf)
- **Alanlar (Fields):**
    - `firstName` → Çalışanın adı
    - `lastName` → Çalışanın soyadı

- **Metotlar:**
    - `displayInfo()` → Çalışanın adı ve soyadını yazdırır.

---

### 2. ContactInfo (İç Sınıf)
- **Alanlar (Fields):**
    - `phoneNumber` → Çalışanın telefon numarası
    - `email` → Çalışanın e-posta adresi

- **Metotlar:**
    - `displayContactInfo()` → Telefon ve e-posta bilgisini yazdırır.

---

### 3. main (Test Alanı)
- Çalışan nesnesi (`Employee`) oluşturulur.
- O çalışana ait **ContactInfo** nesnesi oluşturulur.
- Bilgiler ekrana yazdırılır.

---

## 🖥️ Örnek Kod

```java
public class Employee {
    String firstName;
    String lastName;

    // Constructor
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Çalışan bilgilerini yazdır
    public void displayInfo() {
        System.out.println("Ad: " + firstName + ", Soyad: " + lastName);
    }

    // Inner Class
    class ContactInfo {
        String phoneNumber;
        String email;

        // Constructor
        public ContactInfo(String phoneNumber, String email) {
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        // İletişim bilgilerini yazdır
        public void displayContactInfo() {
            System.out.println("Telefon: " + phoneNumber + ", Email: " + email);
        }
    }

    // Main (test alanı)
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ahmet", "Yılmaz");
        emp1.displayInfo();

        // Inner class nesnesi oluşturma
        ContactInfo contact1 = emp1.new ContactInfo("0555 123 45 67", "ahmet@example.com");
        contact1.displayContactInfo();
    }
}
```
---
## 📊 Örnek Çıktı
```
Ad: Ahmet, Soyad: Yılmaz
Telefon: 0555 123 45 67, Email: ahmet@example.com
```
