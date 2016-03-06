package module4.ex2_temperature;

/**
 * Создать класс преобразующий значение температуры по шкале Цельсия
 * в значение по шкале Фаренгейта и в обратном направлении.
 */
public class ConvertsTemperature {
    public static void main(String[] args) {
        int celsiusDegree = 21;
        System.out.println(celsiusDegree + " градусов Цельсия по шкале Фаренгейта равняется " + celsiusToFahrenheit(celsiusDegree) + ";");

        int fahrenheitDegree = 263;
        System.out.println(fahrenheitDegree + " градусов Фаренгейтая по шкале Цельсия равняется " + Math.round(fahrenheitToCelsius(fahrenheitDegree)) + ";");
    }
    public static double celsiusToFahrenheit(int celsiusDegree) {
        double convertCelsiusToFahrenheit = celsiusDegree * 33.8;
        return convertCelsiusToFahrenheit;
    }

    public static double fahrenheitToCelsius(int celsiusDegree) {
        double convertFahrenheitToCelsius = celsiusDegree / 33.8;
        return convertFahrenheitToCelsius;
    }
}


