import java.time.*;

public class SwitchProblem {
	private boolean doFoobar (String foo, final String bar) {
	String baz = "Baz";
	final String qux = "Qux";
	boolean isFoobar = true;
	
	switch(foo) {
	case "foobar":  
		isFoobar = true;
		break;
	case bar: 
		isFoobar = false;
		break;
	case baz: 
		isFoobar = false;
		break;
	case qux: 
		isFoobar = false;
		break;
	case 7: 
		isFoobar = false;
		break;
	case 'A': 
		isFoobar = false;
		break;
	case java.time.DayOfWeek.FRIDAY:
		isFoobar = false;
		break;

	}

	return isFoobar;
	}
}