// No biggie.

class WhatAboutAutoboxing {
	public void somethingSomething() {
		int number = 1;
		Integer otherNumber = 2;
		something(number);
		something(otherNumber);		
	}

	public void something (int num) { }
	public void something (Integer num) { }
}
