package lesson8.GenericMap;

import java.util.HashMap;
import java.util.Map;

public class GenericMap<K, V> {
    private Map<K, V> map;

    // Constructor
    public GenericMap() {
        this.map = new HashMap<>();
    }

    // Add a key-value pair to the map
    public void add(K key, V value) {
        map.put(key, value);
    }

    // Retrieve the value associated with a key
    public V get(K key) {
        return map.get(key);
    }

    // Check if a key exists in the map
    public boolean containsKey(K key) {
        return map.containsKey(key);
    }

    // Remove a key-value pair from the map
    public void remove(K key) {
        map.remove(key);
    }

    public static void main(String[] args) {
        // Test GenericMap with Integer keys and String values
        GenericMap<Integer, String> intStringMap = new GenericMap<>();
        intStringMap.add(1, "One");
        intStringMap.add(2, "Two");
        intStringMap.add(3, "Three");

        System.out.println("Value for key 2: " + intStringMap.get(2));
        System.out.println("Does the map contain key 4? " + intStringMap.containsKey(4));

        intStringMap.remove(1);
        System.out.println("Does the map contain key 1 after removal? " + intStringMap.containsKey(1));

        // Test GenericMap with String keys and Double values
        GenericMap<String, Double> stringDoubleMap = new GenericMap<>();
        stringDoubleMap.add("Pi", 3.14);
        stringDoubleMap.add("E", 2.71);

        System.out.println("Value for key 'Pi': " + stringDoubleMap.get("Pi"));
        System.out.println("Does the map contain key 'Phi'? " + stringDoubleMap.containsKey("Phi"));
    }
}

