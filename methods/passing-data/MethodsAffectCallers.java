// Calling methods on a reference to an object indeed affects the caller

class MethodsAffectCallers {
	public static void main(String[]args) {
StringBuilder name = new StringBuilder();
changeName(name);
System.out.println(name);
	}

	public static void changeName(StringBuilder stringBuilder){
	stringBuilder.append("Foo");
	}
}
