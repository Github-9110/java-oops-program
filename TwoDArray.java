import java.util.Scanner;
public class TwoDArray {
    public static void main(String args[]){

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter arrays size...");
       int n = sc.nextInt();
       int m = sc.nextInt();
       int i, j;

       int a[][] = new int[n][m];
       System.out.println("Enter arrays values...");
       for(i=0; i<=n-1; i++){
             for(j=0; j<=n-1; j++){

                a[i][j] = sc.nextInt();

             }
       }

       System.out.println("arrays values...");
       for(i=0; i<=n-1; i++){
        for(j=0; j<=n-1; j++){

           System.out.print(a[i][j]+ " ");

        }
        System.out.println(" ");
       }

       /* Sum of 2D Array */
       System.out.println("sum of arrays values...");
       
       for(i=0; i<=n-1; i++){
        int sum = 0;
        for(j=0; j<=n-1; j++){
            System.out.print(a[i][j]+ " ");
            sum = sum + a[i][j];
        }
        System.out.println("= "+sum);
       }

    }
}

