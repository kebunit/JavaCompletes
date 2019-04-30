package kebunit.collection;

/**
 *
 * @author Sabituddin Bigbang
 * @since 2019
 *
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    private Map<String, String> map;

    // constructor
    public MapExample( ) {
        map = new HashMap<String, String>();
        map.put("nama", "Sabituddin Bigbang");
        map.put("email", "kebunit@gmail.com");
        map.put("asal_negara", "Indonesia");
        map.put("agama", "Islam");
    }

    // method
    public void printMap() {
        System.out.println("Map Elements is : ");
        System.out.println(map);
        System.out.println("-------------------------------[GET] ");
        System.out.println("Nama         : " + map.get("nama"));
        System.out.println("Agama        : " + map.get("agama"));
        System.out.println("Asal Negara  : " + map.get("asal_negara"));
        System.out.println("E-mail       : " + map.get("email"));
    }

    public void printMapWithFor() {
        System.out.println("\n\n-----------------------------[FOR]");
        for(Map.Entry<String, String> item : map.entrySet()) {
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }

    public void printMapWithIterator() {
        System.out.println("\n\n-----------------------------[WHILE]");
        Set<Map.Entry<String, String>> set = map.entrySet();
        Iterator<Map.Entry<String, String>> i = set.iterator();
        while(i.hasNext()) {
            Map.Entry<String, String> item = (Map.Entry<String, String>) i.next();
            System.out.print(item.getKey() + ": ");
            System.out.println(item.getValue());
        }
    }

    // Main Application
    public static void main(String[] args) {
        MapExample ME = new MapExample();
        ME.printMap();
        ME.printMapWithFor();
        ME.printMapWithIterator();
    }

}