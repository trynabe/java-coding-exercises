public class UnitConverter {
    public double celsiusToFahrenheit(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Temperature cannot be below absolute zero (-273.15)");
        }
        return (celsius * 9 / 5) + 32;
    }

    public double metersToFeet(double meters) {
        if (meters < 0) {
            throw new IllegalArgumentException("Distance cannot be negative");
        }
        return meters * 3.28084;
    }

    public double kilogramsToPound(double kilograms) {
        if (kilograms < 0) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        return kilograms * 2.20462;
    }
}
