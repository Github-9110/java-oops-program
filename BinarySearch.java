import java.util.Scanner;
public class BinarySearch {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter array size...");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter arrays...");
        for(i=0; i<=n-1; i++){
          a[i] = sc.nextInt();
        }
        System.out.println("Arrays Value...");
        for(i=0; i<=n-1; i++){
            System.out.print(a[i]+",");
          }
          System.out.println("");
        
        
    }
}

