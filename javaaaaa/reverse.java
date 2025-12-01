import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        int rem , rev = 0;
        while(n!=0){
            rem = n%10;
            rev = rev*10 + rem ;
            n = n /10 ;
        }
        System.out.println(rev);
        System.out.println("ENTER NAME:");
        String name = sc.nextLine();
        System.out.println("ENTER SURNAME:");
        String lname = sc.nextLine(); 
        System.out.println(name+lname);
        
    }
}