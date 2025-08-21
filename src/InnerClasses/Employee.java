package InnerClasses;

public class Employee {
    String firstname;
    String lastname;
    ContactInfo contactInfo; //Inner Class referansı

    //Employee Consturctor
    Employee(String firstname, String lastname, String phone, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactInfo = new ContactInfo(phone, email); //Inner classın çağırılması
    }

    //Bilgilerin yazılması için metod
    public void displayInfo() {
        System.out.println("Çalışan: " + firstname + " " + lastname);
        System.out.println("Telefon: " + contactInfo.phone);
        System.out.println("Email: " + contactInfo.email);
    }

    //Inner Class
    class ContactInfo {
        String phone;
        String email;

        //Constructor
        ContactInfo(String phone, String email) {
            this.phone = phone;
            this.email = email;

        }
    }

    static void main() {
        Employee emp1 = new Employee("Bora", "Süt", "0555-555-5555", "bora@example.com");
        Employee emp2 = new Employee("Sarper", "Kaya", "0533-533-3333", "sarper@example.com");
        Employee emp3 = new Employee("Yaren", "Erol", "0531-531-3131", "yaren@example.com");
        Employee emp4 = new Employee("Okan", "Erturan", "0538-538-3838", "okan@example.com");
        Employee emp5 = new Employee("Nurşah", "Baş", "0532-532-3232", "nursah@example.com");
        Employee emp6 = new Employee("Ali", "Biner", "0541-541-4141", "alı@example.com");
        Employee emp7 = new Employee("Hilal", "Göral", "0534-534-3434", "hılal@example.com");
        Employee emp8 = new Employee("Asena", "Arıkan", "0535-535-3535", "asena@example.com");

        emp1.displayInfo();
        System.out.println("-------------");
        emp2.displayInfo();
        System.out.println("-------------");
        emp3.displayInfo();
        System.out.println("-------------");
        emp4.displayInfo();
        System.out.println("-------------");
        emp5.displayInfo();
        System.out.println("-------------");
        emp6.displayInfo();
        System.out.println("-------------");
        emp7.displayInfo();
        System.out.println("-------------");
        emp8.displayInfo();

    }
}
