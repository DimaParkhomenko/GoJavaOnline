package practice_five;

/**
 Найменший Період

 A character string is said to have period k if it can be formed by concatenating one or more repetitions of another string of length k.
 For example, the string "abcabcabcabc" has period 3, since it is formed by 4 repetitions of the string "abc".
 It also has periods 6 (two repetitions of "abcabc") and 12 (one repetition of "abcabcabcabc").
 Write a program to read a character string and determine its smallest period
 Return (String) substring;
 */
public class KmpSmallestPeriod {
    public String findSmalletstPeriod(String input) {
        String result;
        int start = 0;
        int end = 1;

        while (true){
            result = input.substring(start, end);
            String stringToCompare = input.substring(end, end + result.length());
            if(result.equals(stringToCompare)){
                break;
            } else {
                end++;
            }
        }
        return result;
    }
}
