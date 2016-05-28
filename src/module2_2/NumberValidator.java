package module2_2;


public class NumberValidator implements Validator<Number> {
    @Override
    public boolean isValid(Number result) {
        return result.intValue() <= 0;
    }
}