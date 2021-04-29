import java.io.*;
import java.util.*;
public class Java_Assignment_11 {
    private static HashMap<Character,Integer> map=new HashMap<>();
    static void countChars(String input){

        for(char c : input.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
    }
    static void writeToFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        for(Character c : map.keySet()){
            writer.append(c+" "+map.get(c));
            writer.append("\n");
        }
        writer.close();
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new FileReader(args[0]));
        String read=br.readLine();
        while(read!=null){
            countChars(read);
            read=br.readLine();
        }
        writeToFile();
    }
}

