package erp;

public class DemoAnlage {
	public static void main (String Args[]){
		Anlage Laptop = new Anlage("Asus Zen Book", 1600.20,5);
		/*
		System.out.println(Laptop.getAlter());
		System.out.println(Laptop.getNutzungsdauer());
		System.out.println(Laptop.getRestWert());
		Laptop.abschreiben();
		System.out.println(Laptop.getAlter());
		System.out.println(Laptop.getNutzungsdauer());
		System.out.println(Laptop.getRestWert());
		Laptop.abschreiben();
		System.out.println(Laptop.getAlter());
		System.out.println(Laptop.getNutzungsdauer());
		System.out.println(Laptop.getRestWert());
		Laptop.renew(250,3);
		System.out.println(Laptop.getAlter());
		System.out.println(Laptop.getNutzungsdauer());
		System.out.println(Laptop.getRestWert());
		*/
		Laptop.simulate(5, 340);
		Anlage Laptop2 =Laptop.renew(1380, 2);
		
		System.out.println(Laptop2.getRestWert());
	}
}
