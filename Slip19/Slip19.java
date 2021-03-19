/*
Anu Keswani ---> Slip No 19
Write a java program to accept a number from the user, if number is zero then
throw user defined Exception “Number is 0” otherwise calculate the sum of first and last
digit of a given number (Use static keyword).
*/

import java.io.*;

class NumberZero extends Exception
{
}

class Slip19
{
	static void add_digit(int no)
	{ 
		int l=0,f=0;
		l = no%10;

		if(no>9)
		{
			while(no>0)
			{
				f = no%10;
				no=no/10;
			}
		}

		System.out.println("Addotion of first and last digit = "+(f+l));
	}

	public static void main(String a[]) throws IOException
	{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no");
		int no=Integer.parseInt(br.readLine());

		try
		{ 
			if(no==0)
			{
				throw new NumberZero();
			}
			else
				add_digit(no);
		}//end of try

		catch(NumberZero e)
		{
			System.out.println("no is zero");
		}
	}
}