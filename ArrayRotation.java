/*
*Input  : a[],n,d;
*output : rotated array
*@author: HilariousHema
*@since : 26.10.2017
*/
import java.util.*;
public class ArrayRotation
{
public static void main(String arg[])
	{
	 Scanner sc=new Scanner(System.in);
	 int a[],n,d,i;
	 System.out.println("Enter the size of array");
	 n=sc.nextInt();
	 a=new int[n];
	 System.out.println("Enter the array elements");
	 for(i=0;i<n;i++)
	 a[i]=sc.nextInt();
     System.out.println("Enter the d value");
	 d=sc.nextInt();
	 ArrayRotation ar=new ArrayRotation();
	 for(i=0;i<d;i++)
	 ar.rotate(a,n);
	 System.out.println("Array after rotation");
	 for(i=0;i<n;i++)
	 System.out.println(a[i]);
	 
	}
public void rotate(int a[],int n)
	{
	 int temp,i=0;
	 temp=a[i];
	 for(i=0;i<n-1;i++)
	 a[i]=a[i+1];
	 a[i]=temp;
	}
}