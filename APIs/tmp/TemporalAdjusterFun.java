// TemporalAdjuster is a strategy for adjusting a
// Temporal object.
//
// A Temporal defines how date, time, or a combination of both
// is represented. Some implementations include: LocalDate, 
// LocalDateTime, HijrahDate, MinguoDate, ThaiBuddhistDate.
//
// TemporalAdjuster is a functional interface with the 
// abstract method adjustInto() and allows for complex
// date manipulations. It has a number of static methods
// such as dayOfWeekInMonth(), firstDayOfMonth(), firstDayOfNextMonth(),
// firstDayOfNextYear(), and nextOrSame()

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.*;


class TemporalAdjusterFun {
	public static void main (String[]args){
		LocalDate date = LocalDate.of(2020, Month.SEPTEMBER, 10);
		DayOfWeek dotw = date.getDayOfWeek();
		System.out.printf("%s is on a %s%n", date, dotw);
		System.out.printf("first day of Month: %s%n", date.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.printf("first Monday of Month: %s%n", date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
		System.out.printf("first day of next Month: %s%n", date.with(TemporalAdjusters.firstDayOfNextMonth()));
	}

}
