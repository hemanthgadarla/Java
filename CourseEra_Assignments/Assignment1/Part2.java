public class Part2 {
    public int  howMany(String stringa,String stringb){
        if(stringb.length()==0 || !stringb.contains(stringa))
            return 0;
        else {
            int index=stringb.indexOf(stringa);
            return 1 + howMany(stringa, stringb.substring(index+stringa.length()));
        }
    }
    public void testHowMany(){
        System.out.println("Occurances:"+howMany("GAA","ATGAACGAATTGAATC"));
        System.out.println("Occurances:"+howMany("AA","ATAAAA"));
    }
    public static void main(String[] args) {
        Part2 p=new Part2();
        p.testHowMany();
    }
}

