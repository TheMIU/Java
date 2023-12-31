package input_output_streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) {
        try {
            OutputStream output = new FileOutputStream("output.txt");
            String message = " Hello!"
                    + "\n This is the first line "
                    + "\n This is the second line "
                    + "\n bye!";
            byte[] data = message.getBytes();
            output.write(data);
            output.close();
            System.out.println("Done!");
        } catch (IOException e) {
            System.out.println("Failed to write.");
        }
    }
}
