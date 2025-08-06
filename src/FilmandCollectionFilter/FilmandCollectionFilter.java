package FilmandCollectionFilter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmandCollectionFilter {
    public static void main(String[] args) {
        // Film listesi oluşturma
        ArrayList<Film> filmler = new ArrayList<>();

        // Film örnekleri ekleme
        filmler.add(new Film("Parasite", 2019, "Drama", 8.6));
        filmler.add(new Film("The Shawshank Redemption", 1994, "Drama", 9.3));
        filmler.add(new Film("Inception", 2010, "Bilim Kurgu", 8.8));
        filmler.add(new Film("Pulp Fiction", 1994, "Suç", 8.9));
        filmler.add(new Film("The Dark Knight", 2008, "Aksiyon", 9.0));

        // 1. IMDb puanına göre sıralama (büyükten küçüğe)
        System.out.println("\nIMDb Puanına Göre Sıralama (Yüksek->Düşük):");
        filmler.stream()
                .sorted(Comparator.comparingDouble(Film::getImdbPuani).reversed())
                .forEach(System.out::println);

        // 2. Yayın yılına göre sıralama (küçükten büyüğe)
        System.out.println("\nYayın Yılına Göre Sıralama (Eski->Yeni):");
        filmler.stream()
                .sorted(Comparator.comparingInt(Film::getYayinYili))
                .forEach(System.out::println);

        // 3. Türüne göre filtreleme
        String arananTur = "Drama";
        System.out.println("\n" + arananTur + " Türündeki Filmler:");
        List<Film> filtrelenmisFilmler = filmler.stream()
                .filter(film -> film.getTur().equalsIgnoreCase(arananTur))
                .collect(Collectors.toList());

        if (filtrelenmisFilmler.isEmpty()) {
            System.out.println("Bu türde film bulunamadı.");
        } else {
            filtrelenmisFilmler.forEach(System.out::println);
        }
    }
}

