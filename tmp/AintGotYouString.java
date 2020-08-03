public class AintGotYouString { 
		public static void main (String[]args){
			StringBuilder aintGotYou = new StringBuilder(); 
			aintGotYou.append("Some people want it all" +
						"But I don't want nothing at all" +
						"If it ain't you, baby" +
						"If I ain't got you");		
			System.out.print(aintGotYou.delete(0, aintGotYou.length()));
	}

}