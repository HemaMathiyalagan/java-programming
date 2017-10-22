/*
* Input  : n,a[n];
* Output : Yes
	Pairs are (10, 15), (9,  9) and (1, 5).
	All these pairs are sorted in non-decreasing order.
* @author HilariousHema
* @since 02-10-2017
*/
import java.io.*;
class First{
public boolean check(int[] a, int n)
{int i;
for(i=0;i<n;i+=2)
if(a[i]>a[i+1])
return false;
return true;
}}
class Sort
{
 public static void main(String args[])throws IOException
{int n,i,a[];
First f=new First();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of elements in array(number should be even)");
n=Integer.parseInt(br.readLine());
a=new int[n];
System.out.println("Enter the array elements");
for(i=0;i<n;i++)
a[i]=Integer.parseInt(br.readLine());
if(f.check(a,n))
System.out.println("Yes");
else
System.out.println("No");
} 
}
