import java.net.*;
import java.io.*;
import java.util.Arrays;
import java.util.Locale;

public class Part4 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
        BufferedReader read = new BufferedReader(
                new InputStreamReader(url.openStream()));
        String i;
        while ((i = read.readLine()) != null){
            String link=i.toLowerCase();
            if(link.contains("youtube.com")){
                int firstindex=link.indexOf("href=");
                int lastindex=link.indexOf('"',firstindex+6);
                System.out.println(link.substring(firstindex+6,lastindex));
            }
            //System.out.print(link);
        }
        read.close();
    }
}

