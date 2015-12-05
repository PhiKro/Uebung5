package viergewinnt;

public class FourWins {
	private int sizeX;
	private int sizeY;
	private char[][] Spielfeld;
	private String reihe ="";
	private char row;
	private char line;


	public FourWins(int sizeX,int sizeY)
	{
		if(sizeX >=4 && sizeY>=4)
		{
			this.Spielfeld = new char[sizeX][sizeY];
			this.sizeX =sizeX;
			this.sizeY =sizeY;
		}	
		else 
		{
			System.out.println("Bitte Anleitung beachten!");
		}
	}

	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}

	public boolean playerA(int x, int y)
	{
		if (Spielfeld[x][y]=='\u0000')
		{
			Spielfeld[x][y]='A';
			return true;
		}
		else 
		{
			return false;
		}
	}
	public boolean playerB(int x, int y)
	{
		if (Spielfeld[x][y]=='\u0000')
		{
			Spielfeld[x][y]='B';
			return true;
		}
		else 
		{
			return false;
		}	
	}
	private char fourInRow()
	{
		int stringpos =1;
		for (int i = 0;i< Spielfeld.length;i++)
		{
			for (int r=0; r<Spielfeld[i].length;r++)
			{
				if(reihe.equals("AAAA")||reihe.equals("BBBB"))
				{
					return reihe.charAt(0);
				}
				else if (Spielfeld[i][r]=='A'||Spielfeld[i][r]=='B')
				{
				reihe=reihe+Spielfeld[i][r];
				stringpos++;
				}
				else
				{
			reihe = "";	
			stringpos =1;
				}
			}
		}
		return '-';
	}
	private char fourInLine()
	{
		for (int i = 0;i< Spielfeld.length;i++)
		{
			for (int r=0; r<Spielfeld[i].length;r++)
			{
				if(reihe.matches("AAAA")||reihe.matches("BBBB"))
				{
					return reihe.charAt(0);
				}
				
				else if(Spielfeld[r][i]=='A'||Spielfeld[r][i]=='B')
				{
					reihe=reihe+Spielfeld[r][i];
				}
				else
				{			
					reihe = "";
				}
			}	
		}
		return '-';
	}
		public char winner()
		{
			line = fourInLine();
			row = fourInRow();

			if (row =='A'||row =='B')
			{
				return row;
			}
			else if (line =='A' || line =='B')
			{
				return line;
			}
			else 
			{
				return '-';
			}
		}

		public void printSpielfeld()
		{
			for (int i =0;i<Spielfeld.length; i++)
			{
				for (int j=0;j<Spielfeld[i].length;j++)
				{
					System.out.print(Spielfeld[i][j]+",");
				}
				System.out.println("");
			}
		}
	}


