class Pattern13 
{
	public static void main(String[] args) 
	{
		char ch ='a';
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		
	}
}
/*
a
b c
d e f
g h i j
k l m n o
*/