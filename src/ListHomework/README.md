# MyList - Generic List Implementation

Bu proje, Java'da generic yapısını kullanarak kendi liste sınıfımızı oluşturan bir implementasyondur. Collection framework kullanılmadan, sıfırdan bir liste yapısı geliştirilmiştir.

## Özellikler

### Constructor Metotları
- **MyList()**: Varsayılan kapasite 10 olan boş liste oluşturur
- **MyList(int capacity)**: Belirtilen kapasite ile liste oluşturur

### Temel Metotlar

#### `int size()`
Listedeki eleman sayısını döndürür.

#### `int getCapacity()`
Listenin mevcut kapasite değerini döndürür.

#### `void add(T data)`
Listeye eleman ekler. Eğer kapasite doluysa, kapasite otomatik olarak 2 katına çıkar.

#### `T get(int index)`
Belirtilen indexteki değeri döndürür. Geçersiz index için `null` döner.

#### `T remove(int index)`
Belirtilen indexteki elemanı siler ve sonraki elemanları sola kaydırır. Silinen elemanı döndürür. Geçersiz index için `null` döner.

#### `T set(int index, T data)`
Belirtilen indexteki elemanı yeni değerle değiştirir. Eski değeri döndürür. Geçersiz index için `null` döner.

### Arama Metotları

#### `int indexOf(T data)`
Parametrede verilen nesnenin listedeki ilk indeksini verir. Bulunamazsa `-1` döner.

#### `int lastIndexOf(T data)`
Parametrede verilen nesnenin listedeki son indeksini verir. Bulunamazsa `-1` döner.

#### `boolean contains(T data)`
Parametrede verilen değerin listede olup olmadığını kontrol eder.

### Dönüştürme ve Yardımcı Metotlar

#### `boolean isEmpty()`
Listenin boş olup olmadığını kontrol eder.

#### `Object[] toArray()`
Listedeki öğeleri aynı sırayla bir array haline getirir.

#### `MyList<T> subList(int start, int finish)`
Belirtilen indeks aralığına ait yeni bir liste döner.

#### `void clear()`
Listedeki tüm öğeleri siler ve kapasiteyi varsayılan değere (10) döndürür.

#### `String toString()`
Listedeki elemanları `[eleman1,eleman2,...]` formatında string olarak döner.

## Kullanım Örnekleri

### Örnek 1: Kapasite Yönetimi
```java
MyList<Integer> liste = new MyList<>();
System.out.println("Dizideki Eleman Sayısı : " + liste.size());
System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

liste.add(10);
liste.add(20);
liste.add(30);
liste.add(40);
System.out.println("Dizideki Eleman Sayısı : " + liste.size());
System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

// 10 eleman daha ekleyelim
for (int i = 5; i <= 11; i++) {
    liste.add(i * 10);
}
System.out.println("Dizideki Eleman Sayısı : " + liste.size());
System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
```

**Çıktı:**
```
Dizideki Eleman Sayısı : 0
Dizinin Kapasitesi : 10
Dizideki Eleman Sayısı : 4
Dizinin Kapasitesi : 10
Dizideki Eleman Sayısı : 11
Dizinin Kapasitesi : 20
```

### Örnek 2: Temel İşlemler
```java
MyList<Integer> liste = new MyList<>();
liste.add(10);
liste.add(20);
liste.add(30);

System.out.println("2. indisteki değer : " + liste.get(2));
liste.remove(2);
liste.add(40);
liste.set(0, 100);
System.out.println("2. indisteki değer : " + liste.get(2));
System.out.println(liste.toString());
```

**Çıktı:**
```
2. indisteki değer : 30
2. indisteki değer : 40
[100,20,40]
```

### Örnek 3: Gelişmiş Metotlar
```java
MyList<Integer> liste = new MyList<>();
System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));

liste.add(10);
liste.add(20);
liste.add(30);
liste.add(40);
liste.add(20);
liste.add(50);
liste.add(60);
liste.add(70);

System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));

System.out.println("Indeks : " + liste.indexOf(20));        // İlk 20
System.out.println("Indeks :" + liste.indexOf(100));        // Bulunamadı
System.out.println("Indeks : " + liste.lastIndexOf(20));    // Son 20

Object[] dizi = liste.toArray();
System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

MyList<Integer> altListem = liste.subList(0, 3);
System.out.println(altListem.toString());

System.out.println("Listemde 20 değeri : " + liste.contains(20));
System.out.println("Listemde 120 değeri : " + liste.contains(120));

liste.clear();
System.out.println(liste.toString());
```

**Çıktı:**
```
Liste Durumu : Boş
Liste Durumu : Dolu
Indeks : 1
Indeks :-1
Indeks : 4
Object dizisinin ilk elemanı :10
[10,20,30,40]
Listemde 20 değeri : true
Listemde 120 değeri : false
[]
```

## Teknik Detaylar

- **Generic Type**: `<T>` kullanarak herhangi bir veri tipiyle çalışabilir
- **Dinamik Kapasite**: Kapasite dolduğunda otomatik olarak 2 katına çıkar
- **Null Güvenliği**: Geçersiz indeksler için null kontrolü yapılır
- **Sıfır Bağımlılık**: Java Collection Framework kullanılmadan geliştirilmiştir

## Test Etme

`TestMyList.java` dosyasını çalıştırarak tüm metotları test edebilirsiniz:

```bash
javac ListHomework/MyList.java ListHomework/TestMyList.java
java ListHomework.TestMyList
```

### Test Sonuçları

#### Test 1: Constructor ve Kapasite
```
===== Test 1: Constructor ve Kapasite Testi =====
Dizideki Eleman Sayısı : 0
Dizinin Kapasitesi : 10
Dizideki Eleman Sayısı : 4
Dizinin Kapasitesi : 10
Dizideki Eleman Sayısı : 11
Dizinin Kapasitesi : 20
```
✅ Başlangıç kapasitesi 10, kapasite dolunca otomatik olarak 20'ye çıkıyor.

#### Test 2: get, remove, set İşlemleri
```
===== Test 2: get, remove, set Testi =====
2. indisteki değer : 30
2. indisteki değer : 40
[100,20,40]
```
✅ Elemanlar başarıyla okunuyor, siliniyor ve güncelleniyor.

#### Test 3: Gelişmiş Metotlar
```
===== Test 3: Gelişmiş Metotlar Testi =====
Liste Durumu : Boş
Liste Durumu : Dolu
Indeks : 1
Indeks :-1
Indeks : 4
Object dizisinin ilk elemanı :10
[10,20,30,40]
Listemde 20 değeri : true
Listemde 120 değeri : false
[]
```
✅ Tüm arama, dönüştürme ve yardımcı metotlar doğru çalışıyor.

### Generic Tipler İle Test

`TestMyListString.java` ile farklı veri tipleriyle test edebilirsiniz:

```bash
javac ListHomework/TestMyListString.java
java ListHomework.TestMyListString
```

```
===== String Tipi ile Generic Test =====
Başlangıç Kapasitesi: 5
Liste: [Ali,Ayşe,Mehmet,Fatma,Ahmet]
Eleman Sayısı: 5
Kapasite: 5

Yeni eleman eklendi.
Liste: [Ali,Ayşe,Mehmet,Fatma,Ahmet,Zeynep]
Yeni Kapasite: 10
```
✅ Generic yapı sayesinde String, Integer, Double ve diğer tipler ile çalışabiliyor.

## Başarılar

Bu proje, Java'da Collection Framework kullanmadan kendi liste yapımızı başarıyla oluşturdu. Tüm gerekli metotlar implement edildi ve test edildi. ✨

