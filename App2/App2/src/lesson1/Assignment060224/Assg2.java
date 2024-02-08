package lesson1.Assignment060224;

import java.util.Arrays;
import java.util.Scanner;

public class Assg2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Enter array size and range
        System.out.print("Please insert the number of values: ");
        int length = scanner.nextInt();

        System.out.print("Insert the minimum number: ");
        int min = scanner.nextInt();

        System.out.print("Insert the maximum number: ");
        int max = scanner.nextInt();

        //Generate & display random array
        int[] randoms = genRandomIntArray(length, min, max);
        System.out.println("Random Array: " + Arrays.toString(randoms));
      
        //Sort the array
        Arrays.sort(randoms); 
        System.out.println("Sorted Array: " + Arrays.toString(randoms));

        //Calculate and display mean, mode and median
        double mean = calcMean(randoms);
        int mode = calcMode(randoms);
        double median = calcMedian(randoms);

        System.out.println("Mean: " + mean);
        System.out.println("Mode: " + mode);
        System.out.println("Median: " + median);
   
        scanner.close();
    }

    //Function to generate a random array
    public static int[] genRandomIntArray(int length, int min, int max) {
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = (int) Math.round(Math.random() * (max - min) + min);
        }
        return array;
    }

    //Function to calculate the mean of an array
    public static double calcMean(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }

    //Function to calculate the mode of an array
    //Using maxfrequency & hashmap
    public static int calcMode(int[] array) {
        return 0;
    }

    // Function to calculate the median of an array
    public static double calcMedian(int[] array) {
        int length = array.length;        //calculate the length of array
        if (length % 2 == 0) {            // to check if the length of the array is even
            int middle1 = array[length / 2 - 1]; //retrieves the first middle element (left-middle)
            int middle2 = array[length / 2];     //retrieves the second middle element (right-middle)
            return (double) (middle1 + middle2) / 2; //calculates and returns the average of the two middle elements
        } else {
            return array[length / 2]; //returns the single middle element
        }
    }
}

