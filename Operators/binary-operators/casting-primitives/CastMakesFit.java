// Avoid possible lossy conversion by casting primitives

class CastMakesFit {
	int foo = (int)9.0;
	short bar = (short)(5 * 3);
	int baz = (int)4f;
	long qux = 123456789012345678L;	
}