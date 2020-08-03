import java.util.function.*;
import java.util.*;

public class TestLambda {
	public static boolean verifyList(List list, Predicate<List> p) {
	return p.test(list);
	}


	public static void main(String[]args) {
		boolean b = verifyList(new ArrayList(), a1 -> { return a1.size()==0;});
		boolean c = verifyList(new ArrayList(), a1 -> a1.add("hello"));
		System.out.println(b + " " + c);
	}
}