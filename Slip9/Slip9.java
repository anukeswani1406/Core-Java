/*
Anu Keswani ---> Slip No 9
Write a java program to display the contents of a file in reverse order.
*/

import java.io.*;

class Slip9
{
	public static void main(String a[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ente file name");
		String fname=br.readLine();

		FileInputStream fin = new FileInputStream(fname);
		BufferedInputStream bis = new BufferedInputStream(fin);
		int s = bis.available();
		
		System.out.println(s);
		for(int i=s-1; i>=0; i--)
		{
			bis.mark(i);
			bis.skip(i);
			System.out.print((char)bis.read());
			bis.reset();
		}
		
		fin.close();
	}
}