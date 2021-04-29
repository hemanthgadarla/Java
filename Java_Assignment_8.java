/*
Error Handling
        Create three new types of exceptions. Write a class with a method that throws all three. In main( ), call the method but only use a single catch clause that will catch all three types of exceptions. Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.

        Submit GitHub url.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Java_Assignment_8 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter two numbers to add");
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = a / b;  // cannot divide by zero
            int arr[] = new int[]{a, b};
            System.out.print("Enter the index of the element you need in the array : ");
            int index = Integer.parseInt(br.readLine());
            System.out.println(arr[index]);
            String assign = null;
            System.out.println("enter the character index you need in the string " + assign);
            int i = Integer.parseInt(br.readLine());
            System.out.println(assign.charAt(i));
            System.out.println("Result = " + c);

        } catch (ArithmeticException | IOException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Exception caught is : " + e.getMessage());
        } finally {
            System.out.println("This block gets executed whatever the circumstances may be");
        }
    }
}