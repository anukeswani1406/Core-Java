/*
Anu Keswani ---> Slip No 18
Write a java program that displays the number of characters, lines & words from a
file.
*/

import java.io.*;

class Slip18
{
	public static void main(String a[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter source file name ");
		String f1=br.readLine();
		
		FileReader fr = new FileReader(f1);
		
		int ch ;
		int wc= 0,line=0, cc=0;

		while((ch=fr.read())!= -1)
		{ 
			char c = (char)ch;
			cc++;
		
			if(c=='\n')
			{ 
				line++;
				wc++;
			}
			else if(c==' ' || c=='\n')
				wc++;
		}
	
		wc++;
		line++;
		cc++;
		
		System.out.println("Line count = "+line+"\n Character count = "+cc+"\n word count = "+wc);
		fr.close();
	}
}