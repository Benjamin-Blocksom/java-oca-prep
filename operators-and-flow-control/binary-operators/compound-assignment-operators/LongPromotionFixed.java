// Compound assignment operator casts foo to long,
// multiplies the two long values, then casts result
// to int. 	

class LongPromotion {
	long foo = 3l;
	int bar = 4;
	void result() {
	bar *= foo;
	}
}