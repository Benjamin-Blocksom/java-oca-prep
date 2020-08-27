class StrangeObject {
	int value = 1;
	StrangeObject foo;
	public StrangeObject(int num) { this.value = num; }
	public static void main (String... args){
		final StrangeObject bar = new StrangeObject(13);
		StrangeObject bat = new StrangeObject(42);
		bat.foo = setValue(bar, bat);
//		System.out.println(bar.foo.value + " " + bat.foo.value);
	} 

	public static StrangeObject setValue(final StrangeObject baz, final StrangeObject qux) {
	baz.foo = qux.foo;
	return baz;
	}
}