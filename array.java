import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt(); //reading the number of elements
        int[] array=new int[10];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }

    }
}
