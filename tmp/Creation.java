// How many objects are created in the block of the main method?

class Creation {
	public Creation (){
	
		try {
			throw new MyException();
		} catch(Exception e) {
		}
	}

	public static void main(String[] args) {
		Creation a = new Creation();
		Creation b = new Creation();
		Creation c = a;
	}
}

class MyException extends Exception { }