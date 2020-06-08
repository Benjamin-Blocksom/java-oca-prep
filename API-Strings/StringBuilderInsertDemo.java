// insert method adds character to requested index
import java.lang.*;

class StringBuilderInsertDemo {
	public static void main (String[]args){
	StringBuilder demo = new StringBuilder("nice");
	demo.insert(3, 'h');
	System.out.println(demo);
	}
}
