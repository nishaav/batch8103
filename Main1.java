/*
unary :
uni : single
unary operators : are the operators which can be used with a single operand/variable.

a+b;

i++

pre-increment
->
++i;

post-increment
->
i++;
pre-decrement
->
--i;
post-decrement
->
i--;

*/

class Main1
{
	public static void main(String args[])
	{
		int a=10,b=-5,c=100;
/*		System.out.println(a);//10
		System.out.println(a++);//10
		System.out.println(++a);//12
		System.out.println(a--);//12
		System.out.println(--a);//10		*/
	
		int result=(a++)+(--b)-(c)+(a)+(++c)+(b--);
		System.out.println(result);
// 10-6-100+11+101-6 =10
//

//16 13 10 10 10 10 10
	
	}	
}






