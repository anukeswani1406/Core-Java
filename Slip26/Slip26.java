/*
Anu Keswani ---> Slip No 26

Write a java Program to accept ‘n’ no’s through the command line and store all the
prime no’s and perfect no’s into the different arrays and display both the arrays.
*/

class Slip26
{
	public static void main(String a[])
	{
		int no[]=new int[a.length];
		int i,k=0,l=0;
		int pm[]=new int[a.length];
		int pr[]=new int[a.length];

		for(i=0;i<a.length;i++)
		{
			no[i]=Integer.parseInt(a[i]);
		}

		System.out.println("Given array is ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(no[i]);
		}

		for(i=0;i<a.length;i++)
		{
			int j=2;
			int flag=0;
			while(j<=no[i]/2)
			{
				if(no[i]%j==0)
				{
					flag=1;
					break;
				}
				j++;
			}

			if(flag==0)
			{
				pm[k]=no[i];
				k++;
			}
			else
			{
				int sum=0;
				j=1;
			
				while(j<=no[i]/2)
				{
					if(no[i]%j==0)
						sum=sum+j;
					j++;
				}

				if(no[i]==sum)
				{
					pr[l]=no[i];
					l++;
				}
			}
		}//end of for

		System.out.println("prime numbers are");
		for(i=0;i<k;i++)
		{
			System.out.print(pm[i]+" ");
		}

		System.out.println("perfect numbers are");
		for(i=0;i<l;i++)
		{
			System.out.print(pr[i]+" ");
		}
	}
}