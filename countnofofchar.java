package Arraysinjava;
public class countnofofchar {
	public static void main(String[] args) {
		char[] b= {'a', 'b', 'b', 'c', 'a', 'z'};
		int count=0;
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
					count++;
			}
		}
		System.out.println(count);
	}
}
