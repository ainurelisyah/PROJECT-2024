package lesson8.AbstractClass.Ass4;

public class SortingTest {
    public static void main(String[] args) {
        int[] array1 = { 64, 34, 25, 12, 22, 11, 90 };
        int[] array2 = { 42, 13, 7, 21, 56, 34, 90, 1, 89 };

        // Test BubbleSort
        testSortingAlgorithm(new BubbleSort(), array1.clone(), "Bubble Sort");
        testSortingAlgorithm(new BubbleSort(), array2.clone(), "Bubble Sort");

        // Test SelectionSort
        testSortingAlgorithm(new SelectionSort(), array1.clone(), "Selection Sort");
        testSortingAlgorithm(new SelectionSort(), array2.clone(), "Selection Sort");

        // Test InsertionSort
        testSortingAlgorithm(new InsertionSort(), array1.clone(), "Insertion Sort");
        testSortingAlgorithm(new InsertionSort(), array2.clone(), "Insertion Sort");
    }

    private static void testSortingAlgorithm(Sortable sortingAlgorithm, int[] array, String algorithmName) {
        long startTime = System.nanoTime();
        sortingAlgorithm.sort(array);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println(algorithmName + "Result: " + arrayToString(array));
        System.out.println(algorithmName + "Execution Time: " + duration + " nanoseconds\n");
    }

    private static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
