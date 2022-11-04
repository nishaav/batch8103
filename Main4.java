//nested if : if inside another if
//nested loop
class Main4
{
	public static void main(String args[])
	{int j=1;
		for(int i=1;i<=5;i++)//outer loop
		{
			for(;j<=5;j++)//inner loop
			{
				System.out.println("i : "+i+" j : "+j);
			}
		}	
	}	
}