import java.util.Scanner;
public class Patterns {

    public static void nForest(int n){
        int i,j;
        for(i=0; i<=n-1; i++){
            for(j=0; j<=n-1; j++){
                System.out.print("* ");
              }
              System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter array size...");
        n = sc.nextInt();
        
        nForest(n);
              
        
    }
}

