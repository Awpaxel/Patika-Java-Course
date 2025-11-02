-- Kütüphane Yönetim Sistemi - Veritabanı Kurulum Script'i
-- PostgreSQL Database

-- Veritabanı oluşturma
CREATE DATABASE library_db;

-- library_db veritabanına bağlanın ve aşağıdaki sorguları çalıştırarak tabloları kontrol edin

-- Tüm tabloları listeleme
SELECT table_name
FROM information_schema.tables
WHERE table_schema = 'public'
ORDER BY table_name;

-- Authors tablosu verilerini görüntüleme
SELECT * FROM authors ORDER BY author_id;

-- Publishers tablosu verilerini görüntüleme
SELECT * FROM publishers ORDER BY publisher_id;

-- Categories tablosu verilerini görüntüleme
SELECT * FROM categories ORDER BY category_id;

-- Books tablosu verilerini görüntüleme
SELECT * FROM books ORDER BY book_id;

-- Book Borrowings tablosu verilerini görüntüleme
SELECT * FROM book_borrowings ORDER BY borrowing_id;

-- Book Category ara tablosu verilerini görüntüleme
SELECT * FROM book_category ORDER BY book_id, category_id;

-- Detaylı sorgular

-- Yazarların kitaplarıyla birlikte görüntülenmesi
SELECT
    a.author_name,
    a.country,
    b.book_name,
    b.publication_year
FROM authors a
LEFT JOIN books b ON a.author_id = b.author_id
ORDER BY a.author_name, b.book_name;

-- Yayınevlerinin kitaplarıyla birlikte görüntülenmesi
SELECT
    p.publisher_name,
    p.establishment_year,
    b.book_name,
    b.stock
FROM publishers p
LEFT JOIN books b ON p.publisher_id = b.publisher_id
ORDER BY p.publisher_name, b.book_name;

-- Kitapların kategorileriyle birlikte görüntülenmesi
SELECT
    b.book_name,
    c.category_name,
    c.description
FROM books b
JOIN book_category bc ON b.book_id = bc.book_id
JOIN categories c ON bc.category_id = c.category_id
ORDER BY b.book_name, c.category_name;

-- Ödünç alınan kitapların detaylı listesi
SELECT
    bb.borrower_name,
    b.book_name,
    a.author_name,
    bb.borrowing_date,
    bb.return_date,
    CASE
        WHEN bb.return_date IS NULL THEN 'Henüz Teslim Edilmedi'
        ELSE 'Teslim Edildi'
    END as status
FROM book_borrowings bb
JOIN books b ON bb.book_id = b.book_id
JOIN authors a ON b.author_id = a.author_id
ORDER BY bb.borrowing_date DESC;

