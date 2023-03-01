package handwrittencode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSetTest {
    public static void main(String[] args) {

        Set set = new HashSet();
        set.add("sting");
        set.add("rice");
        set.add(689);
        set.add(45);
        set.add(1009);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
