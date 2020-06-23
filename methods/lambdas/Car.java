public class Car {
	private String model;
	private boolean isDiesel;
	private boolean isManual;
	public Car(String modelName, boolean diesel, boolean manual) {
	model = modelName;
	isDiesel = diesel;
	isManual = manual;
	}
	public boolean isDiesel() {
		return isDiesel;
	}
	public boolean isManual() {
		return isManual;
	}
	public String toString() {
		return model;
	}
}
