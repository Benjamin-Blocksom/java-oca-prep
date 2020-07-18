// A fantastic explanation about the
// difference between passing primitives
// and passing object reference values
// can be found here:
//
// http://www.javaranch.com/campfire/StoryPassBy.jsp
//
// Java is pass by value. The value
// of an object is counter-intuitive.
//

import java.util.*;

class CowboyTribute {
	public static void orderPancakes (Deque myPancakes, Deque yourPancakes) {
	myPancakes.push(Integer.valueOf(5));
	yourPancakes = myPancakes;
	}
	
	public static void main (String[]args) {
		Deque pancakesForMe = new ArrayDeque();
		Deque pancakesForYou = new ArrayDeque();
		orderPancakes(pancakesForMe, pancakesForYou);
		System.out.println("This is how many pancakes I get: " + pancakesForMe);
		System.out.println("This is how many pancakes you get " + pancakesForYou );
	}
}

