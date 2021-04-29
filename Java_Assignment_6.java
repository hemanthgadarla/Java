import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Java_Assignment_6 {

    //Preprocessing to generate random strings
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static String randomAlphaNumeric(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

    private static int numDigits(long num) {
        return Long.toString(Math.abs(num)).length();
    }

    private static boolean factCheck(long orig, long fang1, long fang2) {
        if (Long.toString(fang1).endsWith("0") && Long.toString(fang2).endsWith("0")) return false;

        int origLen = numDigits(orig);
        if (numDigits(fang1) != origLen / 2 || numDigits(fang2) != origLen / 2) return false;

        byte[] origBytes = Long.toString(orig).getBytes();
        byte[] fangBytes = (Long.toString(fang1) + Long.toString(fang2)).getBytes();
        Arrays.sort(origBytes);
        Arrays.sort(fangBytes);
        return Arrays.equals(origBytes, fangBytes);
    }

    //Driver Code
    public static void main(String[] args) {


        //Vampire Numbers Driver Code to print first 100 vampire numbers
        HashSet<Long> vamps = new HashSet<Long>();
        vamps.clear();
        int sno = 1;
        for (long i = 100; vamps.size() < 99; i++) {
            if ((numDigits(i) % 2) != 0) {
                i = i * 10 - 1;
                continue;
            }
            for (long fact1 = 2; fact1 <= Math.sqrt(i) + 1; fact1++) {
                if (i % fact1 == 0) {
                    long fact2 = i / fact1;
                    if (factCheck(i, fact1, fact2) && fact1 <= fact2) {
                        vamps.add(i);
                        System.out.println(sno + ")" + i);
                        sno++;
                    }
                }
            }
        }
        System.out.println();
        //Call Class With Overloaded Constructors
        Overload obj =new Overload();
        System.out.println();
        //Create an array of class Check Objects
        Check arr[]=new Check[10];
        System.out.println();
        //If the program is run now there is not message that constructor is called
        for(int i=0;i<10;i++){
            arr[i]=new Check(randomAlphaNumeric((i+4)%10+1));
        }
    }
}

//Class with Overloaded Constructors
class Overload{
    Overload(){
        this(10);
        System.out.println("Overloaded constructor without parameters");
    }
    Overload(int a){
        System.out.println("Overloaded constructor called with value:"+a);
    }
}

//task 3: class with string as parameter constructor

class Check{
    Check(String s){
        System.out.println("Constructor called with argument : "+s);
    }
}
