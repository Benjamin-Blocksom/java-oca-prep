// Should a class not include a constructor,
// Java will create one without any parameters.
// It is called the _default_no_arguments_constructor. 

public class DefaultConstructor {
	public static void main (String[]args) { 
	DefaultConstructor defaulConstructor = new DefaultConstructor();
	}
}


// At line 7, Java created the equivalent of:
//
// public DefaultConstructor () { }
