import java.util.Scanner;
public class Strings {
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);

   String s = " ";
   s = s.trim();

   int sp = 0;
    System.out.println("Enter a String....");
    s = sc.nextLine();
    System.out.println("Length = "+s.length());

    for(int i=0; i<=s.length()-1; i++){
        if(s.charAt(i) == ' '){
          sp++;
        }
        System.out.print(s.charAt(i)+", ");
    }
    System.out.println("Number of word= "+(sp+1));
    System.out.println("Number of Character= "+(s.length()-sp));
    System.out.println(" ");

   } 
}

