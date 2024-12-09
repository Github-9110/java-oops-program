import java.util.Scanner;

public class Wrapperclass {
    
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    int n = sc.nextInt();
    System.out.println("Input value = "+n);

    int a = Integer.parseInt("12");
    System.out.println("String to integer = "+a); //String to Integer

    float f = Float.parseFloat("58.12"); //String to Float
    System.out.println("String to Float = "+f); 

    double d = Double.parseDouble("58.12"); //String to Double
    System.out.println("String to Double = "+d); 

    String ss = Integer.toString(n);
    if (ss != null) {
        System.out.println("Integer to String conversion is successful.");
        System.out.println("Converted String: " + ss);
    } else {
        System.out.println("Integer to String conversion failed.");
    }
   
    }
}
