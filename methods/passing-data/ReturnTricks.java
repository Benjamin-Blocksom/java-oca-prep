public class ReturnTricks {
  public static void main(String[]args) {
	  int num = 7;
	  String word = "bird";
	  num(num);
	  word = word(word);
	  System.out.println(num + word);
}
public static int num(int num){
	num++;
	return num;
}
public static String word(String word){
	word += "-song";
	return word;
	}
}

