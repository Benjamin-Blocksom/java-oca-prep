public class MutableTrick {
	private StringBuilder builder;
	public MutableTrick(StringBuilder b) {
		builder = b;
	}

	public StringBuilder getMutableTrick() {
		return this.builder;
	}
}
