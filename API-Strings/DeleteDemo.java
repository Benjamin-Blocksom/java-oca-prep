class DeleteDemo{
	public static void main (String[]args){
	StringBuilder countdown = new StringBuilder("4321");

	try {

	for (int i=0; i < countdown.length(); i++) {
		countdown.deleteCharAt(i);
		System.out.println(countdown);
		Thread.sleep(1000);
		}	
	} catch (InterruptedException e) {
		System.out.println(e);
		}
	}

}	
