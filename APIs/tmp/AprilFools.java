import java.time.*;

public class AprilFools {
	public static void main (String[]args){
		LocalDate foo = LocalDate.of(2020, Month.FEBRUARY, 29);
		foo = foo.plus(Period.ofMonths(1).ofDays(1));
		System.out.println(foo);
	}
}
