package strings;

public class String3 {

	
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
		}
		
		else if (abcd.charAt(i-1) == ' ')
		{
			upper = true;
		}
		
		else 
		{
			upper = false;
		}
		
		if (upper == true)
		{
			newString = newString + Character.toUpperCase(abcd.charAt(i));
		}
		else 
		{
			newString = newString + abcd.charAt(i);
		}
		
	}
	System.out.println(newString);
	}
}
