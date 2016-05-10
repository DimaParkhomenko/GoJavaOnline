package practiceOne;

/*Обчислити суму цифр числа.
  Наприклад сума цифр числа 123 дорівнює  6.
*/
public class SumDigits {
    public int sum(int number) {
        int n;
        int sum = 0;
        if (number >= 0) {
            for (n = number; n != 0; n /= 10) {
                sum = sum + (n % 10);
            }
        } else {
            for (n = number; n != 0; n /= 10) {
                sum = sum - (n % 10);
            }
        }
        return sum;
    }
}
