package ru.example;

public class UnitConverter {
    public static double convertToMeters(double value, String unit) {
        switch (unit.toLowerCase()) {
            case "cm":
                return value / 100;
            case "mm":
                return value / 1000;
            case "ft":
                return value * 0.3048;
            case "in":
                return value * 0.0254;
            default:
                return value;
        }
    }
}
