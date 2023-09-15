import java.util.Calendar;

public class ManualDateExample {
    public static void main(String[] args) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // Set the desired date components
        int year = 2023;
        int month = Calendar.JUNE; // Note: January is represented by 0, February by 1, and so on
        int dayOfMonth = 1;
        int hourOfDay = 10;
        int minute = 30;
        int second = 0;

        // Set the date and time components of the Calendar instance
        calendar.set(year, month, dayOfMonth, hourOfDay, minute, second);

        // Get the Date object from the Calendar instance
        java.util.Date manualDate = calendar.getTime();

        // Print the manually set date
        System.out.println(manualDate);
    }
}
