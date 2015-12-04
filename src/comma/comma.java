package comma;

public class comma {

	public static void main(String args[])
	{
		csv Test1 = new csv("das,ist,ein,Test,und,sollte,8,ausgeben");
		// System.out.println(Test1.countComma());
		
		//String[] Out =new String[Test1.countComma()];
		String[] Out = Test1.parse();
		for (int i=0;i<Out.length;i++){
			System.out.println(Out[i]);
		}
	}
}
