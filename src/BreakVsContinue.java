public class BreakVsContinue {
    public static void main(String[] args) {
        // break
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break; // exit the loop when i is 3 (rest will not print)
            }
            System.out.println(i);
        }

        System.out.println("=========");

        // continue
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue; // skip 3 (rest will be print)
            }
            System.out.println(i);
        }
    }
}
