package solution.enum2;

public class Enum2 {
    // Enum для представления дней недели
    public enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;

        // Переопределение метода toString для красивого вывода
        @Override
        public String toString() {
            return name().charAt(0) + name().substring(1).toLowerCase();
        }
    }

    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.MONDAY;
        System.out.println("Today is " + today);
    }
}
