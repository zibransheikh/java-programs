import java.util.Arrays;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if(size<0){
            System.out.println("Negative array size");
        }
        else{
            int [] array = new int[size];
            for(int  i = 0 ; i < size   ; i ++){
                array[i] = sc.nextInt();
            }
        }

    }
}

