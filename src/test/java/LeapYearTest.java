
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {

    LeapYear currentYear;

    @BeforeEach
    public void setup() {
        currentYear = new LeapYear();
    }

    @Test
    public void isYearDivisibleBy4ButNot100() {
        assertEquals(true, currentYear.LeapYear(2000));
    }

    @Test
    public void isYearDivisibleBy400() {
        assertEquals(true, currentYear.LeapYear(2000));
    }

    @Test
    public void isYearNotDivisibleBy4() {
        assertEquals(false, currentYear.LeapYear(2021));
    }

    @Test
    public void isYearDivisibleBy100ButNot400() {
        assertEquals(false, currentYear.LeapYear(1700));
        assertEquals(false, currentYear.LeapYear(1800));
        assertEquals(false, currentYear.LeapYear(1900));
    }
}
