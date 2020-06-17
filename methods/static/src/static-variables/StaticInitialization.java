class StaticInitialization {
	private static final double MARS_SECONDS_PER_HOUR;
	private static final double MARS_SECONDS_PER_MINUTE;
	static {
        	double marsSecondsPerDay = 88775.244147;
		double marsHoursPerDay = 24;
		double marsMinutesPerHour = 60;
        	MARS_SECONDS_PER_HOUR = marsSecondsPerDay / marsHoursPerDay;
		MARS_SECONDS_PER_MINUTE = MARS_SECONDS_PER_HOUR / marsMinutesPerHour;
	}
	public static void main (String[]args) {
	System.out.println(MARS_SECONDS_PER_MINUTE);
	}
}

