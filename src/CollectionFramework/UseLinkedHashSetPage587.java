package CollectionFramework;

import java.util.LinkedHashSet;

public class UseLinkedHashSetPage587 {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("Бета");
        hashSet.add("Альфа");
        hashSet.add("Эта");
        hashSet.add("Гамма");
        hashSet.add("Эпсилон");
        hashSet.add("Омега");

        //В отличие от HashSet порядок эллементов отображается так как был введен
        System.out.println(hashSet);
    }
}
