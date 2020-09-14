public class CharOrNumSwitch {
	public static void main(String args[]){
	char c;
LOOP: for (c=0;c<5;c++) {
		switch(c++) {
			case '0': System.out.println("A");
			case 1: System.out.println("B"); break LOOP;
			case 2: System.out.println("C"); break;
			case 3: System.out.println("D"); break;
			case 4: System.out.println("E");
			case 'E': System.out.println("F");
			}
		}
	
	}
}
