class WhatTimeIsIt {
	public static void main (String[]args) {
	java.time.LocalDate localDate = java.time.LocalDate.now();
	java.time.LocalDate tomorrow = java.time.LocalDate.now().plusDays(1);
	System.out.println(localDate + " " + tomorrow);
	}
}
