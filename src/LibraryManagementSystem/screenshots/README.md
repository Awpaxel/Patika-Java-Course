# Veritabanı Tablo Ekran Görüntüleri

Bu klasör veritabanı tablolarının ekran görüntülerini içerir.

## Ekran görüntüsü alma adımları:

1. PostgreSQL'de `library_db` veritabanına bağlanın
2. Her tablo için aşağıdaki SQL sorgularını çalıştırın ve ekran görüntüsü alın:

### Authors Tablosu
```sql
SELECT * FROM authors;
```

### Publishers Tablosu
```sql
SELECT * FROM publishers;
```

### Categories Tablosu
```sql
SELECT * FROM categories;
```

### Books Tablosu
```sql
SELECT * FROM books;
```

### Book Borrowings Tablosu
```sql
SELECT * FROM book_borrowings;
```

### Book Category Tablosu
```sql
SELECT * FROM book_category;
```

3. Her bir sorgu sonucunun ekran görüntüsünü şu isimlerle kaydedin:
   - `authors_table.png`
   - `publishers_table.png`
   - `categories_table.png`
   - `books_table.png`
   - `book_borrowings_table.png`
   - `book_category_table.png`

4. Ekran görüntülerini bu klasöre ekleyin.

