import java.util.*;
public class pan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        int temp = n ;
        int rem , rev = 0;
        while(n!=0){
            rem = n%10;
            rev = rev*10 + rem ;
            n = n /10 ;
        }
        if(temp == rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        
    
    }
}
