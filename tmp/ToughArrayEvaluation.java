// Does this throw a NullPointerException? Why or why not?
// Remember: When accessing an array, the expression to the left of
// the brackets is evaluated first, then the inside of the brackets.


class ToughArrayEvaluation {
	public static void main (String[]args){
		int [] foo = null;
		try {
		int bar = foo[fooMethod()];
		}
	}
	public static int fooMethod() throws Exception {
		throw new Exception("Yep. An Exception");
	}
}