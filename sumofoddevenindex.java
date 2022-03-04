package Arraysinjava;

public class sumofoddevenindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {4, 5, 6, 7, 8, 9};
int even = 0;
int odd = 0;
for(int i = 0; i < arr.length; i++) {
	if(i % 2 == 0)
		arr[i] =+ even;
	else
		arr[i] =+ odd;
}
System.out.println("sum of even index positions: "+ even);
System.out.println("sum of odd index positions: "+ odd);
	}
}
