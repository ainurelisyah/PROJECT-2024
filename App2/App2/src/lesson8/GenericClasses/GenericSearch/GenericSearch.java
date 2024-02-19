package lesson8.GenericClasses.GenericSearch;

public class GenericSearch<T extends Comparable<T>> {
    // Linear search
    public int linearSearch(T[] array, T target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i;
            }
        }
        return -1; // Not found
    }

    // Binary search (requires the array to be sorted)
    public int binarySearch(T[] array, T target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid].equals(target)) {
                return mid; // Found at index mid
            } else if (array[mid].compareTo(target) < 0) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        // Test GenericSearch with Integer array
        Integer[] intArray = {1, 3, 5, 7, 9, 11, 13};
        GenericSearch<Integer> intSearch = new GenericSearch<>();

        int intTarget = 7;
        int linearResult = intSearch.linearSearch(intArray, intTarget);
        int binaryResult = intSearch.binarySearch(intArray, intTarget);

        System.out.println("Linear Search - Integer: Target " + intTarget + " found at index " + linearResult);
        System.out.println("Binary Search - Integer: Target " + intTarget + " found at index " + binaryResult);

        // Test GenericSearch with String array
        String[] stringArray = {"apple", "banana", "orange", "kiwi", "melon"};
        GenericSearch<String> stringSearch = new GenericSearch<>();

        String stringTarget = "orange";
        int linearResultStr = stringSearch.linearSearch(stringArray, stringTarget);
        int binaryResultStr = stringSearch.binarySearch(stringArray, stringTarget);

        System.out.println("Linear Search - String: Target '" + stringTarget + "' found at index " + linearResultStr);
        System.out.println("Binary Search - String: Target '" + stringTarget + "' found at index " + binaryResultStr);
    }
}
