import java.util.*;

public class FeatureSearch { 
	public static void main(String[]args) {
	List<Car> cars = new ArrayList<Car>();
	cars.add(new Car("VW", true, false));
	cars.add(new Car("Fiat", true, true));
	cars.add(new Car("Subaru", true, false));
	cars.add(new Car("Lincoln", false, false));

	print(cars, a -> a.isDiesel());
	print(cars, a -> ! a.isDiesel());
	print(cars, a -> a.isManual());	
	print(cars, a -> !a.isManual());
	}
	
	private static void print(List<Car> cars, CheckFeature checker) {		for(Car car : cars) {
			if (checker.test(car))	
			System.out.print(car + " ");
			}
		System.out.println(); 
	}
}
