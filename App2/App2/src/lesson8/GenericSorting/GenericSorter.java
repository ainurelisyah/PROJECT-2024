package lesson8.GenericSorting;

public class GenericSorter<T extends Comparable<T>> {
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
        T[] leftArray = (T[]) new Comparable[n1];
        T[] rightArray = (T[]) new Comparable[n2];

        // Copy data to temporary arrays
        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

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

    public static void main(String[] args) {
        // Test GenericSorter with Integer array
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        GenericSorter<Integer> intSorter = new GenericSorter<>();
        intSorter.sort(intArray);

        System.out.print("Sorted Integer array: ");
        printArray(intArray);

        // Test GenericSorter with String array
        String[] stringArray = {"apple", "orange", "banana", "grape", "kiwi"};
        GenericSorter<String> stringSorter = new GenericSorter<>();
        stringSorter.sort(stringArray);

        System.out.print("Sorted String array: ");
        printArray(stringArray);
    }

    // Helper method to print an array
    private static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

