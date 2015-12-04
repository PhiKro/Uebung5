package comma;

public class csv {

	String csvline = "";

	public csv(String wert1){
		csvline = wert1;
	}

	public int countComma(){
		int count =0;
		for (int i=0; i < csvline.length();i++)
			if (csvline.charAt(i)==','){
				count++;
			}
		return count;
	}
	public String[] parse(){
		int arrayPos=0;
		String temp ="";
		String[] parsed =new String[countComma()+1];
		for (int i=0; i<csvline.length();i++)
			if (csvline.charAt(i)==',')
			{
				parsed[arrayPos]=temp;	
				arrayPos++;
				temp="";
			}
			else 
			{
				temp =temp+csvline.charAt(i);
			}
		parsed[arrayPos]=temp;
		return parsed;
	}


}

