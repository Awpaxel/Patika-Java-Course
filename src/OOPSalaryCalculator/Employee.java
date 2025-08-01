package OOPSalaryCalculator;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    // Constructor
    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesaplama metodu
    public double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    // Bonus hesaplama metodu
    public int bonus() {
        if (workHours > 40) {
            int fazlaSaat = workHours - 40;
            return fazlaSaat * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int calismaYili = 2021 - hireYear;
        if (calismaYili < 10) {
            return salary * 0.05;
        } else if (calismaYili < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }
    @Override
    public String toString () {
        double vergi = tax();
        int bonus = bonus();
        double zam = raiseSalary();

        double vergiBonusMaaş = salary - vergi + bonus;
        double toplamMaas = salary + zam;

        return "Adı : " + name +
                "\nMaaşı : " + salary +
                "\nÇalışma Saati : " + workHours +
                "\nBaşlangıç Yılı : " + hireYear +
                "\nVergi : " + vergi +
                "\nBonus : " + bonus +
                "\nMaaş Artışı : " + zam +
                "\nVergi ve Bonuslar ile birlikte maaş : " + vergiBonusMaaş +
                "\nToplam Maaş : " + toplamMaas;
    }
        }



