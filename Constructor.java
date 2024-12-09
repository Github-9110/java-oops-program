public class Constructor {
    int studentAge;
    String studentName;
  
    public Constructor(int year, String name) { // constructor is a same name of the class name when we create the instance of the class constructor automatically execute.
      studentAge = year;
      studentName = name;
    }
  
    public static void main(String[] args) {
        Constructor obj = new Constructor(1999, "Shubham");
      System.out.println(obj.studentAge + " " + obj.studentName);
    }
  }
  