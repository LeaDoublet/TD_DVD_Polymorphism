package org.example;


public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.year = validateYear(year);
        this.month = validateMonth(month);
        this.day = validateDay(day);
    }

    private int validateYear(int year) {
        if (year < 1) {
            System.out.println(" Error : c'est incorrecte on met a 1 par defaut");
            return 1;
        }
        return year;
    }

    private int validateMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println(" Error : c'est incorrecte on met a 1 par defaut");
            return 1;
        }
        return month;
    }

    private int validateDay(int day) {
        if (day < 1) {
            System.out.println(" Error : c'est incorrecte on met a 1 par defaut");
            return 1;
        }

        int maxDaysInMonth = getMaxDaysInMonth(this.year, this.month);
        if (day > maxDaysInMonth) {
            System.out.println(" Error : c'est incorrecte on met a 1 par defaut");
            return 1;
        }

        return day;
    }

    private int getMaxDaysInMonth(int year, int month) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[month];
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public void displayDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}

