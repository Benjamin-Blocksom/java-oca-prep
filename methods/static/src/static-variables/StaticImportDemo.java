import java.util.List;

// You can import static methods
import static java.util.Arrays.asList;

public class StaticImportDemo {
	public static void main (String[]args){
	List<String> stooges = asList("Larry", "Moe", "Curly");
	System.out.println(stooges.toString());
	} 
}
