public class Rappaport {
	public static void main (String[]args) {

		switch(Integer.parseInt(args[1])) {
		case 0: 
			boolean rappaport = true;	
			break;
		case 1: 
			rappaport = false;
			break;
		}	

		if(rappaport) System.out.println(args[2]) ;

	}

}