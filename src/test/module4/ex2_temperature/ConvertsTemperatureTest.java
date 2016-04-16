package test.module4.ex2_temperature;
import module4.ex2_temperature.*;

import org.junit.Assert;
import org.junit.Test;

public class ConvertsTemperatureTest {

    @Test(timeout = 3000)
    public void testCelsiusToFahrenheit() throws Exception {
        final double fahrenheitDegree = 709.8;

        ConvertsTemperature convertsTemperature = new ConvertsTemperature();
        convertsTemperature.setCelsiusDegree(21);
        final double value = convertsTemperature.celsiusToFahrenheit();

        Assert.assertEquals(fahrenheitDegree, value, 0.1);
    }

    @Test(timeout = 3000)
    public void testFahrenheitToCelsius() throws Exception {
        final double celsiusDegree = 21;

        ConvertsTemperature convertsTemperature = new ConvertsTemperature();
        convertsTemperature.setFahrenheitDegree(709);
        final double value = convertsTemperature.fahrenheitToCelsius();

        Assert.assertEquals(celsiusDegree, value, 0.1);
    }
}
