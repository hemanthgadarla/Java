package hemanth.assignment.data;

public class DefaultInit {
    int num;
    char alpha;
   public void methodDefault(){
       int a;
       int b;
       //local variables not intialised so it shows compile time error
       //System.out.println(a+" "+b);
   }
   public void display(){
       System.out.println("Default values of int and char:");
       System.out.print(num+" "+alpha);
   }
}
