package CollectionFramework;

import java.util.HashSet;

public class UseHashSetPage586 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Бета");
        hashSet.add("Альфа");
        hashSet.add("Эта");
        hashSet.add("Гамма");
        hashSet.add("Эпсилон");
        hashSet.add("Омега");

        //порядок вызова эллементов может варироваться
        System.out.println(hashSet);

    }
}
