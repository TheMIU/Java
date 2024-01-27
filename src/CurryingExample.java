import java.util.function.Function;

public class CurryingExample {
    public static void main(String[] args) {
        Function<Double, Function<Double, Double>> calculateTax = rate -> amount -> amount * rate;

        Function<Double, Double> importTax = calculateTax.apply(0.2);
        Function<Double, Double> exportTax = calculateTax.apply(0.3);

        System.out.println("importTax: " + (importTax.apply(100.0))); // importTax: 20.0
        System.out.println("exportTax: " + (exportTax.apply(100.0))); // importTax: 20.0
    }
}

/*
 * https://www.youtube.com/watch?v=RkK-c2o0GQA 
 */