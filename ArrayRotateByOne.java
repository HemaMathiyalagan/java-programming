package com.hema.array;

public class ArrayRotateByOne {
public static void main(String args[])
{
int d=3;
int a[]= {1,2,3,4,5,6,7,8};
arrRotate(a,d,a.length);
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);	
}
}
public static void arrRotate(int[] a,int d,int l)
{
	int temp,j,i;
	d=d%l;
for(i=0;i<d;i++)
{
	temp=a[0];
for(j=0;j<l-1;j++)
	a[j]=a[j+1];
a[j]=temp;
}
}
}
