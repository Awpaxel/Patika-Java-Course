# **_Çalışan Maaş Hesaplayıcı - Java OOP Ödevi_**

## **📌 Proje Genel Bakış**

Bu Java uygulaması, Nesne Yönelimli Programlama (OOP) prensiplerini kullanarak fabrika çalışanlarının maaş hesaplamalarını (vergi, bonus ve zam işlemleriyle birlikte) yapar.

### **🛠️ Özellikler**

* Çalışan maaş yönetimi (vergi hesaplamalarıyla)
* Fazla mesai bonusu hesaplama
* Kıdeme göre maaş zammı
* Detaylı çalışan bilgisi görüntüleme

### 🔧 Uygulanan OOP Prensipleri

* Kapsülleme: Private nitelikler ve public metotlar
* Soyutlama: Karmaşık hesaplamalar basit metot çağrıları arkasında gizlenmiştir
* Modülerlik: Her hesaplama kendi metodunda yapılmıştır

### 🛠️ Kullanılan Teknolojiler
* Java 21, IntelliJIDEA Comunnity Edition

### **📝 Örnek Kullanım**

```Employee emp = new Employee("Kemal", 2000, 45, 1985);

System.out.println(emp.toString());`

### **Örnek Çıktı:**

```Adı : Kemal

Maaşı : 2000.0

Çalışma Saati : 45

Başlangıç Yılı : 1985

Vergi : 60.0

Bonus : 150.0

Maaş Artışı : 300.0

Vergi ve Bonuslar ile birlikte maaş : 2090.0

Toplam Maaş : 2390.0`
