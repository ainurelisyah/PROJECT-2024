package lesson7.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static String filename = "file.txt";
    static String sourcefilename = "example.txt";
    static String targetfilename = "exercise.txt";

    public static void main(String[] args) throws IOException{
        // Readfile & print the file
        ReadFile readFile = new ReadFile(filename);
        readFile.printFile();

        // Count words
        CountWords countWords = new CountWords(filename);
        int count = countWords.countWords();
        System.out.println("Length of words: " + count);
        
        // Write File
        WriteFile writeFile = new WriteFile(filename);
        writeFile.write("Write some text \n Write some more text");
        readFile.printFile();
        
        //Copy File
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of the file to copy from: ");
        String sourceFileName = scanner.nextLine();

        System.out.println("Enter name of the file to copy to : ");
        String targetFileName = scanner.nextLine();

        //Create CopyFile object and perform the copy
        CopyFile copy = new CopyFile(sourceFileName, targetFileName);
        copy.copyFile(); //Call the method directly
        System.out.println("Successfully copied content from " + sourceFileName + );

    }
}
