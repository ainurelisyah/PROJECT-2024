package lesson8.GenericAlgorithm;

import java.util.Arrays;

public class Algorithm<T extends Comparable<T>> {
    // Sorting algorithm (using mergesort)
    public void sort(T[] array) {
        if (array == null || array.length <= 1) {
            return; // Already sorted or empty array
        }

        mergesort(array, 0, array.length - 1);
    }

    private void mergesort(T[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursive calls for the two halves
            mergesort(array, left, mid);
            mergesort(array, mid + 1, right);

            // Merge the two halves
            merge(array, left, mid, right);
        }
    }

    private void merge(T[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        T[] leftArray = Arrays.copyOfRange(array, left, left + n1);
        T[] rightArray = Arrays.copyOfRange(array, mid + 1, mid + 1 + n2);

        // Merge the two arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray, if any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray, if any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Searching algorithm (binary search)
    public int search(T[] array, T target) {
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
        // Test Algorithm with Integer array (sorting and searching)
        Algorithm<Integer> intAlgorithm = new Algorithm<>();
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        System.out.print("Original Integer array: ");
        printArray(intArray);

        intAlgorithm.sort(intArray);
        System.out.print("Sorted Integer array: ");
        printArray(intArray);

        int intTarget = 6;
        int searchResult = intAlgorithm.search(intArray, intTarget);
        System.out.println("Binary Search - Integer: Target " + intTarget +
                           (searchResult != -1 ? " found at index " + searchResult : " not found"));

        // Test Algorithm with String array (sorting and searching)
        Algorithm<String> stringAlgorithm = new Algorithm<>();
        String[] stringArray = {"apple", "banana", "orange", "kiwi", "melon"};
        System.out.print("Original String array: ");
        printArray(stringArray);

        stringAlgorithm.sort(stringArray);
        System.out.print("Sorted String array: ");
        printArray(stringArray);

        String stringTarget = "orange";
        int searchResultStr = stringAlgorithm.search(stringArray, stringTarget);
        System.out.println("Binary Search - String: Target '" + stringTarget +
                           (searchResultStr != -1 ? "' found at index " + searchResultStr : "' not found"));
    }

    // Helper method to print an array
    private static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

