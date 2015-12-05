package verkehrskontrolle;

public class Verwaltungsstrafe {
	
	private String vorname;
	private String nachname;
	private String kennzeichen;
	private int strafnummer;
	private static int counter=1;
	private double strafe;
	private byte anzahl;
	

	public Verwaltungsstrafe(String vorname, String nachname,String kennzeichen)
	{
		this.vorname=vorname;
		this.nachname=nachname;
		this.kennzeichen=kennzeichen;
		this.strafnummer=counter;
		this.strafe=0;
		this.anzahl=0;
		counter++;
	}
	
	public void strafe(int geschwindigkeitsueberschreitung)
	{
		if(geschwindigkeitsueberschreitung >100)
		{
			strafe=strafe+1500;
		}
		else if(geschwindigkeitsueberschreitung >50 &&geschwindigkeitsueberschreitung<=100)
		{
			strafe=strafe+500;
		}
		else if(geschwindigkeitsueberschreitung >30 &&geschwindigkeitsueberschreitung<=50)
		{
			strafe=strafe+100;
		}
		else if(geschwindigkeitsueberschreitung >20 &&geschwindigkeitsueberschreitung<=30)
		{
			strafe=strafe+50;
		}
		else
		{
			strafe=strafe+30;			
		}
		anzahl++;
	}
	public void verbandspaket()
	{
		strafe=strafe+25;
		anzahl++;		
	}
	public void alkohol(double promill)
	{
		if (promill >=0.5&& promill<=1.0 )
		{
			strafe=strafe+100;
		}
		else if (promill >1.0&& promill<=2.0 )
		{
			strafe=strafe+400;	
		}
		else if (promill >2.0&& promill<=3.0 )
		{
			strafe=strafe+1000;	
		}
		else if (promill >3.0)
		{
			strafe=strafe+5000;	
		}
		anzahl+=2;
	}
	public void sonstiges(double wert)
	{
		this.strafe=strafe+wert;
		anzahl++;
	}
	public double getStrafe()
	{
		if (anzahl==1)
		{
			return strafe-(strafe*0.30);
		}
		else if (anzahl==2)
		{
			return strafe-(strafe*0.20);
		}
		else if (anzahl==3)
		{
			return strafe-(strafe*0.30);
		}
		else
		{
			return strafe;
		}
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public String getKennzeichen() {
		return kennzeichen;
	}

	public int getStrafnummer() {
		return strafnummer;
	}

	public static int getCounter() {
		return counter;
	}

	public byte getAnzahl() {
		return anzahl;
	}
	
}
