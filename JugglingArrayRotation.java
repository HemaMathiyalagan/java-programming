package com.hema.array;

public class JugglingArrayRotation {
	public static void main(String args[])
	{
		int d=8;
		int a[]= {1,2,3,4,5,6,7};
		arrRotate(a,d,a.length);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	public static int gcd(int a,int b)
	{
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}
	public static void arrRotate(int a[],int d, int l)
	{
		d=d%l;
		int i,j,k,temp;
		for(i=0;i<gcd(d,l);i++)
		{
			temp=a[i];
			j=i;
			while(true)
			{
				k=j+d;
				if(k>=l)
					k=k-l;
				if(k==i)
					break;
				a[j]=a[k];
				j=k;
			}
		}
	}
}
