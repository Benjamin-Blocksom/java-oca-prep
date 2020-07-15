// RH must be an array or `Iterable` object. 
// LH type must match

class SimpleForEach {
	public static void main (String[]args){
		String [] names = String[3];

		for(int name : names ) {
			System.out.print(name + ", ");
		}
	}
}