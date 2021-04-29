package hemanth.assignment.singleton;
//Create another class in package yourname.assignment.singleton containing a non static String member variable. Add a static method that takes String as parameter and initialize the member variable and then return object of that class. Add a non static method to print the String.
import java.util.*;
public class Demo {
    String var;
    static Demo d=new Demo();
    public static Demo getObject(String s){
        d.var=s;
        return d;
    }
    public void print(){
        System.out.print(this.var);
    }

}
