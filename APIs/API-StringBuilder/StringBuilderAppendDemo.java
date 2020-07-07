class StringBuilderAppendDemo {
	public static void main (String[]args){
	StringBuilder appendDemo = new StringBuilder().append(42).append('b');
	appendDemo.append("~").append(true);
	System.out.println(appendDemo);
	}
}
