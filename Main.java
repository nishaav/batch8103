package corejavaconcepts;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				if(i==1 || j==1)
//				{
//					System.out.print("1");
//				}
//				else if(j==i)
//				{
//					System.out.print(j+" ");	
//				}
//				else
//				{
//					System.out.print(" ");
//				}	
//			}
//			System.out.println();
//		}
/*
 * 1 2 3 4 5
   2 1     5
   3   1   5
   4     1 5
   5 5 5 5 5 
 */
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				if(i==1)
//				{
//					System.out.print(j+" ");
//				}
//				else if(j==1)
//				{
//					System.out.print(i+" ");
//				}
//				else if(j==5 || i==5)
//				{
//					System.out.print("5 ");
//				}
//				else if(i==j)
//				{
//					System.out.print("1 ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}	
//			}
//			System.out.println();
//		}
//		
		
		/*  
		 *     1
		 *   1 2 1
		 * 1 2 3 2 1
		 * 
		 * 
		 * 1 loop : rows
		 * 1 loop : space
		 * 1 loop : first half
		 * 1 loop : second half
		 *     1
		 *   2 1 2
		 * 3 2 1 2 3
		 * 
		 * 
		 */
		
		for(int i=1;i<=3;i++)
		{
			for(int s=2;s>=i;s--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k);
			}
			/*
			 * 
			 * i=1
			 * k=i-1=>k=0
			 * k>=1
			 * 
			 * i=2
			 * k=i-1=>k=2-1=>1
			 * k>=1
			 * 
			 * i=3
			 * k=i-1=>3-1=>2
			 * 2 1
			 * 
			 */
			System.out.println();
		}
	}

}
