package viergewinnt2;

public class FourWins {
	private int sizeX;
	private int sizeY;
	private char[][] Spielfeld;
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
		
		public char fourInLine()
		{
			int playerA=0;
			int playerB=0;

			for (int i = 0;i< Spielfeld.length;i++)
			{
				for (int r=0; r<Spielfeld[i].length;r++)
				{					
					if (playerA==4)
					{
						return 'A';
					}
					else if (playerB==4)
					{
						return 'B';
					}
					if(Spielfeld[r][i]=='A')
					{
						playerB=0;
						playerA++;
					}
					else if (Spielfeld[r][i]=='B')
					{
						playerA=0;
						playerB++;
					}
				}
				playerA=0;
				playerB=0;
			}
			return '-';
		}
		
		public char fourInRow()
		{
			int playerA=0;
			int playerB=0;

			for (int i = 0;i< Spielfeld.length;i++)
			{
				for (int r=0; r<Spielfeld[i].length;r++)
				{					
					if (playerA==4)
					{
						return 'A';
					}
					else if (playerB==4)
					{
						return 'B';
					}
					if(Spielfeld[i][r]=='A')
					{
						playerB=0;
						playerA++;
					}
					else if (Spielfeld[i][r]=='B')
					{
						playerA=0;
						playerB++;
					}
				}
				playerA=0;
				playerB=0;
			}
			return '-';
		}
	}