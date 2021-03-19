/*
Anu Keswani ---> Slip No 2
Write a java program to accept n names of cites from user and display them in
descending order.
*/

import java.io.*;

public class Slip2 
{
    public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter How many Cities : ");
		int n = Integer.parseInt(br.readLine());
		
		String s[] = new String[n];
		
		for(int i=0; i<s.length; i++)
		{
			System.out.println("Enter city name : ");
			s[i] = br.readLine();
		}
		
		for(int i=0; i<s.length; i++)
		{
			for(int j=0; j<s.length-1; j++)
			{
				if (s[j].compareTo(s[j+1]) < 1)
				{
					String temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}
		}
		
		System.out.println("Cities in Descending Order : ");
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
		
    }
}
