// "Pass-by-value" means when a methods receive copies of variable values. So, if that copy is assigned another value it will not affect the caller. 

class PassByValue {
public static void main (String[]args){
	  int num = 51;
	  changeNumber(25);
	  System.out.println(num);
	}

public static void changeNumber(int num) {
	  num = 36;
	}
}
