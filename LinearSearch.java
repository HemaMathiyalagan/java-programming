package com.hema.array;

//Time complexity o(n)
public class LinearSearch {

public static void main(String args[])
{
int a[]= {10,2,3,40,1,5};
int d=100;
if(search(a,d)==1)
	System.out.println("Available");
else
	System.out.println("Not Available");
}
public static int search(int[] a,int d)
{
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==d)
			return 1;
	}
	return -1;
}

}
