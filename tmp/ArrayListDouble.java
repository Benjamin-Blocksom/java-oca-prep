import java.util.*;

public class ArrayListDouble {
    public static void main (String[]args){
    	ArrayList<Double> al = new ArrayList<>();

	// Will compile, but throws a run time exceptio
	// because al.size() returns 0 and then 
	// al.get() tries to access the first element in 
	// the list.
	
	Double d = al.get(al.size());
    }
}
