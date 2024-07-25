public class Main {
    public static void main(String[] args) {
        double celsius = 32;
        double fahrenheit = 64;

        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.CelsiusToFahrenheit(celsius);

        conversor.FahrenheitToCelsius(fahrenheit);
    }
}