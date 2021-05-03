public class Part1 {
     public String findSimpleGene(String dna) {
         int firstIndex =  dna.indexOf("ATG");
         if(firstIndex==-1)
             return "";
         int lastindex = dna.indexOf("TAA",firstIndex);
         if(lastindex==-1)
             return "";
         if((lastindex-firstIndex-3)%3==0)
             return dna.substring(firstIndex,lastindex+3);
         else
             return "";
     }
     public void testSimpleGene(){
         String dnaSamples[]={"CTATGATAAGGCGACG",
                 "ATGAGAGCCAAGCGGTAAG",
                 "CATGCTGCTGTGGCAT",
                 "TAACTAGTTAGTGTAG",
                 "ATGAACACTCTGTTAT",
                 "GTTTCTTCGATTAACC",
                 "TGATAAGCCGGCCTTT",
                 "GCCACCGTCCGACGAC",
                 "AGGCTTATCCCGCCTC",
                 "TTGGTTACATAGTTAA"};
         for(String s : dnaSamples)
             System.out.println(findSimpleGene(s));
     }

    public static void main(String[] args) {
        Part1 p=new Part1();
        p.testSimpleGene();
    }
}


