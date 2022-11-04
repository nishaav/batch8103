/*
1 2 3 4 5
  2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
*/

class Main5
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)//outer
		{
			for(int k=1;k<i;k++)	
			{
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++)//inner
			{	
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1


* 
* *
* * *
* *
*

    * 
  * * *
* * * * *
  * * *
    *

    1
  1 * 1
1 * * * 1

    1
  1 * 1
1 * 1 * 1
 
1
2 3
4 5 6
7 8 9 10

    1
  2 1 2
3 2 1 2 3

* * * * *
  * * *
    *
  * * * 
* * * * *

5 4 3 2 1
  5 4 3 2
    5 4 3
      5 4
        5
*/