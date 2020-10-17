class NoArgsLengthDemo {
	public static void main(String[]args){
	int i = args.length-1;
	System.out.println(args.length + " " + i);
	if(i > 0) System.out.println(args[i]);	
	}
}
