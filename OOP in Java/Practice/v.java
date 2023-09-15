import java.time.*;
public class v {
    public static LocalDate fixedDate(){
        return LocalDate.of(2004,Month.JULY,30);
    }

    public static Period getPeriod() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(fixedDate(), currentDate);
    }

    public static void main(String args[]) {
        Period period = getPeriod();
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Years: " + years + ", Months: " + months + ", Days: " + days);
    }
}
