package input_output_streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) {
        try {
            InputStream input = new FileInputStream("output.txt");
            int data;
            while ((data = input.read()) != -1) {
                // Print data inside in "output.txt"
                System.out.print((char) data);
            }
            input.close();
        } catch (IOException e) {
            System.out.println("output.txt file not found. First run 'OutputStreamExample.java' to create it");
        }
    }
}
