package exceptions.checked_vs_unchecked;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// Checked Exceptions (compile time exceptions)
// cant write without try catch, gives compile time exception
class CheckedExceptionExample {
     public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            FileReader fr = new FileReader(file); // This line may throw FileNotFoundException
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found! \n" + e);
        }
    }
}
