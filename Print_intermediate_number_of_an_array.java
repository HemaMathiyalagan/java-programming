/*
*INPUT: N=3
       A[3]=2, 7,10
*OUTPUT:THE NUMBER BETWEEN 2 AND 7 IS 
       3 4 5 6
       THE NUMBER BETWEEN 7 AND 10 IS
       8 9
* @author HilariousHema
* @since 02-10-2017
*/
import java.util.*;
class Print_intermediate_number_of_an_array{
public static void main(String args[]){
int n,p;
System.out.println("Enter n value");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the element");
for(int i=0;i<n;i++)
a[i]=s.nextInt();
for(int i=0;i<n-1;i++)
{System.out.println("the number between "+a[i]+"and "+a[i+1]+"is ");
p=a[i];
p++;
while(p<a[i+1]){
System.out.print(" "+p);
p++;
}
System.out.println("");
}
}}
