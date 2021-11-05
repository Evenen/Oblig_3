public class LeapYear {

    public static boolean LeapYear(int year) {
        if ((0 == year % 4) && (0 != year % 100) || (0 == year % 400)) {
            System.out.println(year + " is a leap year");
            return true;
        } else {
            System.out.println(year +  " is not a leap year");
        }
        return false;
    }
}