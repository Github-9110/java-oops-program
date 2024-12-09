/*The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable

Example explained
The get method returns the value of the variable name.

The set method takes a parameter (newName) and assigns it to the name variable. The this keyword is used to refer to the current object.

However, as the name variable is declared as private, we cannot access it from outside this class:
*/


class Person{
   private String name ;  

   //Setter
   public void setName(String newName){
    this.name = newName;
   }

   //getter

   public String getName(){
    return name;
   }
}


public class Encapsulation {
 public static void main(String args[]){
    Person obj = new Person();
    obj.setName("Pawan Developer");
    System.out.println(obj.getName());
 }
    
    
}
