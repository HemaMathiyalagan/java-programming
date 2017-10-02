/*
* Stringseparation
* i/p: lbarziysk
       4
* o/p:lazy
        brisk
* @author: HilariousHema
* @since: 02-10-2017
*/
import java.util.*;
class StringSeparation
{
public static void main(String args[])
{
String s1;
int l,len,i=0,count=1;
String temp=new String();
String temp1=new String();
System.out.println("Enter the string");
Scanner sc=new Scanner(System.in);
s1=sc.next();
System.out.println("Enter the l value");
l=sc.nextInt();
len=s1.length();
while(i!=len)
{
if((i%2==0)&&(count<=l))
{
temp=temp+s1.charAt(i);
count++;
}
else
{
temp1=temp1+s1.charAt(i);
}
i++;}
System.out.println(""+temp);
System.out.println(""+temp1);
}
}
