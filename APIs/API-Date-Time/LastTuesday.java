import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

class LastTuesday {
  public static void main (String[]args) {
    LocalDate date = LocalDate.now();
    LocalDate lastTuesday = date.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
    System.out.println(date + " " + lastTuesday);
  }
}
