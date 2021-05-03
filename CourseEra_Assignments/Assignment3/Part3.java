import java.awt.image.DataBufferDouble;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Part3 extends Part1{
    int ans=0;
    public int countGenes(String dna,Part3 p){
        if(dna.length()==0)
            return 0;
        String find=p.findGene(dna);
        if(find.equals("-1"))
            return 0;
        int index=dna.indexOf(find)+find.length();
       if(find.length()>60)
           ans++;
        return 1+countGenes(dna.substring(index),p);
    }
    public void testCountGenes() throws IOException {
        Part3 p=new Part3();
        BufferedReader br =new BufferedReader(new InputStreamReader(new URL("https://users.cs.duke.edu/~rodger/GRch38dnapart.fa").openStream()));
        String read=br.readLine();
        while(read!=null) {
            System.out.println(countGenes(read, p));
            System.out.println(ans);
            read=br.readLine();
        }

    }
    public static void main(String[] args) throws  IOException{
        Part3 p=new Part3();
        p.testCountGenes();
    }
}
