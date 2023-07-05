package ST2Strings;
import java.util.*;
public class stringbuilder {
	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("hello");
		System.out.println(str);
		//str.setCharAt(0, 'm');
		//System.out.println(str);
		str.append(" world");
		System.out.println(str);
		
		//insert(index,ch)
		str.insert(2, 'r');
		System.out.println(str);
		
		//delete 
		str.deleteCharAt(0);
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		
		str.delete(0, 2);
		System.out.println(str );
		
		str.reverse();
		System.out.println(str);
		
			
	}

}
