// ...and I thought, "gosh, can you actually
// initialize an array with a variable?"
//
// You can.
//
// ...and then I thought, "what about the pre-incrementer?
// will it really not through an IndexArrayOutOfBoundsException?"
//
// It won't.

class InitializeWithVariable {
	public static void main(String...args){
	  int size = 7;
	  int[] arr = new int[size];
	  for (int i = 0; i < size; i++) {
		  System.out.println(i);	  
		  System.out.println(arr[i]);
	  }
	}

}

// And now I learned something, thanks to a stack overflow post [1].
// Post-increment and pre-increment give the same result in a for loop.
// The flow works like this: (1) test condition; (2) if false, terminate; (3) if true execute body; (4) execute incrementation step;
//
// [1]  https://stackoverflow.com/questions/4706199/post-increment-and-pre-increment-within-a-for-loop-produce-same-output
//
