# Kütüphane Yönetim Sistemi (Library Management System)

## Proje Açıklaması
Bu proje, bir kütüphane yönetim sistemi için tasarlanmış JPA/Hibernate tabanlı bir Java uygulamasıdır. Kitaplar, yazarlar, kategoriler, yayınevleri ve ödünç alma işlemlerini yönetmek için kullanılır.

## Teknolojiler
- **Java 17**
- **Maven** - Bağımlılık yönetimi
- **JPA/Hibernate** - ORM (Object-Relational Mapping)
- **PostgreSQL** - Veritabanı
- **Jakarta Persistence API 3.1**

## Bağımlılıklar (Dependencies)
```xml
<!-- Hibernate Core -->
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>6.2.7.Final</version>
</dependency>

<!-- PostgreSQL JDBC Driver -->
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.6.0</version>
</dependency>

<!-- Jakarta Persistence API -->
<dependency>
    <groupId>jakarta.persistence</groupId>
    <artifactId>jakarta.persistence-api</artifactId>
    <version>3.1.0</version>
</dependency>
```

## Entity'ler (Varlıklar)

### 1. Author (Yazar)
- **id**: Benzersiz yazar kimliği (Primary Key)
- **name**: Yazarın adı
- **birthDate**: Yazarın doğum tarihi
- **country**: Yazarın ülkesi
- **books**: Yazarın kitapları (One-to-Many ilişki)

### 2. Publisher (Yayınevi)
- **id**: Benzersiz yayınevi kimliği (Primary Key)
- **name**: Yayınevi adı
- **establishmentYear**: Kuruluş yılı
- **address**: Yayınevi adresi
- **books**: Yayınevinin kitapları (One-to-Many ilişki)

### 3. Category (Kategori)
- **id**: Benzersiz kategori kimliği (Primary Key)
- **name**: Kategori adı
- **description**: Kategori açıklaması
- **books**: Kategorideki kitaplar (Many-to-Many ilişki)

### 4. Book (Kitap)
- **id**: Benzersiz kitap kimliği (Primary Key)
- **name**: Kitap adı
- **publicationYear**: Yayın yılı
- **stock**: Stok miktarı
- **author**: Kitabın yazarı (Many-to-One ilişki)
- **publisher**: Kitabın yayınevi (Many-to-One ilişki)
- **categories**: Kitabın kategorileri (Many-to-Many ilişki)
- **borrowings**: Kitabın ödünç alma kayıtları (One-to-Many ilişki)

### 5. BookBorrowing (Kitap Ödünç Alma)
- **id**: Benzersiz ödünç alma kimliği (Primary Key)
- **borrowerName**: Ödünç alan kişinin adı
- **borrowingDate**: Ödünç alma tarihi
- **returnDate**: Teslim tarihi (nullable - kitap teslim edilmemişse null)
- **book**: Ödünç alınan kitap (Many-to-One ilişki)

## Entity İlişkileri

### 1. Author - Book (One-to-Many)
- Bir yazarın birden fazla kitabı olabilir
- Bir kitabın bir yazarı vardır
- **Cascade**: ALL
- **Fetch**: LAZY

### 2. Publisher - Book (One-to-Many)
- Bir yayınevinin birden fazla kitabı olabilir
- Bir kitabın bir yayınevi vardır
- **Cascade**: ALL
- **Fetch**: LAZY

### 3. Category - Book (Many-to-Many)
- Bir kategori birden fazla kitaba sahip olabilir
- Bir kitap birden fazla kategoriye ait olabilir
- Ara tablo: `book_category`
- **Cascade**: PERSIST, MERGE
- **Fetch**: LAZY

### 4. Book - BookBorrowing (One-to-Many)
- Bir kitap birden fazla ödünç alma işlemine sahip olabilir
- Her ödünç alma işlemi yalnızca bir kitaba aittir
- **Cascade**: ALL
- **Fetch**: LAZY

## Veritabanı Konfigürasyonu

### PostgreSQL Bağlantı Ayarları
```properties
jakarta.persistence.jdbc.url=jdbc:postgresql://localhost:5432/library_db
jakarta.persistence.jdbc.user=postgres
jakarta.persistence.jdbc.password=postgres
jakarta.persistence.jdbc.driver=org.postgresql.Driver
```

