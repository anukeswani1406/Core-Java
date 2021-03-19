/*
Anu Keswani ---> Slip No 22
Define an Interface Shape with abstract method area(). Write a java program to
calculate an area of Circle and Sphere.(use final keyword)
*/

import java.io.*;

interface Shape
{
	float pi=3.14f;
	void area();
}

class Circle implements Shape
{
	int r;

	Circle(int r)
	{
		this.r = r;
	}

	public void area()
	{
		System.out.println("Area of Circle = "+(pi*r*r));
	}
}

class Sphere implements Shape
{ 
	int r;

	Sphere(int r)
	{ 
		this.r = r;
	}

	public void area()
	{ 
		System.out.println("Area of Sphere = "+(4*pi*r*r));
	}
}

class Slip22
{
	public static void main(String a[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter radius for circle : ");
		int r =Integer.parseInt(br.readLine());
	
		Shape s;

		s=new Circle(r);
		s.area();

		System.out.println("Enter radius for sphere : ");
		r =Integer.parseInt(br.readLine());
		
		s=new Sphere(r);
		s.area();
	}
}