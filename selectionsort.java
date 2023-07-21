package SortingAlgo;

import java.util.Arrays;

public class Selectionsoet {
	
	public static void main(String[] args) {
		
		int arr[]= {5,9,0,2,7};
		
		for(int round=0; round<arr.length-1;round++) {
			int smallest=round;
			for(int j=round+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
				
			}
			int temp=arr[smallest];
			arr[smallest]=arr[round];
			arr[round]=temp;
			
	}
		System.out.println(Arrays.toString(arr));
	}

}
