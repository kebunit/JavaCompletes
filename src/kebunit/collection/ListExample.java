package kebunit.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    private List<String> myList;
    private List<Integer> myList2;

    // constructor
    public ListExample() {
        myList = new ArrayList<String>();
        myList.add("Sabit");
        myList.add("Bitud");
        myList.add("Uddin");
        myList.add("Bigbang");

        myList2 = new LinkedList<Integer>();
        myList2.add(100);
        myList2.add(200);
        myList2.add(300);
        myList2.add(400);
    }

    // method
    public void printList() {
        System.out.println("LIST STRING With ArrayList");
        System.out.println(myList);
        System.out.println("LIST INTEGER with LinkedList");
        System.out.println(myList2);
    }

    // Main Application
    public static void main(String args[]) {
        ListExample LE = new ListExample();
        LE.printList();
    }

}