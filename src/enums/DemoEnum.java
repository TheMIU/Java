package enums;

public class DemoEnum {
    public static void main(String[] args) {
        // simple enum class access
        Level level = Level.HIGH;
        System.out.println(level); // HIGH

        // enums in switch case
        switch (level) {
            case LOW:
                System.out.println("Easy Selected");
                break;
            case MEDIUM:
                System.out.println("Medium Selected");
                break;
            case HIGH:
                System.out.println("Hard Selected");
                break;
            default:
                System.out.println("Wrong selection");
        }

        // Iterating Through Enums
        for (Level l : Level.values()) {
            System.out.println(l);
        }

        // enum with Methods and Properties
        Day toDay = Day.MONDAY;
        int dayNumber = toDay.getDayNumber();
        System.out.println(toDay + " : " + dayNumber); // MONDAY : 1
    }
}
