package ST2Strings;
import java.util.*;
public class anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String k=sc.nextLine();
	
		 
		s=s.toLowerCase();
		k=k.toLowerCase();
		System.out.println(k + s);
		
		char[] a=s.toCharArray();
		char[] b=k.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean x= Arrays.equals(a, b);
		System.out.println(x);
		
	}

}
