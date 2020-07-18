public class Babushka {
	public static void main (String[]args){ 
	
	Granny test1 = new Daughter();
	Mom test2 = (Mom) test1;	
	System.out.println(test1.a + " " + test1.methodOne());
	System.out.println(test2.a + " " + test2.methodOne());
	}
}

class Granny { 
	int a = 3; 
	int methodOne(){
		return a;
	} 
}

class Mom extends Granny { 
	int a = 2; 
	int methodOne(){
		return a;
	} 
}

class Daughter extends Mom { 
	int a = 1; 
	int methodOne(){
	return a;
	} 
}