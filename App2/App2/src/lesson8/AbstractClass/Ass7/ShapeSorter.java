package lesson8.AbstractClass.Ass7;

public class ShapeSorter {
    // Method to sort an array of SortableShape objects based on their areas
    static void sort(SortableShape[] shapes) {
        // Using bubble sort for simplicity
        int n = shapes.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (shapes[j].area() > shapes[j + 1].area()) {
                    // Swap shapes[j] and shapes[j+1]
                    SortableShape temp = shapes[j];
                    shapes[j] = shapes[j + 1];
                    shapes[j + 1] = temp;
                }
            }
        }

    }
}