### Hibernate Ayarları
```properties
hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
hibernate.hbm2ddl.auto=update
hibernate.show_sql=true
hibernate.format_sql=true
```

## Kurulum ve Çalıştırma

### 1. PostgreSQL Veritabanı Oluşturma
```sql
CREATE DATABASE library_db;
```

### 2. Maven Bağımlılıklarını İndirme
```bash
mvn clean install
```

### 3. Uygulamayı Çalıştırma
```bash
mvn exec:java -Dexec.mainClass="com.patika.library.Main"
```

veya IDE'nizde `Main.java` dosyasını çalıştırın.

## Oluşturulan Tablolar

Uygulama çalıştırıldığında PostgreSQL'de aşağıdaki tablolar otomatik olarak oluşturulur:

1. **authors** - Yazar bilgileri
2. **publishers** - Yayınevi bilgileri
3. **categories** - Kategori bilgileri
4. **books** - Kitap bilgileri
5. **book_borrowings** - Ödünç alma kayıtları
6. **book_category** - Many-to-Many ara tablo (Kitap-Kategori ilişkisi)

## Veritabanı Tablo Ekran Görüntüleri

### 1. Authors Tablosu
![Authors Table](screenshots/authors_table.png)

**Açıklama**: Yazarların id, ad, doğum tarihi ve ülke bilgilerini içerir.

---

### 2. Publishers Tablosu
![Publishers Table](screenshots/publishers_table.png)

**Açıklama**: Yayınevlerinin id, ad, kuruluş yılı ve adres bilgilerini içerir.

---

### 3. Categories Tablosu
![Categories Table](screenshots/categories_table.png)

**Açıklama**: Kategorilerin id, ad ve açıklama bilgilerini içerir.

---

### 4. Books Tablosu
![Books Table](screenshots/books_table.png)

**Açıklama**: Kitapların id, ad, yayın yılı, stok, yazar id (Foreign Key) ve yayınevi id (Foreign Key) bilgilerini içerir.

---

### 5. Book Borrowings Tablosu
![Book Borrowings Table](screenshots/book_borrowings_table.png)

**Açıklama**: Ödünç alma işlemlerinin id, ödünç alan kişi adı, ödünç alma tarihi, teslim tarihi ve kitap id (Foreign Key) bilgilerini içerir.

---

### 6. Book Category Tablosu (Many-to-Many Ara Tablo)
![Book Category Table](screenshots/book_category_table.png)

**Açıklama**: Kitap ve kategori arasındaki çoktan çoğa ilişkiyi kuran ara tablo. Book id ve Category id içerir (Composite Foreign Key).

---

## Kullanılan JPA Anotasyonları

- `@Entity` - Sınıfın bir JPA entity olduğunu belirtir
- `@Table` - Veritabanı tablo adını belirtir
- `@Id` - Primary key alanını belirtir
- `@GeneratedValue` - Primary key'in otomatik üretileceğini belirtir
- `@Column` - Kolon özelliklerini belirtir
- `@OneToMany` - Bir-çok ilişkisini belirtir
- `@ManyToOne` - Çok-bir ilişkisini belirtir
- `@ManyToMany` - Çoktan-çoğa ilişkisini belirtir
- `@JoinColumn` - Foreign key kolonunu belirtir
- `@JoinTable` - Many-to-Many ara tablosunu belirtir

## Cascade ve Fetch Stratejileri

### Cascade Stratejileri
- **CascadeType.ALL**: Tüm işlemler cascade edilir
- **CascadeType.PERSIST**: Sadece kayıt işlemi cascade edilir
- **CascadeType.MERGE**: Sadece güncelleme işlemi cascade edilir

### Fetch Stratejileri
- **FetchType.LAZY**: İlişkili veriler gerektiğinde yüklenir (performans için tercih edilir)
- **FetchType.EAGER**: İlişkili veriler anında yüklenir

## Notlar
- `persistence.xml` dosyasında veritabanı bağlantı bilgilerini kendi sisteminize göre güncelleyin
- PostgreSQL'in yüklü ve çalışır durumda olduğundan emin olun
- `library_db` veritabanının PostgreSQL'de oluşturulmuş olduğundan emin olun
- Ekran görüntülerini almak için PostgreSQL'de `library_db` veritabanına bağlanın ve tabloları görüntüleyin

## Lisans
Bu proje eğitim amaçlı oluşturulmuştur.

