class SimpleContinue {
  public static void main (String[]args) {
	OUTER_LOOP: for(int i = 1; i <= 4; i++) {
		for(char j = 'a'; j <= 'c'; j++) {
			if((i==2) || (j=='b'))
			continue OUTER_LOOP; 
			System.out.println(" " + i + j);
			}
		}
	}
}