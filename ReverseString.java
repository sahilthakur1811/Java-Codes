package ST2Strings;

import java.util.*;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		
		String [] a=s.split(" ");
		String[] b = null ;
		int n=a.length;
		
		for(int i=0;i<n;i++) {
			char[] x = a[i].toCharArray();
			char[] y = a[i].toCharArray();
			int k=0;
			for(int j=x.length-1;j>=0;j--) {
				
				y[k]=x[j];
				k++;
			
		}
		  a[i]=new String(y);
			
			
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i] + " Scanner ;");
		}
		

	}
