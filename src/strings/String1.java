package strings;

public class String1 {

	public static void main(String Args[]){

		String abcd = "Wörter starten mit großbuchstaben";
		System.out.println(abcd);
		System.out.println(abcd.length());
		System.out.println();
		String newString = "";

		for (int i =1; i<abcd.length();i++ )
			{
				if (abcd.charAt(i-1) == ' ')
				{
					char upper = Character.toUpperCase(abcd.charAt(i));
					newString = newString + upper;
				}
				else if (i==1)
				{
					newString = newString + Character.toUpperCase(abcd.charAt(0));
					newString = newString + abcd.charAt(i);
				}
				else 
				{
					newString = newString + abcd.charAt(i);
				}
			}
		System.out.println(newString);

	}
}
