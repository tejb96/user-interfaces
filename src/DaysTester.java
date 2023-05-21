
/**
 * A class to test the Days class.
 * 
 * Runs through all the months 1 - 12 and prints the number of days.
 * 
 * @author 
 *
 */
import java.time.Month;
public class DaysTester {

	public static void main(String[] args) {
		
		for(int i = 1; i<13;i++) {
			
			Month monthName = Month.of(i);
			System.out.println("There are " + Days.howManyDaysInMonth(i)
			+" days in " + monthName);
		}

	}

}
