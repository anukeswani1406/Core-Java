//slip20.java
import game.indoor;
import game.outdoor;
import java.io.*;
class Slip20
{
protected void finalize()
{
System.out.println("Finalized mthod is invoked");
}
public static void main(String a[]) throws IOException
{
	String nm,gm;
	int i;
	BufferedReader br = new BufferedReader(new
	InputStreamReader(System.in));
	System.out.println("enter no indoor player");
	int n= Integer.parseInt(br.readLine());
	indoor in[]=new indoor[n];
	for(i=0;i<n;i++)
	{
		System.out.println("enter palyer name");
		nm=br.readLine();
		System.out.println("enter gamename");
		gm=br.readLine();
		in[i]=new indoor(nm,gm);
	}
	System.out.println("enter no outdoor player");
	int n1= Integer.parseInt(br.readLine());
	outdoor o[]=new outdoor[n1];
	for(i=0;i<n1;i++)
	{
		System.out.println("enter palyer name");
		nm=br.readLine();
		System.out.println("enter gamename");
		gm=br.readLine();
		o[i]=new outdoor(nm,gm);
	}
	System.out.println("Details of indoor game: ");
	for(i=0;i<n;i++)
	{
		in[i].display();
	}
	
	System.out.println("Details of outdoor game: ");
	for(i=0;i<n1;i++)
	{
		o[i].display();
	}
	Slip20 ob = new Slip20();
	ob.finalize();
	}
}
