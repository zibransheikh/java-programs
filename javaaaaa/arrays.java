
import java.util.Scanner;

public class arrays {
    public static void main(String[]args){
    

        Scanner sc = new Scanner(System.in);
        int[][] ary =new int[2][2];
        for(int i =0 ; i <2 ; i++){
            for(int j = 0; j<2;j++){
                ary[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for(int i =0 ; i <2 ; i++){
            for(int j = 0; j<2;j++){
                System.out.print(ary[i][j]+" ");
            }
        System.out.println();
        }
        int[][] arr =new int[2][2];
        for(int i =0 ; i <2 ; i++){
            for(int j = 0; j<2;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for(int i =0 ; i <2 ; i++){
            for(int j = 0; j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
        int x , y ;
        int[][] arr3 =new int[2][2];
        for(x =0 ; x <2 ; x++){
            for(y = 0; y<2;y++){
                arr3[x][y] = ary[x][y]+arr[x][y];
            }
            System.out.println();
        }
        System.out.println();
        for(int i =0 ; i <2 ; i++){
            for(int j = 0; j<2;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    } 
}


