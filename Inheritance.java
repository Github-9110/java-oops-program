
class SuperClass{ //  super class
    protected String Name = "James Gosling"; //attribute

    public void Mymessage(){    // methods
      System.out.println("This is block of Super class.");
    }
}


public class Inheritance extends SuperClass { // child class
    private String Developed = "Java Language";
    public static void main(String args[]){
      Inheritance obj = new Inheritance(); // instance of child class

      obj.Mymessage();
      System.out.println(obj.Name+" Developed "+ obj.Developed);
    }
}

