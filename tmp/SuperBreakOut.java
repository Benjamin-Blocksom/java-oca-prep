class SuperBreakOut {
	void sillyLoop(){
	int a = 0;
	MILK: while (a < 0) {
		COOKIES: System.out.println(a + 
					 "I only break out of my own scope");
		if (a > 3) break COOKIES; else a++;
	}
	}
}
