package com.patika.library;

import com.patika.library.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            // Örnek veri ekleme
            // Yazar oluşturma
            Author author1 = new Author("Orhan Pamuk", LocalDate.of(1952, 6, 7), "Türkiye");
            Author author2 = new Author("Elif Şafak", LocalDate.of(1971, 10, 25), "Türkiye");

            em.persist(author1);
            em.persist(author2);

            // Yayınevi oluşturma
            Publisher publisher1 = new Publisher("İletişim Yayınları", 1982, "İstanbul, Türkiye");
            Publisher publisher2 = new Publisher("Doğan Kitap", 1974, "İstanbul, Türkiye");

            em.persist(publisher1);
            em.persist(publisher2);

            // Kategori oluşturma
            Category category1 = new Category("Roman", "Roman kategorisi");
            Category category2 = new Category("Edebiyat", "Edebiyat kategorisi");
            Category category3 = new Category("Tarih", "Tarihi romanlar");

            em.persist(category1);
            em.persist(category2);
            em.persist(category3);

            // Kitap oluşturma
            Book book1 = new Book("Kar", 2002, 15);
            book1.setAuthor(author1);
            book1.setPublisher(publisher1);
            book1.getCategories().add(category1);
            book1.getCategories().add(category2);

            Book book2 = new Book("Masumiyet Müzesi", 2008, 10);
            book2.setAuthor(author1);
            book2.setPublisher(publisher1);
            book2.getCategories().add(category1);

            Book book3 = new Book("Aşk", 2009, 20);
            book3.setAuthor(author2);
            book3.setPublisher(publisher2);
            book3.getCategories().add(category1);
            book3.getCategories().add(category2);

            em.persist(book1);
            em.persist(book2);
            em.persist(book3);

            // Kitap ödünç alma
            BookBorrowing borrowing1 = new BookBorrowing("Ahmet Yılmaz", LocalDate.now());
            borrowing1.setBook(book1);

            BookBorrowing borrowing2 = new BookBorrowing("Ayşe Demir", LocalDate.now().minusDays(5));
            borrowing2.setBook(book2);

            BookBorrowing borrowing3 = new BookBorrowing("Mehmet Kaya", LocalDate.now().minusDays(10));
            borrowing3.setReturnDate(LocalDate.now().minusDays(3)); // Teslim edildi
            borrowing3.setBook(book3);

            em.persist(borrowing1);
            em.persist(borrowing2);
            em.persist(borrowing3);

            em.getTransaction().commit();

            System.out.println("Veritabanı tabloları başarıyla oluşturuldu ve örnek veriler eklendi!");
            System.out.println("\nPostgreSQL'de 'library_db' veritabanını kontrol edin.");
            System.out.println("\nOluşturulan tablolar:");
            System.out.println("1. authors");
            System.out.println("2. publishers");
            System.out.println("3. categories");
            System.out.println("4. books");
            System.out.println("5. book_borrowings");
            System.out.println("6. book_category (Many-to-Many ara tablo)");

        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}

