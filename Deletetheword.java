package Stringsprograms;

import java.util.Scanner;

public class Deletetheword {

	public static void main(String[] args) {
         String str, word;
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the String :");
             str = scan.nextLine();
             System.out.println("Enter the word delete from the String :");
             word = scan.nextLine();
             str = str.replaceAll(word, "");
             System.out.println("New String is : \n");
             System.out.println(str);
	}
}
