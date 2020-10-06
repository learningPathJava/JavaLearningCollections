package eu.learn.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();

        // Add elements to an ArrayList
        strings.add("bala");
        strings.add("ala");
        integers.add(20);
        integers.add(10);

        // Adding 30 to position 1 in ArrayList
        integers.add(0, 30);
        //strings.add(1, "ala");
        addElement(strings, "ala");

        // Change an element in ArrayList
        strings.set(2, "portocala");

        // Displaying elements
        System.out.println(strings + "\n" + integers);

        // Remove elements from ArrayList
        strings.remove(2);
        integers.remove(0);

        // Iterating ArrayList
        for (String str : strings) {
            System.out.println(str);
        }
        integers.forEach(System.out::println);

        // ArrayList Size
        System.out.println("Number of elements in strings ArrayList: " + strings.size());
        System.out.println("Number of elements in integers ArrayList: " + integers.size());

        // Sort ArrayList - We have a sort() method in the Collections class
        Collections.sort(strings);
        strings.forEach(System.out::println);
        Collections.sort(integers);
        integers.forEach(System.out::println);
    }

    /**
     * int indexOf(Object o):
     * Gives the index of the object o.
     * If the element is not found in the list then this method returns the value -1.
     */
    private static void addElement (Collection arrayList, Object element) {
        arrayList.add(element);
    }
}
