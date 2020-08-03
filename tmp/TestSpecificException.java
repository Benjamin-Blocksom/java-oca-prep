class SuperException extends Throwable { }
class FirstException extends SuperException { }
class SecondException extends SuperException { }
class WayMoreSpecificException extends SecondException {}


public class TestSpecificException {
	void fooMethod () throws SuperException {
		throw new WayMoreSpecificException();
	}

	public static void main (String[]args) {
		TestSpecificException foo = new TestSpecificException();
		try {
			foo.fooMethod();
		} catch (SuperException e) {
			System.out.println("SuperException caught");
		} catch (WayMoreSpecificException ex) {
			System.out.println("Unreachable code. Will not compile."); // already caught
		} finally { 
			System.out.println("Feel free to add distractor here.");	
		}

	}
}