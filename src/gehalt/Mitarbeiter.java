package gehalt;

public class Mitarbeiter {
	private String vorname;
	private String nachname;
	private int mitarbeiternummer;
	private double gehalt;
	private int alter;
	private static int counter = 1;
	
	public Mitarbeiter(String vorname, String nachname, double gehalt)
	{
		this.vorname = vorname;
		this.nachname = nachname;
		mitarbeiternummer = counter;
		this.gehalt = gehalt;
		counter++;
	}
	
	public String getnachname() {
		return nachname;
	}

	public void setnachname(String nachname) {
		this.nachname = nachname;
	}

	public double getgehalt() {
		return gehalt;
	}

	public void setgehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	public String getvorname() {
		return vorname;
	}

	public int getmitarbeiternummer() {
		return mitarbeiternummer;
	}

	public int getAlter() {
		return alter;
	}

	public double monatsAbrechnung()
	{
		double nachSV;
		double Auszahlung;
		double Abzug60 = 0;
		double Abzug45 = 0;
		double Abzug32 = 0;
		double Abzug20 = 0;
		double Abzug10 = 0;
		double Jahresgehalt = gehalt *12;
		
		nachSV = Jahresgehalt - (Jahresgehalt*0.20);
		double AzBasis = Jahresgehalt - (Jahresgehalt*0.20);
		
		if (nachSV > 50000)
		{
			Abzug60 = (nachSV - 50000)*0.60;
			nachSV = 50000;
		}
		System.out.println(AzBasis + " "+ nachSV);
		
		if (nachSV > 30000 )
		{
			Abzug45 = (nachSV - 30000)*0.45;
			nachSV = 30000;
			System.out.println(AzBasis + " "+ nachSV);
		}
		
		if (nachSV > 20000 )
		{
			Abzug32 = (nachSV - 20000)*0.30;
			nachSV = 20000;
			System.out.println(AzBasis + " "+ nachSV);
		}

		if (nachSV > 10000 )
		{
			Abzug20 = (nachSV - 10000)*0.20;
			nachSV = 10000;
			System.out.println(AzBasis + " "+ nachSV);
		}

		else 
		{
			Abzug10 = (nachSV)*0.10;
			System.out.println(AzBasis + " "+ nachSV);
		}
		System.out.println("60 %:"+Abzug60);
		System.out.println("45 %:"+Abzug45);
		System.out.println("32 %:"+Abzug32);
		System.out.println("20 %:"+Abzug20);
		System.out.println("10 %:"+Abzug10);
		Auszahlung = (AzBasis-Abzug60-Abzug45-Abzug32-Abzug20-Abzug10)/12;
		
		return Auszahlung;
	}
	public double jahresAbrechnung()
	{
		double nachSV;
		double Auszahlung;
		double Abzug60 = 0;
		double Abzug45 = 0;
		double Abzug32 = 0;
		double Abzug20 = 0;
		double Abzug10 = 0;
		double Jahresgehalt = gehalt *12;
		double AzBasis = Jahresgehalt - (Jahresgehalt*0.20);
		
		nachSV = Jahresgehalt - (Jahresgehalt*0.20);
		
		if (nachSV > 50000)
		{
			Abzug60 = (nachSV - 50000)*0.60;
			nachSV = nachSV - (nachSV - 50000);
		}
		if (nachSV > 30000 )
		{
			Abzug45 = (nachSV - 30000)*0.45;
			nachSV = nachSV - (nachSV - 30000);
		}
		if (nachSV > 20000 )
		{
			Abzug32 = (nachSV - 20000)*0.32;
			nachSV = nachSV - (nachSV - 20000);
		}
		if (nachSV > 10000 )
		{
			Abzug20 = (nachSV - 10000)*0.20;
			nachSV = nachSV - (nachSV - 10000);
		}
		if (nachSV < 10000 )
		{
			Abzug10 = (nachSV)*0.10;
		}
		
		Auszahlung = AzBasis-Abzug60-Abzug45-Abzug32-Abzug20-Abzug10;
		
		return Auszahlung;
	}
	public double jahresAbrechnung(int Monate)
	{
		double nachSV;
		double Auszahlung;
		double Abzug60 = 0;
		double Abzug45 = 0;
		double Abzug32 = 0;
		double Abzug20 = 0;
		double Abzug10 = 0;
		double Jahresgehalt = gehalt *Monate;
		
		nachSV = Jahresgehalt - (Jahresgehalt*0.20);
		double AzBasis = Jahresgehalt - (Jahresgehalt*0.20);
		
		if (nachSV > 50000)
		{
			Abzug60 = (nachSV - 50000)*0.60;
			nachSV = nachSV - (nachSV - 50000);
		}
		if (nachSV > 30000 )
		{
			Abzug45 = (nachSV - 30000)*0.45;
			nachSV = nachSV - (nachSV - 30000);
		}
		if (nachSV > 20000 )
		{
			Abzug32 = (nachSV - 20000)*0.32;
			nachSV = nachSV - (nachSV - 20000);
		}
		if (nachSV > 10000 )
		{
			Abzug20 = (nachSV - 10000)*0.20;
			nachSV = nachSV - (nachSV - 10000);
		}

		if (nachSV < 10000 )
		{
			Abzug10 = (nachSV)*0.10;
		}
		
		Auszahlung = (AzBasis-Abzug60-Abzug45-Abzug32-Abzug20-Abzug10);
		
		return Auszahlung;
	}
}
