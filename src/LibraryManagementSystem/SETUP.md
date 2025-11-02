# Kütüphane Yönetim Sistemi - Kurulum Talimatları

## Gereksinimler

1. **Java Development Kit (JDK) 17 veya üzeri**
   - Java'nın yüklü olduğunu kontrol edin: `java -version`

2. **Maven**
   - Maven'ın yüklü olduğunu kontrol edin: `mvn -version`

3. **PostgreSQL**
   - PostgreSQL'in yüklü ve çalışır durumda olduğundan emin olun
   - Varsayılan port: 5432

4. **IDE (Opsiyonel)**
   - IntelliJ IDEA
   - Eclipse
   - VS Code

## Kurulum Adımları

### 1. PostgreSQL Veritabanı Kurulumu

PostgreSQL'i açın ve şu komutu çalıştırarak veritabanını oluşturun:

```sql
CREATE DATABASE library_db;
```

### 2. PostgreSQL Kullanıcı Bilgileri

`persistence.xml` dosyasındaki bağlantı bilgilerini kendi PostgreSQL ayarlarınıza göre güncelleyin:

Dosya yolu: `src/main/resources/META-INF/persistence.xml`

```xml
<property name="jakarta.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/library_db"/>
<property name="jakarta.persistence.jdbc.user" value="postgres"/>
<property name="jakarta.persistence.jdbc.password" value="postgres"/>
```

**Not**: Kullanıcı adı ve şifreyi kendi PostgreSQL bilgilerinizle değiştirin.

### 3. Maven Bağımlılıklarını İndirme

Proje dizinine gidin ve şu komutu çalıştırın:

```bash
cd LibraryManagementSystem
mvn clean install
```

Bu komut gerekli tüm bağımlılıkları indirecektir:
- Hibernate Core (6.2.7.Final)
- PostgreSQL JDBC Driver (42.6.0)
- Jakarta Persistence API (3.1.0)

### 4. Projeyi Çalıştırma

#### Maven ile Çalıştırma:

```bash
mvn exec:java -Dexec.mainClass="com.patika.library.Main"
```

#### IDE ile Çalıştırma:

1. Projeyi IDE'nizde açın
2. `src/main/java/com/patika/library/Main.java` dosyasını bulun
3. Main sınıfını çalıştırın (Run)

### 5. Sonuçları Kontrol Etme

Uygulama başarıyla çalıştığında:

1. PostgreSQL'de `library_db` veritabanına bağlanın
2. Aşağıdaki tabloların oluşturulduğunu görmelisiniz:
   - `authors` (Yazarlar)
   - `publishers` (Yayınevleri)
   - `categories` (Kategoriler)
   - `books` (Kitaplar)
   - `book_borrowings` (Ödünç Alma İşlemleri)
   - `book_category` (Many-to-Many ara tablo)

3. Tabloları görüntülemek için şu SQL komutlarını kullanın:

```sql
-- Tüm tabloları listele
SELECT table_name FROM information_schema.tables 
WHERE table_schema = 'public' ORDER BY table_name;

-- Örnek veri sorgula
SELECT * FROM authors;
SELECT * FROM publishers;
SELECT * FROM categories;
SELECT * FROM books;
SELECT * FROM book_borrowings;
SELECT * FROM book_category;
```

## Ekran Görüntüleri Alma

### pgAdmin veya PostgreSQL ile:

1. pgAdmin'i açın
2. `library_db` veritabanına bağlanın
3. Her tablo için `SELECT * FROM table_name` sorgusunu çalıştırın
4. Sonuç ekranının görüntüsünü alın
5. Ekran görüntülerini `screenshots/` klasörüne kaydedin:
   - `authors_table.png`
   - `publishers_table.png`
   - `categories_table.png`
   - `books_table.png`
   - `book_borrowings_table.png`
   - `book_category_table.png`

### Alternatif: DBeaver kullanarak:

1. DBeaver'ı açın
2. PostgreSQL bağlantısı oluşturun
3. `library_db` veritabanına gidin
4. Her tabloyu seçin ve "View Data" tıklayın
5. Ekran görüntülerini alın

## Örnek Veriler

Uygulama çalıştırıldığında otomatik olarak şu örnek veriler eklenir:

### Yazarlar:
- Orhan Pamuk (1952, Türkiye)
- Elif Şafak (1971, Türkiye)

### Yayınevleri:
- İletişim Yayınları (1982, İstanbul)
- Doğan Kitap (1974, İstanbul)

### Kategoriler:
- Roman
- Edebiyat
- Tarih

### Kitaplar:
- Kar (Orhan Pamuk, 2002, Stok: 15)
- Masumiyet Müzesi (Orhan Pamuk, 2008, Stok: 10)
- Aşk (Elif Şafak, 2009, Stok: 20)

### Ödünç Alma İşlemleri:
- Ahmet Yılmaz - Kar kitabını ödünç aldı
- Ayşe Demir - Masumiyet Müzesi kitabını ödünç aldı
- Mehmet Kaya - Aşk kitabını ödünç aldı ve geri teslim etti

## Sorun Giderme

### Bağlantı Hatası:

```
org.postgresql.util.PSQLException: Connection refused
```

**Çözüm**: 
- PostgreSQL servisinin çalıştığından emin olun
- Port numarasının 5432 olduğunu kontrol edin

### Veritabanı Bulunamadı:

```
database "library_db" does not exist
```

**Çözüm**:
```sql
CREATE DATABASE library_db;
```

### Maven Bağımlılık Hatası:

**Çözüm**:
```bash
mvn clean install -U
```

### Hibernate Dialect Hatası:

**Çözüm**: `persistence.xml` dosyasında dialect'in doğru olduğundan emin olun:
```xml
<property name="hibernate.dialect" value="org.hibernate.dialect.PostgreSQLDialect"/>
```

## Proje Yapısı

```
LibraryManagementSystem/
├── pom.xml
├── README.md
├── SETUP.md
├── database_queries.sql
├── screenshots/
│   └── README.md
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── patika/
        │           └── library/
        │               ├── Main.java
        │               └── entity/
        │                   ├── Author.java
        │                   ├── Publisher.java
        │                   ├── Category.java
        │                   ├── Book.java
        │                   └── BookBorrowing.java
        └── resources/
            └── META-INF/
                └── persistence.xml
```

## İletişim ve Destek

Bu proje Patika Java kursu kapsamında eğitim amaçlı hazırlanmıştır.

## Lisans

Bu proje eğitim amaçlıdır ve özgürce kullanılabilir.

