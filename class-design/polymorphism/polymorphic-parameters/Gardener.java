public interface Gardener {
	public static void water(Flower flower){
	System.out.println("Watering the " + flower.getName());
	}
	
	public static void main (String[]args) {
	water(new Flower());
	water(new Daisy());
	water(new Rose());
	}	
}
