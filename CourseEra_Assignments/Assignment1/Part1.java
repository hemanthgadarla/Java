import java.io.*;
import java.util.*;
public class Part1 {
    public int findStopCodon(String dna,int startIndex,String stopCodon){
         int intial=startIndex;
          while(startIndex<dna.length()){
              startIndex=dna.indexOf(stopCodon,startIndex+1);
              if(startIndex==-1)
                  return dna.length();
              if((startIndex-intial)%3==0)
                  return startIndex;

          }
         return dna.length();
    }
    public String findGene(String dna){
        dna=dna.toUpperCase();
        int firstIndex =  dna.indexOf("ATG");
        if(firstIndex==-1)
            return "-1";
        //System.out.println(firstIndex);
        int lastindex = findStopCodon(dna,firstIndex,"TAA");

       int lastIndexTAG=findStopCodon(dna,firstIndex,"TAG");

        int lastIndexTGA=findStopCodon(dna,firstIndex,"TGA");

        int endIndex=Math.min(lastIndexTGA,Math.min(lastIndexTAG,lastindex));
        if(endIndex==dna.length())
            return "-1";
        else
            return dna.substring(firstIndex,endIndex+1);
    }
    public void testFindStopCodon(){
        System.out.println(findStopCodon("ctcgtaagggcgtctggcccgtctctatgcctcgatgagccgagcacgtagg",3,"aag"));
        System.out.println(findStopCodon("ctcgtaagggcgtctggcccgtcttatgcctgatgagccgagcacgtagg",7,"atg"));
        System.out.println(findStopCodon("ctcgtaagggcgtctggcccgtcttatgcctgatgagccgagcacgtagg",11,"ctc"));
        System.out.println(findStopCodon("atgccctaa",0,"taa"));
    }
    public void testFindGene() throws IOException {

        BufferedReader br =new BufferedReader(new FileReader("dna/brca1.fa"));
        String read=br.readLine();
        while(read!=null){
            System.out.println(findGene(read));
            read=br.readLine();

        }

    }
    public static void main(String[] args) throws IOException {
      Part1 p=new Part1();
      //p.testFindStopCodon();
      p.testFindGene();
    }
}
