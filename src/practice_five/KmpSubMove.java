package practice_five;

/**
 Циклічний Зсув

 Дается строка в которой делается несколько циклических сдвигов
 (под циклическим сдвигом понимается перенос последней буквы в начало)
 Дается также получившаяся строка
 нужно вернуть минимальное количество сдвигов(int) которым можно получить из 1-й строки итоговую
 если строку получить циклическим сдвигом нельзя то вывести -1

 Например
 Дано:
 abcd
 cdab

 ответ: 2
 */
public class KmpSubMove {
    public int subMoveQuantity(String inputStr, String resultStr) {
        int count = 0;

        StringBuilder str = new StringBuilder(inputStr);

        while (count < inputStr.length()){
            if(inputStr.equals(resultStr)){
                return count;
            } else {
                str.delete(0, str.length());
                str.append(inputStr.substring(inputStr.length()-1));
                str.append(inputStr.substring(0, inputStr.length() - 1));

                inputStr = str.toString();
                count++;
            }
        }

        return -1;
    }
}
