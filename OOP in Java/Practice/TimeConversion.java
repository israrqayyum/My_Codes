public class TimeConversion {
    public static void main(String[] args) {
        int totalSeconds = 8500;
        //Note:Data type is int in all cases to convert seconds in hours, minutes and seconds
        int hours=totalSeconds/3600;//divide by 3600
        int minutes=(totalSeconds%3600)/60;//modulus by 3600 and divide by 60 for minutes
        int seconds=(totalSeconds%3600)%60;//modulus by 3600 and also modulus by 60 for seconds
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
//Logic:In modulus the number of digits in divison -1 give us the first digit of numerator means 8500/1000 give us 8
//and rest of is remainder which is 500
