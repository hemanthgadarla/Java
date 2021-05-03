import java.util.Locale;

public class Part2{
    public String findSimpleGene(String dna,String startCodon,String stopCodon) {
        int firstIndex =  dna.indexOf(startCodon);
        if(firstIndex==-1)
            return "";
        int lastindex = dna.indexOf(stopCodon,firstIndex);
        if(lastindex==-1)
            return "";
        if((lastindex-firstIndex-startCodon.length())%3==0)
            return dna.substring(firstIndex,lastindex+stopCodon.length());
        else
            return "";
    }
    public void testSimpleGene(){
        String dnaSamples[]={"CTATGATAAGGCGACG",
                "ATGAGAGCCAAGCGGTAAG",
                "CATGCTGCTGTGGCAT",
                "TAACTAGTTAGTGTAG",
                "ATGGGTTAAGTC",
                "gatgctataat"};
        for(String s : dnaSamples) {
            String gene = findSimpleGene(s.toUpperCase(), "ATG", "TAA");
            if(isStringLowerCase(s))
                System.out.println(gene.toLowerCase());
            else
                System.out.println(gene);
        }
    }
    public boolean isStringLowerCase(String str){
        char[] charArray = str.toCharArray();

        for(int i=0; i < charArray.length; i++){

            if( !Character.isLowerCase( charArray[i] ))
                return false;
        }

        return true;

    }
    public static void main(String[] args) {
        Part2 p=new Part2();
        p.testSimpleGene();
    }
}


