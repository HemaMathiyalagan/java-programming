package com.hema.array;

public class JugglingArrayRotation {
public static void main(String args[])
{
int d=2;
int a[]= {1,2,3,4,5,6};
arrRotate(a,d,a.length);
for(int i=0;i<a.length;i++)
	System.out.println(a[i]);
}
public static void arrRotate(int[] a,int d,int len)
{
int gcd=gcd(d,len);
int temp,j,k,i;
for(i=0;i<gcd;i++)
{
	temp=a[i];
	j=i;
	while(true)
	{
		k=j+d;
		if(k>=len)
			k=k-len;
		if(i==k)
			break;
		a[j]=a[k];
		j=k;
	}
	a[j]=temp;
}
}
public static int gcd(int a,int b)
{
if(b==0)
	return a;
else
	return gcd(b,a%b);
}
}
