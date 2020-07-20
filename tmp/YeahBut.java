public class YeahBut {
	public static void main (String[]args) throws Exception { 
		try {
			yeah();
		} 
		
		finally { System.out.println("but you forgot to catch.");
		}

		System.out.println("I guess you'll never see me then");
	}

	public static void yeah() throws Exception { 
		System.out.print("Yeah, ");
		throw new Exception(); 
	}
}