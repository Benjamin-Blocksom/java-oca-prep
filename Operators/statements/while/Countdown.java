class Countdown {
	public static void main (String[]args){
	int count = 10;
	while (count > 0) {
		System.out.println(count);
		count--;
		try {
    			Thread.sleep(1000);
		} catch(InterruptedException ex) {
    			Thread.currentThread().interrupt();
			}	
		}
	System.out.println("Blast off!");
	}
}