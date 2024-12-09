import java.util.Scanner;
public class LeanerSearch {
 public static void main(String args[]){
 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Size....");
    int n = sc.nextInt();
    int a[] = new int[n];
    int i, key, count=0, matchedvalue;
    System.out.println("Enter Array values....");
    for(i=0; i<=n-1;i++){
        a[i] = sc.nextInt();
    }
    System.out.println("Array values....");
    for(i=0; i<=n-1;i++){
        System.out.print(a[i]+",");
    }
    System.out.print("\n Enter Searching value..");
    key = sc.nextInt();
 
   for(i=0; i<=n-1; i++){
      if(a[i]==key){
        matchedvalue = a[i];
        count++;
        System.out.println("Leaner searched value = "+matchedvalue+" comes "+count+" times.");
      }
   } 

//    Even numbers in arrays
    for(i=0; i<=n-1; i++){
        if(a[i]%2 ==0){
            System.out.println("Even Numbers = "+a[i]);
        }
    } 

}   
}
