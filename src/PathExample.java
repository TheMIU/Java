import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        // Creating a Path using Paths.get() method
        Path path = Paths.get("C:\\Users\\Username\\Documents\\example.txt");
        // this will not create txt file, just a path only
        // to create -> Files.createFile(path);

        // Displaying information about the path
        System.out.println("Path: " + path.toString()); // Path: C:\Users\Username\Documents\example.txt
        System.out.println("File Name: " + path.getFileName()); // File Name: example.txt
        System.out.println("Parent: " + path.getParent()); // Parent: C:\Users\Username\Documents
        System.out.println("Root: " + path.getRoot()); // Root: C:\
        System.out.println("Number of elements in the path: " + path.getNameCount());
        // Number of elements in the path: 4

        // Iterating over the elements in the path
        System.out.println("Elements in the path:");
        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println("Element " + i + ": " + path.getName(i));
        }
        // Element 0: Users
        // Element 1: Username
        // Element 2: Documents
        // Element 3: example.txt

        // Converting the path to an absolute path
        Path absolutePath = path.toAbsolutePath();
        System.out.println("Absolute Path: " + absolutePath);
        // Absolute Path: C:\Users\Username\Documents\example.txt

        // Resolving a relative path against another path
        Path relativePath = Paths.get("subdirectory", "file.txt");
        Path resolvedPath = path.resolve(relativePath);
        System.out.println("Resolved Path: " + resolvedPath);
        // Resolved Path: C:\Users\Username\Documents\example.txt\subdirectory\file.txt

        // Checking if the path exists
        System.out.println("Path exists: " + path.toFile().exists()); // false
        // (because no actual path like that)
    }
}
