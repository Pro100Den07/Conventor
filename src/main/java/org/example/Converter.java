package org.example;

public class Converter {
    public static void main(String[] args) {
        // Виведення інформації про проект
        System.out.println("Проект: Конвертер миль і кілометрів");

        // Приклад конвертації
        double miles = 5;
        double kilometers = convertMilesToKilometers(miles);
        System.out.println(miles + " миль = " + kilometers + " кілометрів");

        miles = convertKilometersToMiles(kilometers);
        System.out.println(kilometers + " кілометрів = " + miles + " миль");
    }

    // Функція конвертації миль в кілометри
    public static double convertMilesToKilometers(double miles) {
        return miles * 1.60934;
    }

    // Функція конвертації кілометрів в милі
    public static double convertKilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
}