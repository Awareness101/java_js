package handwrittencode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionTest {
    /*
    collection :list , set
    map
     */
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(12);
        list.add("string");
        list.add(new String("we"));
       // list.clear();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
