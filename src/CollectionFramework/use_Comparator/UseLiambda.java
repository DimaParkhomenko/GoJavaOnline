package CollectionFramework.use_Comparator;

import java.util.TreeSet;

public class UseLiambda {
    public static void main(String[] args) {
       MyComp aStr = new MyComp();
       MyComp bStr = new MyComp();

        //передать компаратор с обратным упорядочением древовидному множеству TreeSet

       // TreeSet<String> ts = new TreeSet<String>(aStr, bStr) -> bStr.compareTo(aStr));

    }
}
