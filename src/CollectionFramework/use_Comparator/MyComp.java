package CollectionFramework.use_Comparator;

import java.util.Comparator;

class MyComp implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;
        //выполнить сравнение в обратном порядке
        return bStr.compareTo(aStr);
    }
}

