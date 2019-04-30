package kebunit.collection;

/**
 *
 * @author Sabituddin Bigbang
 * @since 2019
 *
 */

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    private Set<Integer> set;
    private TreeSet<Integer> sortedSet;
    // constructor
    public SetExample() {
        set = new HashSet<Integer>();
        set.add(1000);
        set.add(10000);
        set.add(4000);
        set.add(5000);
        set.add(8000);
        set.add(5000);
        set.add(7000);
    }

    //method
    public void printSortedSet() {
        setSortedSet(new TreeSet<Integer>(set));
        System.out.println("The sorted list is : ");
        System.out.println(sortedSet);
        System.out.println("First : " + sortedSet.first());
        System.out.println("Last : " + sortedSet.last());
    }

    public void printSet() {
        System.out.println("The list is : ");
        System.out.println(set);
    }

    public TreeSet<Integer> getSortedSet() {
        return sortedSet;
    }

    public void setSortedSet(TreeSet<Integer> sortedSet) {
        this.sortedSet = sortedSet;
    }

    public static void main(String[] args) {
        SetExample SE = new SetExample();
        SE.printSet();
        SE.printSortedSet();
    }
}