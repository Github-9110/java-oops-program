public class Functions { // user define class
    /* Syntax :  <access_modifier>  <return_type> <method_name>( list_of_parameters) {   //body }*/

    public void function1(){
        System.out.println("This is function definition. 1. User-Defined Methods you will have to create the instance of class and create the object/instance of class for function calling inside main() function.");
    }
    

    // 2. Abstract Methods calling

    public static void main(String args[]){
                                                    /* create the instance of user
                                                    define class nside the main() method.
                                                    Syntax : <ClassName> object=new <ClassName>  */ 
        Functions obj = new Functions();

        obj.function1(); 
                                                // Calling the method of class 1; syntax: object.<MethodName>

        
    }
}

