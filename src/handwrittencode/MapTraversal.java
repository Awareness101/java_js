package handwrittencode;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTraversal {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put(1,"bad");
        map.put(2,"pain");
        map.put(3,"attract");
        map.put(4,"ache");
        map.put(5,"cold");
        map.put(6,"burst");
        map.put(7,"lost");
        map.put(8,"badMemory");
        map.put(9,"ice");
        map.put(10,"warm");
        //two traversal methods of map
        //the first traversal method

        //Use the for loop
        Set sets = map.keySet();
        System.out.println("Use the for loop:");
        for (Object set: sets) {
//            System.out.println("Use the for loop:");
            System.out.println("key-->"+set+",value-->"+map.get(set));

        }
        //Use iterator to traverse
        System.out.println("Use the iterator to traverse:");
        Iterator iterator = sets.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println("key--->"+next+",value--->"+map.get(next));

        }

        //the second traversal method(entrySet way)

        //use the for loop(entrySet)
        System.out.println("<------------------------------------------------------>");
        System.out.println("use the for loop(entrySet):");
        Set<Map.Entry> entrySet = map.entrySet();
        for (Map.Entry node: entrySet){
            System.out.println("key--->"+node.getKey()+",value---->"+node.getValue());

        }
        //use the iterator to traverse(entrySet way)
        System.out.println("use the iterator to traverse(entrySet way)");
        Iterator<Map.Entry> iteratorEntrySets = map.entrySet().iterator();
        while (iteratorEntrySets.hasNext()){
            Map.Entry next = iteratorEntrySets.next();
            System.out.println("key--->"+next.getKey()+",value---->"+ next.getValue());

        }


    }
}
