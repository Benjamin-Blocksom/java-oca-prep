// RH side must be array or `Iterable` object.
// LH type must match.

class SimpleForEachTwo {
	public static void main (String[]args){
		java.util.List<String> roster = new java.util.ArrayList<String>();
			roster.add("Alice");
			roster.add("Bob");
			roster.add("Charlie");

		for(String name : roster) {
			System.out.print(name + ", ");
		}
	}
}