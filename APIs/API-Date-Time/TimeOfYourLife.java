// The time of your life all looks the same

import java.time.*;
import java.time.format.DateTimeFormatter;

class TimeOfYourLife {
  public static void main (String [] args){
    LocalDate foo = LocalDate.parse("2020-07-31", DateTimeFormatter.ISO_DATE);
	LocalDate bar = LocalDate.of(2020, 07, 31);
	LocalDate baz = LocalDate.now();
	System.out.println(foo);
	System.out.println(bar);
	System.out.println(baz);	
  }
}
