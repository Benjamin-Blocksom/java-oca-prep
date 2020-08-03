class SuperCool { }

class SubExtension extends SuperCool { }

class TestExtension {
	public static void main (String[]args) {
	SuperCool foo = new SuperCool();
	SuperCool bar = new SubExtension();
	bar = foo;
	}
} 