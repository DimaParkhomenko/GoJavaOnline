package test.module4.ex2_temperature;

/**
 * Создать класс преобразующий значение температуры по шкале Цельсия
 * в значение по шкале Фаренгейта и в обратном направлении.
 */
public class ConvertsTemperature {

    private int celsiusDegree;
    private int fahrenheitDegree;

    public int getCelsiusDegree() {
        return celsiusDegree;
    }

    public int getFahrenheitDegree() {
        return fahrenheitDegree;
    }

    public void setCelsiusDegree(int celsiusDegree) {
        this.celsiusDegree = celsiusDegree;
    }

    public void setFahrenheitDegree(int fahrenheitDegree) {
        this.fahrenheitDegree = fahrenheitDegree;
    }

    public double celsiusToFahrenheit() {
        double convertCelsiusToFahrenheit = celsiusDegree * 33.8;
        return convertCelsiusToFahrenheit;
    }

    public double fahrenheitToCelsius() {
        double convertFahrenheitToCelsius = celsiusDegree / 33.8;
        return convertFahrenheitToCelsius;
    }
}


