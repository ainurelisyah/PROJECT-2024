package lesson3;
import java.util.Arrays;
import java.util.Random;

public class GenRandomArray {
    public static void main(String[] args) {
        int length = 10;
        int min = 0;
        int max = 99;
        int[] randoms = genRandomIntArray(length, min, max);
        System.out.println(Arrays.toString(randoms));
    }

    //function to generate a random array 
    public static int[] genRandomIntArray(int length, int min, int max) {
        int[] line = new int[length];

        for (int i = 0; i < length; i++) {
            line[i] = (int) Math.round(Math.random() * (max - min) + min);
            
        }
        return line;
    }

    //pseudorandom => Random()
    public static int[] genRandomIntArray2(int length, int min, int max){ //generate random numbers based on the length, min and max
        int [] arr = new int[length]; 
        Random random = new Random();
        
        for (int i = 0; i < length; i++){
            int rand = random.nextInt(max);
            arr[i] = rand > min ? rand : rand + min;
        }
        return arr;
    }

}
