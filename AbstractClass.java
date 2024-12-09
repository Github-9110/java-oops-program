
abstract class multiply{
    public abstract int multiplied(int n, int m);
    public abstract double multiplied(double n, double m, double c);
    public void show() {  
        System.out.println ("Method of abstract class Multiply");  
    }  
}
// abstract class   ended

public class AbstractClass extends multiply{ // Regular class (inherit from multiply class)
    public int multiplied(int n, int m){    // method overloading : same function but different parameters
        return n*m;
    }

    public double multiplied(double n, double m, double c){  
        return n*m*c;
    }

    public static void main(String args[]){
        multiply obj = new AbstractClass();
        int x1 = obj.multiplied(10,20);
        double x2 = obj.multiplied(10,20,30);
       System.out.println("multiply of two digits = "+x1);
       System.out.println("multiply of two digits = "+x2);
       obj.show();
    }
}


