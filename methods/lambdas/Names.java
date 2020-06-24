import java.util.*;
import java.util.function.*;

public class Names {
	public static void main(String[]args) {
	List<String> names = new ArrayList<>();
	names.add("Billy");
	names.add("Charley");
	names.add("Elby");
	names.add("Freddie");
	System.out.println(names);
	names.removeIf(s -> s.charAt(0) != 'B');
	System.out.println(names);
	}
}
