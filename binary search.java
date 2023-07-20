package javawork;

import java.util.Arrays;

public class binarysearch {
	public static int searchInArray(int arr[], int target, int first, int last){
		
		while(first<=last) {
		int middleIndex=(first+last)/2;
		if(arr[middleIndex]==target) 
			return middleIndex;
		
		else if(arr[middleIndex]>target) 
			last=middleIndex-1;
			
		else 
			first=middleIndex+1;
		}
		return -1;
		
		}	
		
	
	
	public static void main(String[] args) {
		int arr[]= {3,6,9,2,0};
		int target=1;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int first=0;
		int last=arr.length-1;
		int index=searchInArray(arr,target,first,last);
		if(index>=0) {
			System.out.println("Got it : " + index);
		}else{
			System.out.println("not foud");
		}
		
	}

}
