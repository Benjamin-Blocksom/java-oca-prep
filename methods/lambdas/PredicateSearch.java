import java.util.*;
import java.util.function.*;

public class PredicateSearch {
	public static void main(String[]args) {
	List<Car> cars = new ArrayList<Car>();
	cars.add(new Car("Chevy", false, true));
	print(cars, a -> a.isManual());
	}

	private static void print(List<Car> cars, Predicate<Car> checker) {
	for (Car car : cars) {
		if (checker.test(car))
			System.out.print(car + " ");
	}
	System.out.println();
	}

}
