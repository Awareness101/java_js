package handwrittencode;

import java.util.Comparator;


public class TurtleComparator implements Comparator<Turtle> {
    @Override
    public int compare(Turtle o1, Turtle o2) {
        return o1.age - o2.age;
    }
}
