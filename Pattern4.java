//BODER OF SQUARE

class Pattern4 
{
	public static void main(String[] args) 
	{
		int n=4;
		for(int i=0;i<n;i++)//row
		{
			for(int j=0;j<n;j++)//col
			{
				if(i==0||j==0||i==n-1||j==n-1)
				{
					System.out.print("*");
				}
				else
				{
				    System.out.print(" ");
				}
			System.out.print(" ");
			}

			System.out.println(" ");
		}
	}
}
