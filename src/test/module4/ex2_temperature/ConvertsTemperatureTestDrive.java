package test.module4.ex2_temperature;

public class ConvertsTemperatureTestDrive {
    public static void main(String[] args) {
        ConvertsTemperature convertsTemperature = new ConvertsTemperature();
        convertsTemperature.setCelsiusDegree(21);
        convertsTemperature.setFahrenheitDegree(263);

        System.out.println(convertsTemperature.getCelsiusDegree() + " градусов Цельсия по шкале Фаренгейта равняется " + convertsTemperature.celsiusToFahrenheit() + ";");
        System.out.println(convertsTemperature.getFahrenheitDegree() + " градусов Фаренгейтая по шкале Цельсия равняется " + Math.round(convertsTemperature.fahrenheitToCelsius()) + ";");
    }
}
