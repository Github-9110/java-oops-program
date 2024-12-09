import java.util.Scanner;
public class ReverseArrays {
 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array....");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        System.out.println("Enter array's values...");
        for(i=0; i<=n-1; i++){ 
            a[i] = sc.nextInt();
        }
        System.out.println("array's values...");
        for(i=0; i<=n-1; i++){
            System.out.print(a[i]+",");
        }
        System.out.println("\n");

        for(i=0; i<=n/2; i++){ //Reverse code
           int temp = a[i];
           a[i] = a[n-1-i];
           a[n-1-i] = temp;
           
        }
        System.out.println("array's values...");
        for(i=0; i<=n-1; i++){
            System.out.print(a[i]+",");
        }
        System.out.println("\n");

    }
}

