package erp;

public class Anlage {

	private String Bezeichnung;
	private double initialWert;
	private int nutzungsdauer;
	private double restWert;
	private int alter;
	
	public Anlage(String Bezeichnung, double Wert, int dauer){
		this.Bezeichnung = Bezeichnung;
		initialWert = Wert;
		nutzungsdauer = dauer;
		restWert = Wert;
		alter = 0;
	}

	public String getBezeichnung() {
		return Bezeichnung;
	}

	public double getInitialWert() {
		return initialWert;
	}

	public int getNutzungsdauer() {
		return nutzungsdauer;
	}

	public double getRestWert() {
		return restWert;
	}

	public int getAlter() {
		return alter;
	}
	
	public void abschreiben(){
		alter++;
		if (alter <= nutzungsdauer){
		restWert = Math.floor(initialWert/nutzungsdauer * (nutzungsdauer-alter));
		}
	}
	
	public void simulate(int maxJahre,double minWert){
		int i = 1;
		while (restWert > 0 && restWert > minWert && i <= maxJahre){
		System.out.println(alter+": "+restWert);
		this.abschreiben();
		System.out.println(alter+": "+restWert);
		i++;
		}
	}
	
	public void renew(int zusatzWert, int zusatzJahre){
	  initialWert = restWert + zusatzWert;
	  restWert = initialWert;
	  nutzungsdauer= nutzungsdauer-alter+zusatzJahre;
	}
	
}
