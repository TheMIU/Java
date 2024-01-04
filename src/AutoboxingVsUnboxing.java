class AutoboxingVsUnboxing {
    public static void main(String[] args) {
        // Auto-boxing 
        // conversion of primitive types -> their wrapper classes
        // here, int -> Integer
        int primitiveInt = 10;
        Integer wrappedInt = primitiveInt;

        // Unboxing
        // conversion of wrapper classes -> their primitive types 
        // here, Integer -> int
        Integer wrappedInt2 = 20;
        int primitiveInt2 = wrappedInt2;
    }
}
