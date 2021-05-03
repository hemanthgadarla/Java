import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;

public class WordFrequencies {
    private ArrayList<String> myWords;
    private ArrayList<Integer> myFreqs;
    WordFrequencies(){
        myWords=new ArrayList<String>();
        myFreqs=new ArrayList<Integer>();
    }
    public void findUnique() throws IOException {
        myFreqs.clear();
        myWords.clear();
        BufferedReader br=new BufferedReader(new FileReader("testwordfreqs.txt"));
        String read=br.readLine();
        while(read!=null){
            String arr[]=read.split(" ");
            for(int i=0;i<arr.length;i++){
                if(!myWords.contains(arr[i])) {
                    myWords.add(arr[i]);
                    myFreqs.add(1);
                }
                else
                {
                    int index=myWords.indexOf(arr[i]);
                    myFreqs.set(index,myFreqs.get(index)+1);
                }
            }
            read=br.readLine();
        }
    }
    public void tester()throws IOException{
         findUnique();
         for(int i=0;i<myWords.size();i++){
             System.out.println(myWords.get(i)+" "+myFreqs.get(i));
         }
    }
    public int findIndexOfMax(){
        int max=0;
        String word="";
       for(int i=0;i<myFreqs.size();i++){
           if(max<myFreqs.get(i))
           {
               max=myFreqs.get(i);
               word=myWords.get(i);
           }
       }
       System.out.println("This is the most frequent word:"+word+" "+max);
       return max;
    }
    public static void main(String[] args) throws IOException{
        WordFrequencies w=new WordFrequencies();
        w.tester();
        w.findIndexOfMax();
    }
}
