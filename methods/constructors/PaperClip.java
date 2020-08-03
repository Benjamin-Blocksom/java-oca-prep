class PaperClipA { }

class PaperClipB { 
	public PaperClipB () { }
}

class PaperClipC { 
	public PaperClipC (boolean b) { }
}

class PaperClipD { 
	private PaperClipD () { }
}

public class PaperClip {
	public static void main(String[]args) {
	PaperClipA a = new PaperClipA();
	PaperClipB b = new PaperClipB();
	PaperClipC c = new PaperClipC(true);
	PaperClipD d = new PaperClipD(); // does not compile
	}
}
