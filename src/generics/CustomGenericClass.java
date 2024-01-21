package generics;

public class CustomGenericClass {
    public static void main(String[] args) {
        Test<String, Integer> test = new Test<>("Hello", 100);

        System.out.println(test.getFirstParam()); // Hello
        System.out.println(test.getSecondParam()); // 100
    }
}

class Test<T, U> {
    private T firstParam;
    private U secondParam;

    Test(T firstParam, U secondParam) {
        this.firstParam = firstParam;
        this.secondParam = secondParam;
    }

    public T getFirstParam() {
        return firstParam;
    }

    public U getSecondParam() {
        return secondParam;
    }
}