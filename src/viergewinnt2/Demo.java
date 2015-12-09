package viergewinnt2;

public class Demo {
	public static void main (String Args[])
	{
		FourWins Spiel1 =new FourWins(6,6);
		//System.out.println(Spiel1.getSizeX());
		//System.out.println(Spiel1.getSizeY());
		
		Spiel1.playerA(0);
		Spiel1.playerB(0);
		Spiel1.playerB(0);
		Spiel1.playerB(0);
		Spiel1.playerB(5);
		Spiel1.playerA(1);
		Spiel1.playerA(2);
		Spiel1.playerA(3);
		Spiel1.playerA(5);
		Spiel1.playerB(5);
		Spiel1.playerB(4);
		Spiel1.playerB(4);
		System.out.println("Der Gewinner ist:" +Spiel1.winner());
		Spiel1.printSpielfeld();
		}
}
