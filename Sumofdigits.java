import java.io.*;
import java.util.Scanner;
public class Sumofdigits {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number...");
     int n = sc.nextInt();
     int a, s=0, reverse = 0;
     while( n!= 0){
        a = n%10; 
        s = s+a;  // Sum of digits
        reverse = reverse*10+a; // Reverse of digits
        n = n/10;

        
     }
     
     System.out.println("sume of Digits = "+s);
     System.out.println("Reverse Number of Digits = "+reverse);

    }
}
