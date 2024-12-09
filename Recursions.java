public class Recursions { // Class 1

   int count =0;
    // Method 1
    // Method of this class
    public void recu(){     /*  <access_modifier> <return_type> <method_name>( list_of_parameters) {   //body }*/

     if(count == 3){
        return;
     }else{
        System.out.println(count);
        count++;
        recu();
     }
   }

   // Method 2
   // Main driver method
       public static void main(String args[]){
       Recursions obj = new Recursions();
       // Creating instance of the class inside the main() method. Syntax : <ClassName> object=new <ClassName> 
       obj.recu();
       // Calling the method of class 1; syntax: object.<MethodName>
    }
}

