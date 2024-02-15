package lesson7.exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAppending {
    private String fileName;

    public FileAppending(String fileName){
        this.fileName = fileName;
    }

    public void appending() throws IOException{
        //Initialize scanner and writer
        Scanner scanner = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        
        //Ask for text that want to be append to file
        System.out.println("Please enter the text: ");
        writer.write(scanner.nextLine());
        writer.newLine();

        //Close all object
        writer.close();
        scanner.close();
        System.out.println("The file were appended.");
    }
}
