package Arraysinjava;
public class countnoofintegers {
	public static void main(String[] args) {
		int[] arr= {1, 10, 20, 1, 25, 1, 10, 30, 25, 1};
		int count=0;
for(int i=0;i<arr.length;i++)
{	
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
count++;
}
}
}
System.out.println(count);
}
}

