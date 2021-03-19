/*
Anu Keswani ---> Slip No 1
Write a java program to read the characters from a file, if a character is alphabet then
reverse its case, if not then display its category on the Screen. (whether it is Digit or Space)
*/

import java.io.*;

public class Slip1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter File Name");
        String f1 = br.readLine();
        
        FileReader fr = new FileReader(f1);
        
        int ch;
        
        while((ch = fr.read()) != -1)
        {
        	char c = (char) ch;
        	
        	if (Character.isUpperCase(c))
        	{
        		c = Character.toLowerCase(c);
        		System.out.println(c);
        	}
        	
        	else if (Character.isLowerCase(c))
        	{
        		c = Character.toUpperCase(c);
        		System.out.println(c);
        	}
        	
        	else if (Character.isDigit(c))
        		System.out.println(c + "Digit");
        	
        	else if (Character.isSpace(c))
        		System.out.println(c + "Space");
        		
        	else
        		System.out.println(c);
        }
        fr.close();
    }
}