package javawork;

public class kadanalgorithm {
	
	public static void main(String[] args) {
		
		int arr[]= {7, -10, 6, -3, 12};
		int maxsum=arr[0];
		int cursum=0;
		
		for(int i=0;i<arr.length;i++) {
			cursum=cursum+arr[i];
			if(cursum>maxsum)
				maxsum=cursum;
		
		if(cursum<0) {
			cursum=0;
		}
	}
		System.out.println("Max sum : " + maxsum);
		

}
}
