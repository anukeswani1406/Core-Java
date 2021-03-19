/*
Anu Keswani ---> Slip No 23
Write a java program to accept the details of n Cricket Players from user (Player
code, name, runs, innings- played and number of times not out). The program
should contain following menus:
-Display average runs of a single player.
-Display average runs of all players. (Use array of objects, Method overloading and
static keyword)
*/

import java.util.*;

class Slip23
{ 
	float avg2=0;
	int pcode, runs,ing, out;
	String pname;
	static int cnt;

	void accept()
	{ 
		Scanner s=new Scanner(System.in);

		System.out.println("Enter pid, pname");
		pcode=s.nextInt();
		pname=s.next();
		
		System.out.println("Enter runs, inings & no of times not out");
		runs=s.nextInt();
		ing=s.nextInt();
		out=s.nextInt();
		
		cnt++;
	}

	void display()
	{ 
		System.out.print(" name = " +pname+ " pcode = "+pcode);
		System.out.print(" runs = " +runs+ " inings = "+ing+" out = "+out);
	}
	
	void display(int n)
	{ 
		int a;
		a=n;
		float avg1=runs/ing;
		System.out.println("Avg runs of single player ="+avg1);
		avg2=avg2+runs;
	}

	void display1()
	{ 
		float ag=avg2;
		ag=ag/cnt;
		System.out.println("Avg runs of all players="+ag);
	}

	public static void main(String a[])
	{ 
		int n,ch;
		System.out.println("Enter no of players ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		Slip23 ob[]=new Slip23[n];
		
		System.out.println("Enter details ");
		for(int i=0;i<n;i++)
		{ 
			ob[i]=new Slip23();
			ob[i].accept();
		}

		System.out.println(" players are \n ");
		for(int i=0;i<n;i++)
		{ 
			ob[i].display();
		}

		do
		{ 
			System.out.println("Enter choice ");
			System.out.println("1.avg of 1 player \n2.avg of all player \n exit");
			ch=s.nextInt();
		
			switch(ch)
			{ 
				case 1: for(int i=0;i<n;i++)
					{
						ob[i].display(n);
					}
					break;
			
				case 2: ob[1].display1();
					break;
				case 3:System.exit(1);
				default: System.out.println("wrong choice");
			}
		}while(ch!=3);
	}
}