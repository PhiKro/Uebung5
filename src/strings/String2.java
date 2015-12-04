package strings;

public class String2 {

	
		public static void main(String Args[]){
			boolean upper;
			String abcd = "Wörter starten mit großbuchstaben";
			// System.out.println(abcd);
			// System.out.println(abcd.length());
			// System.out.println();
			String newString = "";
			
		for (int i =0; i<abcd.length();i++ )
		{
			if (i==0)
			{
				upper=true;
				newString = newString + Character.toUpperCase(abcd.charAt(i));
			}
			
			else if (abcd.charAt(i-1) == ' ')
			{
				newString = newString + Character.toUpperCase(abcd.charAt(i));
				upper = true;
			}
			
			else {
				upper = false;
				newString = newString + abcd.charAt(i);
			}
			
			/*
			if (upper == true)
			{
				newString = newString + Character.toUpperCase(abcd.charAt(i));
			}
			else newString = newString + abcd.charAt(i);
			*/
			
		}
		System.out.println(newString);
		}

}
