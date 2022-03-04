package Stringsprograms;

import java.util.Arrays;

public class Duplicatecharacters {
		static String removeDuplicate(char str[], int n) {
			int index = 0;
			for(int i = 0; i < n; i++)
			{
				int j;
				for(j = 0; j < i; j++) {
					if(str[i] == str[j])
					{
						break;
					}
				}
				if(j == 1)
				{
					str[index++] = str[i];
				}
		}
return String.valueOf(Arrays.copyOf(str, index));
	}
public static void main(String[] args) {
	char str[] = "geeksforgeeks" . toCharArray();
	int n = str.length;
	System.out.println(removeDuplicate(str,n));
}
}
