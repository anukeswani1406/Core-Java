Write a java program to accept list of file names through command line and delete
the files having extension “.txt”. Display the details of remaining files such as
FileName and size.

import java.io.*;

class Slip12
{
	public static void main(String args[]) throws Exception
	{
		for(int i=0;i<args.length;i++)
		{
			File file=new File(args[i]);
			
			if(file.isFile())
			{
				String name = file.getName();
				
				if(name.endsWith(".txt"))
				{
					file.delete();
					System.out.println("file is deleted " + file);
				}
				else
				{
					System.out.println(name + ""+file.length()+" bytes");
				}
			}
			else
			{ 
				System.out.println(args[i]+ "is not a file");
			}
		}
	}
}