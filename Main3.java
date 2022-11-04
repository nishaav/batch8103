//detect mistakes in loop
/*
10 9 8 7 6 5 4 3 2 1	

running infinitely : check the increment/decrement point.

not executing : check your condition.

*/
class Main3
{
	public static void main(String args[])
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}		
	}
}
