package lesson8.GenericMaximizer;

import java.util.Comparator;

public class Maximizer<T> {
    private T[] array;

    public Maximizer(T[] array) {
        this.array = array;
    }

    public T max(Comparator<T> comparator) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        T maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (comparator.compare(array[i], maxElement) > 0) {
                maxElement = array[i];
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        // Test Maximizer with Integer array
        Integer[] intArray = { 5, 3, 8, 1, 7 };
        Maximizer<Integer> intMaximizer = new Maximizer<>(intArray);
        Integer maxInt = intMaximizer.max(Integer::compare);
        System.out.println("Maximum Integer: " + maxInt);

        // Test Maximizer with String array
        String[] stringArray = { "apple", "orange", "banana", "grape" };
        Maximizer<String> stringMaximizer = new Maximizer<>(stringArray);
        String maxString = stringMaximizer.max(String::compareTo);
        System.out.println("Maximum String: " + maxString);

        // Test Maximizer with Double array
        Double[] doubleArray = { 3.14, 2.0, 5.5, 1.2 };
        Maximizer<Double> doubleMaximizer = new Maximizer<>(doubleArray);
        Double maxDouble = doubleMaximizer.max(Double::compare);
        System.out.println("Maximum Double: " + maxDouble);
    }
}
