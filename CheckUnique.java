import java.util.*;
public class CheckUnique  { 

      public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        //read the input string
        String s=sc.next();
        //convert the input string to all lowercase alphabets
        s=s.toLowerCase();
        HashSet<Character> set=new HashSet<>();
        //Iterate through all the characters and add in the set
        for(char c : s.toCharArray()){
          if(c>='a' && c<='z')
            set.add(c);
        }
        //If set contains all characters i.e 26 then string is valid else invalid
        if(set.size()==26)
        System.out.println("Valid String");
        else
        System.out.println("Invalid String");
    }
}
