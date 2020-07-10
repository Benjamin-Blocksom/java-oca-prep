class ImplicitNarrowing {
	final int foo = 42;
	final float bar = 4.2f;
	byte b = 0;
	
	void doFoo() {
	b = foo;
	b = bar;
	}
}
