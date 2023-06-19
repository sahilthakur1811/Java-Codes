package ST2Strings;
import java.util.*;
public class Toggle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		
		char[] a= s.toCharArray();

		
		for(int i=0;i<s.length();i++) {
			 char ch=a[i]; //index for value
			 if(Character.isLowerCase(ch)) {
				 ch=Character.toUpperCase(ch);
			 }else {
				 ch=Character.toLowerCase(ch);
			 }
			 a[i]=ch;
		}
		System.out.println(new String(a));
		
	}

}
