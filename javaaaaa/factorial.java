import java.util.*;
public class factorial {
    public static void main(String[] args) {
        int i ;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER:");
        int n = sc.nextInt();
        int fact = 5 ;
        for(i=1;i<n;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
