public interface DownLow extends HighFive {
	public default int getFive() {
	return 6;
	}

	public default String askFive() {
	return "Down Low";
	}

	public boolean isGivingFive() { 
	return true;
	}

}
