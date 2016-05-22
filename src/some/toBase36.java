package some;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Дано 2 числа в системі числення з основою 36. Будь-яка цифра може бути в межах [0-9a-z].
 * Повернути суму чисел, також в системі 36.
 * Наприклад:
 * "9" + "1" = "a"
 * "z" + "1" = "10"
 */
public class toBase36 {
    public static final BigInteger C36 = BigInteger.valueOf(36);
    public static void main(String[] args) {
        System.out.println(new toBase36().add("zjfghfhdsdfathjjhgjhghjfjfjhjhdsrreqqklhu456hfz5", "wsfgsgds56346263fgfhghfghfhgfsrr5476hjfgdhdhg3N"));
    }
    public String add(String a, String b) {
        BigInteger ad = toDecimal(a.toLowerCase());
        BigInteger bd = toDecimal(b.toLowerCase());
        BigInteger sum = ad.add(bd);
        return fromDecimal(sum);
    }

    public BigInteger toDecimal(String s){
        BigInteger result = new BigInteger("0");
        char[] chars = s.toCharArray();
        for(char c: chars){
            int diff = c>='0' && c<='9'
                    ? c-'0'
                    : c-'a'+10;
            result=result.multiply(C36).add(BigInteger.valueOf(diff));
        }
        return result;
    }

    public String fromDecimal(BigInteger i){
        StringBuilder sb = new StringBuilder();

        BigInteger n=i;
        while(n.compareTo(BigInteger.valueOf(0))>0){
            BigInteger modBI = n.mod(C36);
            int mod = modBI.intValue();
            char c = (char)(mod<=9
                    ? mod+'0'
                    : mod+'a'-10);
            sb.append(c);
            n=n.divide(C36);
        };

        return sb.reverse().toString();
    }
}


/*
    public String add(String a, String b) {

        return intToBase36(base36ToInt(a) + base36ToInt(b));
    }

    public static int base36ToInt(String str) {


        //make sure that each case is upper
        str = str.toUpperCase();
        //This function will convert a base36 string to it's int equivalent
        int result = 0;
        double frontVal = 0;
        double lastVal = 0;
        int size = str.length();
        boolean started = false;


        frontVal = char36ToInt(str.charAt(0));
        for (int i = 0; i < size; i++) {
            //TODO: log this println("frontVal = " + frontVal);

            if (i + 1 < size && (started || frontVal > 0.0)) {
                lastVal = char36ToInt(str.charAt(i + 1));
                //TODO: log this println("lastVal = " + lastVal);
                //should contain the temp result:
                frontVal = (frontVal + (lastVal / ((double) base))) * ((double) base);
                //TODO: log this println("new frontVal = " + frontVal);
            } else if (!started) {
                if (frontVal == 0.0 && i + 1 < size) {
                    lastVal = char36ToInt(str.charAt(i + 1));
                    if (lastVal > 0.0) {
                        frontVal = lastVal;
                        started = true;
                    }

                }
            }

        }
        result = (int) Math.round(frontVal);
        return result;
    }

    public static String intToBase36(int n) {//passed test for base36!
        //Converts an int value to a base36 string
        String result = "";
        ArrayList<String> list = new ArrayList<String>();
        int frontVal = 0;
        int lastVal = 0;
        int val = n;//preserve input
        frontVal = val;

        while (val >= base) {

            //val is greater than the base; so we need to continue loop until it is not

            frontVal = val / base;//store the front part
            lastVal = val % base;//store the last part
            //TODO log thisprintln("val = " + val + "\tfrontVal = " +frontVal + "\tlastVal = " + lastVal);
            list.add(Character.toString(intToChar36(lastVal)));
            val = frontVal;

        }

        //add last base36 digit
        if (frontVal > 0)
            list.add(Character.toString(intToChar36(frontVal)));

        //fill the rest of the string with 0s
       // for (int i = list.size(); i < MAX_digits; i++)
       //     list.add("0");

        //convert list to string, in order.
        for (int i = list.size() - 1; i >= 0; i--)
            result += list.get(i).toLowerCase();

        return result;
    }

    public static char intToChar36(int n) {//passed test!
        //Converts the integer value to the equivalent base 36 character
        char result = (char) 0;

        if (n >= 0 && n <= 9)
            result = (char) (48 + n);
        else if (n > 9 && n < base) {
            result = (char) (65 - 10 + n);
        }
        return result;
    }

    public static char intToChar35(int n) {//passed test!
        //Same as intToChar36; however it removes the 'E' char
        //Converts the integer value to the equivalent base 36 character
        char result = (char) 0;

        if (n >= 0 && n <= 9)
            result = (char) (48 + n);
        else if (n > 9 && n < 14) {
            result = (char) (65 - 10 + n);
        } else if (n > 13 && n < 36)
            result = (char) (65 - 10 + n + 1);
        return result;
    }

    public static int char36ToInt(char c) {//passed test!
        //Converts a base 36 character into its equivalent value in integer
        int result = 0;
        if (Character.isDigit(c))
            result = (int) c - 48;
        else if (Character.isAlphabetic(c)) {
            //-10 because 0-9 are our 1st 10 in base36
            if ((int) c <= 90) {
                result = (int) c - (65 - 10);

            }
        }
        return result;
    }

    public static int char35ToInt(char c) {//passed test!
        int result = char36ToInt(c);
        if (result > 13)
            result--;
        return result;

    }
}
*/



/*
    public static int base36ToBase10(String text) {

        String code = "0123456789abcdefghijklmnopqrstuvwxyz";
        int num = 0;
        int j = text.length();
        for (int i = 0; i < j; i++) {
            num += code.indexOf(text.charAt(0)) * Math.pow(code.length(), i);
            text = text.substring(1);
        }
        return num;
    }


    public static String base10ToBase36(int num) {
        String code = "0123456789abcdefghijklmnopqrstuvwxyz";
        String text = "";
        int j = (int) Math.ceil(Math.log(num) / Math.log(code.length()));
        for (int i = 0; i < j; i++) {
            //i goes to log base code.length() of num (using change of base formula)
            text += code.charAt(num % code.length());
            num /= code.length();
        }
        return text;
    }
}*/
   /* public String add(String a, String b){
        return base10ToBase36(base36ToBase10(a) + base36ToBase10(b));
    }
    private static String codeBase36 = "0123456789abcdefghijklmnopqrstuvwxyz";

    //"0123456789 abcdefghij klmnopqrst uvwxyz"
    //"0123456789 0123456789 0123456789 012345"


    private static String max36=base10ToBase36(Integer.MAX_VALUE);

    public static String base10ToBase36(int inNum) {
        if(inNum<0) {
            throw new NumberFormatException("Value  "+inNum +"  to small");
        }
        int num = inNum;
        String text = "";
        int j = (int)Math.ceil(Math.log(num)/Math.log(codeBase36.length()));
        for(int i = 0; i < j; i++){
            text = codeBase36.charAt(num%codeBase36.length())+text;
            num /= codeBase36.length();
        }
        return text;
    }
    public  static int base36ToBase10(String in) {
        String text = in.toLowerCase();
        if(text.compareToIgnoreCase(max36)>0) {
            throw new NumberFormatException("Value  "+text+"  to big");
        }

        if(!text.replaceAll("(\\W)","").equalsIgnoreCase(text)){
            throw new NumberFormatException("Value "+text+" false format");
        }
        int num=0;
        int j = text.length();
        for(int i = 0; i < j; i++){
            num += codeBase36.indexOf(text.charAt(text.length()-1))*Math.pow(codeBase36.length(), i);
            text = text.substring(0,text.length()-1);
        }
        return num;
    }*/
