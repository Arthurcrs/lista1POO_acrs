package lista1;
import java.util.*;

public class Problem5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String str1 = s.nextLine();
		System.out.println("Enter second string: ");
		String str2 = s.nextLine();
		System.out.println(ComparadorDeStrings.isReverse(str1,str2));
		if(ComparadorDeStrings.isReverse(str1,str2)) {
			System.out.println("The strings are the reverse of one another");
		}else{
			System.out.println("The strings are not the reverse of one another");
		};
	}
	
	public static class ComparadorDeStrings{
			
		public static boolean isReverse(String str1, String str2) {
			
			if (str1.length() != str2.length()) {
				return false;
			}
			for(int i = 0; i < str1.length()/2; i++) {
				if (str1.charAt(i) != str2.charAt(str2.length() - 1 - i)){
					return false;
				}
			}
			return true;
		}
	}
}
