package hemanth.assignment.main;
import hemanth.assignment.data.DefaultInit;
import hemanth.assignment.singleton.Demo;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to pass:");
        Demo obj = Demo.getObject(sc.next());
        obj.print();
        System.out.println();
        DefaultInit dfi = new DefaultInit();
        dfi.display();
    }
}
