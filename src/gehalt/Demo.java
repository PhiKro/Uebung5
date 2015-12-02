package gehalt;

public class Demo {

	public static void main (String Args[])
	{
		Mitarbeiter Mayer = new Mitarbeiter("Hans","Mayer",2500);
		System.out.println(Mayer.monatsAbrechnung());
		System.out.println(Mayer.jahresAbrechnung());
		System.out.println(Mayer.jahresAbrechnung(5));
		System.out.println(Mayer.getMitarbeiternummer());

		Mitarbeiter Huber = new Mitarbeiter("Hans","Huber",20500);
		System.out.println(Huber.monatsAbrechnung());
		System.out.println(Huber.jahresAbrechnung());
		System.out.println(Huber.jahresAbrechnung(5));
		System.out.println(Huber.getMitarbeiternummer());
	}
}
