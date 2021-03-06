/*
Anu Keswani ---> Slip No 5
Define a class Student with attributes rollno and name. Define default and
parameterized constructor. Override the toString() method. Keep the count of
Objects created. Create objects using parameterized constructor and Display the
object count after each object is created.
*/

import java.io.*;

class Slip5
{
	static int cnt;
	int roll;
	String nm;

	Slip5()
	{ 
		nm="";
	}

	Slip5(int rno,String name)
	{
		roll=rno;
		nm=name;
		cnt++;
		System.out.println("objects created="+cnt);
	}

	public String toString()
	{
		return "rno = "+roll+" nm = "+nm;
	}

	public static void main(String a[]) throws Exception
	{
		int n,i,rno;
		String name;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter no of students");
		n=Integer.parseInt(br.readLine());

		Slip5 ob[]=new Slip5[n];
		for(i=0;i<n;i++)
		{
			System.out.println("enter roll no");
			rno=Integer.parseInt(br.readLine());
			System.out.println("enter name");
			name=br.readLine();
			ob[i] = new Slip5(rno,name);
		}

		System.out.println("Students are : ");
		for(i=0; i<n; i++)
		{
			System.out.println(ob[i]);
		}
	}
}