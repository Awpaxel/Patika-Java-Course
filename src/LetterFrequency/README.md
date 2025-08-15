# Letter Frequency Homework

Bu proje, kullanıcının girdiği kelimedeki harflerin frekansını (kaç kez geçtiğini) bulan basit bir Java konsol uygulamasıdır.

## 📌 Proje Açıklaması

Kullanıcıdan bir kelime veya metin girişi alınır.

Büyük/küçük harf farkı gözetilmez (tüm harfler küçük harfe çevrilir).

Harf olmayan karakterler (sayılar, boşluklar, noktalama işaretleri) yok sayılır.

Her harfin kaç kez geçtiği bir HashMap<Character, Integer> yapısında saklanır.

Harfler ve frekansları satır satır ekrana yazdırılır.

## 🛠 Kullanılan Teknolojiler

* Java 21

* HashMap koleksiyonu

* Scanner sınıfı (kullanıcı girişi almak için)

* Regex (replaceAll metodu ile harf olmayanları temizleme)

## 📜 Çalışma Mantığı

#### Kullanıcıdan kelime alınır.

#### Kelime küçük harfe çevrilir:

`kelime = kelime.toLowerCase();`


#### Harf olmayan karakterler temizlenir:

`kelime = kelime.replaceAll("[^a-z]", "");`


#### Her harf sayılır ve HashMap'e eklenir:

`frekans.put(harf, frekans.getOrDefault(harf, 0) + 1);`


#### Sonuç ekrana yazdırılır.

# 💻 Örnek Çalışma

#### Girdi:

`Kelimeyi giriniz: Merhaba`


#### Çıktı:

`m = 1
e = 1
r = 1
h = 1
a = 2
b = 1`