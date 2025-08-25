package records;

public record Student(String firstName, String lastName, int studentId) {

    public Student {
        if (firstName == null || firstName.isBlank()
            || lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("İsim / soyisim boş olamaz.");
        }
        if (studentId <= 0) {
            throw new  IllegalArgumentException("Öğrenci numarası pozitif sayı olmalıdır");
        }
    }

    public String fullname() {
        return firstName + " " + lastName;
    }
}