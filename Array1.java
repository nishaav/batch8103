package corejavaconcepts;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers : ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Elements of array : ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		//2-D
		int ar1[][]=new int[2][3];
		System.out.println("Enter the elements for 2 X 3  array : ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				ar1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements of array : ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(ar1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Address of Array : ");
		for(int i=0;i<2;i++)
		{
			System.out.println(ar1[i]);
		}
		//do-while
		int i=0;
		System.out.println("Enter the elements for 2 X 3  array : ");
		do
		{
			int j=0;
			do
			{
				ar1[i][j]=sc.nextInt();
				j++;
			}while(j<3);
			i++;
		}while(i<2);
		
		System.out.println("Elements of array : ");
		i=0;
		do
		{
			int j=0;
			do
			{
				System.out.print(ar1[i][j]+" ");
				j++;
			}while(j<3);
			System.out.println();
			i++;
		}while(i<2);
		System.out.println("Address of Array : ");
		i=0;
		do
		{
			System.out.println(ar1[i]);
			i++;
		}while(i<2);
		
	}
}
/*
 * 1) convert the 2-D array code into do-while and while loop.
 * 2) find the highest number from 1-D array by user-interaction.
 *
 *
 * print the pattern using array
 * 1)
 *  H
 *  H E 
 *  H E L
 *  H E L L
 *  H E L L O
 *  
 * 2) C O B O L
 *    C O B O
 *    C O B
 *    C O
 *    C
 *  
 * 3) WAP to search a number from the array elements.
 * 
 * hint : take user input and search for a number.
 * Output : print the 'position' of the element
 * 
 * 4) WAP to swap the numbers 
 * 	a) using third variable
 *  b) without using third variable
 *  
 *  
 * 5) WAP to arrange the array elements :
 *  a) in increasing order
 *  b) in decreasing order
 *  
 * 6) 2 questions on hacker rank
 *    
 * 
 */
