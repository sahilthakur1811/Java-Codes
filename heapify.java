import java.util.*;
public class quicksort {
   public static void main(String[] args) {
    PriorityQueue<Integer>pq=new PriorityQueue<>();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    for(int i=0;i<n;i++){
        pq.offer(sc.nextInt());
    }
    Object arr[]=pq.toArray();
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }  
   }

}
