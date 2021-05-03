public class Part3 {
      public boolean twoOccurrences(String stringa,String stringb){
          int firstIndex=stringb.indexOf(stringa);
          if(firstIndex==-1)
              return false;
          int secondIndex=stringb.indexOf(stringa,firstIndex+1);
          if(secondIndex==-1)
              return false;
          else
              return true;

      }
      public String  lastPart(String stringa,String stringb){
          int firstIndex=stringb.indexOf(stringa);
          if(firstIndex==-1)
              return stringb;
          else
              return stringb.substring(firstIndex+stringa.length());
      }
      public void testing(){
          System.out.println(twoOccurrences("a","banana"));
          System.out.println(twoOccurrences("wat","water"));
          System.out.println(lastPart("an","banana"));
          System.out.println(lastPart("zoo","forest"));
      }

    public static void main(String[] args) {
        Part3 p=new Part3();
        p.testing();
    }
}

