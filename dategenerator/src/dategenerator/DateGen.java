package dategenerator;
import java.time.LocalDate;

public class DateGen {
	public static void main(String[] args) {
	for (int i= 0; i < 10; i++) {
		LocalDate randomDate = createRandomDate(1998, 2003);
		System.out.println(randomDate);
	}
}
	public static int createRandomIntBetween(int start, int end) {
		return start + (int) Math.round(Math.random()*(end - start));
	}
	
	public static LocalDate createRandomDate(int startYear, int endYear) {
		int day = createRandomIntBetween(1, 28);
		int month = createRandomIntBetween(1, 12);
		int year = createRandomIntBetween(startYear, endYear);
		return LocalDate.of(year,  month,  day);
		}
	private static LocalDate createRandomDate(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}
