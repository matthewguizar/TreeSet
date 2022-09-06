import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //red black tree under the hood
        //O(logN) MEMORY FRIENDLY
        //can use Comparator.reverseOrder() for descending order
        SortedSet<Integer> set = new TreeSet<>();

        set.add(12);
        set.add(1);
        set.add(9);
        set.add(5);
        set.add(120);
        set.add(87);
        set.add(55);

        //from sortedSet class
        Set<Integer> subSet = set.subSet(1, 5);
        //selects all items greater than / equal to 
        Set<Integer> tailSet = set.tailSet(5);
        //selects all that are smaller
        Set<Integer> headSet = set.headSet(20);

        for (Integer n : headSet){
            System.out.println(n);
        }

        //returns lowest item
        System.out.println(set.first());
        //returns highest item 
        System.out.println(set.last());


    }
}