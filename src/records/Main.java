package records;

import java.util.*;

public class Main {
    static void main() {
        Student s1  = new Student("Bora",   "Süt",     552);
        Student s2  = new Student("Ali",    "Biner",   553);
        Student s3  = new Student("Yaren",  "Erol",    554);
        Student s4  = new Student("Asena",  "Arıkan",  555);
        Student s5  = new Student("Okan",   "Erturan", 556);
        Student s6  = new Student("Uğur",   "Taşdelen",557);
        Student s7  = new Student("Sarper", "Kaya",    558);
        Student s8  = new Student("Müberra","Nemutlu", 559);
        Student s9  = new Student("Nurşah", "Baş",     560);
        Student s10 = new Student("Sevda",  "Atlı",    561);

        List<Student> students = List.of(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);

        //To String olarak yazdırma
        System.out.println("=== Öğrenciler ===");
        students.forEach(System.out::println);

        //Equals/hashCode doğrulama
        Student s1Copy = new Student("Bora" , "Süt", 552);
        System.out.println("\\nEquals testi: s1.equals(s1Copy) -> " + s1.equals(s1Copy));

        Set<Student> set = new HashSet<>(students);
        set.add(s1Copy);
        System.out.println("HashSet boyutu (tekil kayıt): " + set.size());

        //ID -> Student Haritası
        Map<Integer, Student> byId = new HashMap<>();
        for(Student s : students) {
            byId.put(s.studentId(), s);
        }

        System.out.println("\nID -> Ad Soyad");
        byId.forEach((id, st) -> System.out.println(id + " -> " + st.fullname()));
    }
}
