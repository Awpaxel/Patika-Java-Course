package Enums;

import java.util.Scanner;

public enum EnumsHomework {
    SUNDAY("09:00 - 17:00"),
    MONDAY("09:00 - 17:00"),
    TUESDAY("09:00 - 17:00"),
    WEDNESDAY("09:00 - 17:00"),
    THURSDAY("09:00 - 17:00"),
    FRIDAY("09:00 - 17:00"),
    SATURDAY("10:00 - 14:00"); // örnek: Cumartesi kısa mesai

    private final String workHour;

    // Constructor → enum sabitlerinin parametresini almak için
    EnumsHomework(String workHour) {
        this.workHour = workHour;
    }

    public String getWorkHour() {
        return workHour;
    }
}
