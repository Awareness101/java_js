package handwrittencode;

import java.util.Collection;
import java.util.TreeSet;

public class ComparatorTest {
    public static void main(String[] args) {
        Collection treeSet = new TreeSet(new TurtleComparator());
        treeSet.add(new Turtle(10));
        treeSet.add(new Turtle(100));
        treeSet.add(new Turtle(123));
        treeSet.add(new Turtle(346));
        for (Object turtle: treeSet ){
            System.out.println(turtle);

        }

    }
    
    
    
}
