/*Loops :

Iterations :

Process of Repeating a task


Loops :
constructs which can be used to execute a task/statement/bunch of statements as many times as required.


for
while
do-while

3 parameters :

1)initialization point : communicates the starting point for the loop.
2)termination point : communicates the ending point for the loop.
3)increment/decrement point : communicates the step value.


categories :
entry control loop :
1) for :
2) while :

exit control loop : 
1) do-while : 


syntax : 
for(initialization;termination;increment/decrement)
{

}

e.g. :

1 to 10

for(int i=1;i<1;i++)
{
	System.out.println(i);
}

execution process : 
1) initialization
2) conditional check
3) statement
4) increment



while syntax :
while(condition)
{
	statement;
	
	increment/decrement;
}


int i=1;

while(i<=10)
{
	System.out.println(i);
	i++;	
}



do-while

syntax :

initialization;

do
{
	statement;
	in/de;
}while(condition);



*/
class Main
{
	public static void main(String args[])
	{
		System.out.println("Using for loop");
		for(int i=1;i<=10;++i)
		{	
			System.out.println(i);
		}
		System.out.println("Using while loop");
		int j=1;
		while(j<=10)
		{
			System.out.println(j);
			++j;			
		}
		System.out.println("Using do-while loop");
		int i=1;
		do
		{
			System.out.println(i);
			++i;
		}while(i<=10);		
	}
}




































