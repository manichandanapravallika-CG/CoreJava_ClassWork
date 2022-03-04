package Arraysinjava;
import java.util.Scanner;
public class elementremoving {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int a;
System.out.println("enter no.of elements");
a=sc.nextInt();
Integer arr[]=new Integer[a];
System.out.println("enter elements innto array");
for(int i=0;i<a;i++)
{
	arr[i]=sc.nextInt();
}
System.out.println("enter elements to be remove");
int element = sc.nextInt();
for(int i=0;i<arr.length;i++)
{
	if(arr[i] ==element)
	{
		for(int j=i;j<arr.length-1;j++)
		{
			arr[j]=arr[j+1];
		}
		break;
	}
}
System.out.println("elements after removing: ");
for(int i=0;i<arr.length-1;i++)
{
	System.out.println(arr[i]+ " ");
}
	}
}
