package javawork;
import java.util.*;

public class duplicate {
	
	public static void main(String[] args) {
		
	   String str = "Welcome to Java class . Java is very intresting . Hope class is good";
	   
	   // to find where is duplicate word is located
	   // first to split the string in words
	   
	   str = str.replace(".", "");
	   String arr[]=str.split(" ");
	 //  System.out.println(Arrays.toString(arr));
	   
	   for(int i=0;i<arr.length;i++) {
		   for(int j=i+1;j<arr.length-1;j++) {
			   if(arr[i].equalsIgnoreCase(arr[j]))
				   arr[j]="";
		   }
	   }
		
		System.out.println(Arrays.toString(arr));
		
		 
	}

}
