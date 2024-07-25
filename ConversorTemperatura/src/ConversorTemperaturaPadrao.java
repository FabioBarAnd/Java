public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void FahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " = " + celsius);
    }

    @Override
    public void CelsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println(celsius + " = " + fahrenheit);
    }
}
