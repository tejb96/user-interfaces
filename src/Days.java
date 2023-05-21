
/**
 * 
 * TODO: add JavaDoc
 * 
 * @author 
 *
 */
public final class Days {
	
	/**
	 * Days cannot be instantiated, has static methods only.
	 */
	private Days() {}
	
	public static int howManyDaysInMonth(int month){
		int days;
		
		if (month == 1 || month == 3 || month == 5 || month == 7|| month == 8 || month == 10 || month == 12) {
			
			return days = 31;
		
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return days = 30;
		}
		
		else if (month == 2) {
			return days = 28;
		}
		return -1;
	}

}
