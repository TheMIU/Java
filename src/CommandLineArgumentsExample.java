public class CommandLineArgumentsExample {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Command-line arguments provided:");
            
            // Print each command-line argument
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command-line arguments provided.");
        }
    }
}

// directly run will print "No command-line arguments provided."
// to give arguments, write in terminal,
// ***path***\Java\src> javac CommandLineArgumentsExample.java
// ***path***\Java\src> java CommandLineArgumentsExample hi hello hee
// this will output given arguments 