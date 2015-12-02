package gehalt;

public class Mitarbeiter {
	private String Vorname;
	private String Nachname;
	private int Mitarbeiternummer;
	private double Gehalt;
	private int Alter;
	private static int counter = 1;
	
	public Mitarbeiter(String Vorname, String Nachname, double Gehalt)
	{
		this.Vorname = Vorname;
		this.Nachname = Nachname;
		Mitarbeiternummer = counter;
		this.Gehalt = Gehalt;
		counter++;
	}
	
	public String getNachname() {
		return Nachname;
	}

	public void setNachname(String nachname) {
		Nachname = nachname;
	}

	public double getGehalt() {
		return Gehalt;
	}

	public void setGehalt(double gehalt) {
		Gehalt = gehalt;
	}

	public String getVorname() {
		return Vorname;
	}

	public int getMitarbeiternummer() {
		return Mitarbeiternummer;
	}

	public int getAlter() {
		return Alter;
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
		double JahresGehalt = Gehalt *12;
		
		nachSV = JahresGehalt - (JahresGehalt*0.20);
		double AzBasis = JahresGehalt - (JahresGehalt*0.20);
		
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
		double JahresGehalt = Gehalt *12;
		double AzBasis = JahresGehalt - (JahresGehalt*0.20);
		
		nachSV = JahresGehalt - (JahresGehalt*0.20);
		
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
	public double jahresAbrechnung(int Monate)
	{
		double nachSV;
		double Auszahlung;
		double Abzug60 = 0;
		double Abzug45 = 0;
		double Abzug32 = 0;
		double Abzug20 = 0;
		double Abzug10 = 0;
		double JahresGehalt = Gehalt *Monate;
		
		nachSV = JahresGehalt - (JahresGehalt*0.20);
		double AzBasis = JahresGehalt - (JahresGehalt*0.20);
		
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
