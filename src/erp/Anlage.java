package erp;

public class Anlage {

	private String bezeichnung;
	private double initialWert;
	private int nutzungsdauer;
	private double restWert;
	private int alter;

	public Anlage(String bezeichnung, double wert, int dauer) 
	{
		this.bezeichnung = bezeichnung;
		initialWert = wert;
		nutzungsdauer = dauer;
		restWert = wert;
		alter = 0;
	}

	public String getbezeichnung() 
	{
		return bezeichnung;
	}

	public double getInitialWert() 
	{
		return initialWert;
	}

	public int getNutzungsdauer() 
	{
		return nutzungsdauer;
	}

	public double getRestWert() 
	{
		return restWert;
	}

	public int getAlter() 
	{
		return alter;
	}

	public void abschreiben() 
	{
		alter++;
		if (alter <= nutzungsdauer) 
		{
			restWert = Math.floor(initialWert / nutzungsdauer * (nutzungsdauer - alter));
		}
	}

	public void simulate(int maxJahre, double minWert) 
	{
		int i = 1;
		while (restWert > 0 && restWert > minWert && i <= maxJahre) 
		{
			System.out.println(alter + ": " + restWert);
			this.abschreiben();
			System.out.println(alter + ": " + restWert);
			i++;
		}
	}

	public Anlage renew(int zusatzWert, int zusatzJahre) 
	{
		Anlage newAnlage = new Anlage(bezeichnung,getRestWert()+zusatzWert,getNutzungsdauer()-getAlter()+zusatzJahre);
		return newAnlage;
	}

}
