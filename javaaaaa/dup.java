// import java.util.Scanner;

// public class dup{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENTER NUMBER:");
//         int a = sc.nextInt();
//         while(a!=0){
//         int b = a%10;
        
            

//             System.out.println("kjbsk");
//         }
//     }
// }
import java.util.Scanner;

public class dup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input a number
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        
        // Array to track digits (0-9)
        System.out.println("woootyyytttt");
        boolean[] seen = new boolean[10];
        boolean hasDuplicate = false;

        while (num > 0) {
            int digit = (int)(num % 10); // extract last digit
            if (seen[digit]) {
                hasDuplicate = true;
                break;  // no need to check further
            }
            seen[digit] = true;
            num /= 10; // remove last digit
        }

        if (hasDuplicate) {
            System.out.println("The number has duplicate digits.");
        } else {
            System.out.println("The number has no duplicate digits.");
        }

        sc.close();
    }
}