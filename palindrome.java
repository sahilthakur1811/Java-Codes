import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        String n=S.nextLine();

        System.out.println(ispalindrome(n));
    }
    static boolean ispalindrome(String n) {
        char[] s = n.toCharArray();
        int l = s.length;
        for (int i = 0; i < (l/2); i++) {
            if (s[i] != s[l-1-i]) {
                return false;
            }
        }
        return true;
    }
    
}
