# 🔢 Java Çarpım Tablosu Uygulaması

Bu projede, kullanıcıdan alınan 1 ile 10 arasında bir tam sayı ile, **n × n çarpım tablosu** oluşturan bir Java programı geliştirilmiştir. Geçersiz girişlerde kullanıcıya anlamlı bir hata mesajı verilir.

---

## 🎯 Amaç

- Java'da kullanıcıdan `Scanner` ile giriş almak
- `if` yapısıyla sınır kontrolü yapmak
- İç içe `for` döngüleriyle **çarpım tablosu** oluşturmak

---

## 📋 Gereksinimler

1. Kullanıcıdan `Scanner` sınıfı ile **pozitif bir tam sayı** (`n`) alınır  
2. `n` değeri **1 ile 10 arasında değilse**, anlamlı bir hata mesajı gösterilir ve program sonlandırılır  
3. Geçerli `n` için `n × n` çarpım tablosu **iç içe `for` döngüsü** ile üretilir  
4. Tüm kod tek bir `main` metodu içinde yazılmıştır  

---

## 💻 Koddan Bir Kesit

```java
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) {
        System.out.printf("%4d", i * j);
    }
    System.out.println();
}
