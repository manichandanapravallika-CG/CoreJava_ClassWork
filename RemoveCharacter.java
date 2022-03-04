package Stringsprograms;
vpackage arraysprogram;

public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder MyString = new StringBuilder("Hello World");
		System.out.println("The string before removing character: " + MyString);
		MyString = MyString.deleteCharAt(5);
		System.out.println("The string after removing character: " + MyString);
	}

}
