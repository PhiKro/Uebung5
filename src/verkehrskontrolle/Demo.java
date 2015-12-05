package verkehrskontrolle;

public class Demo {

	public static void main(String args[])
	{
		Verwaltungsstrafe Mayer =new Verwaltungsstrafe("Antonn","Mayer","GU-125 LX");
		Mayer.strafe(25);
		Mayer.verbandspaket();
		Mayer.sonstiges(15);
		System.out.println(Mayer.getStrafe()+"€ Strafe für:"+Mayer.getAnzahl()+" Vergehen");
	}
}
