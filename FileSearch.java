//Java Program to search the given type of files in the home directory
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class FileSearch {
    public void findFiles(String path, String file_name) {
        //get all the files in the given path 
        File directory = new File(path);
        File files[] = directory.listFiles();
        
        if (files != null && files.length > 0) {
            //Iterate over the files and for each file check 
            for (File file : files) {
               //if the file is directory
                if (file.isDirectory()) {
                   //recursively search for the file
                    findFiles(file.getAbsolutePath(), file_name);
                } else {
                   //get the name of the file and check whether it ends with the given file_type
                    String each_file = file.getAbsolutePath();
                    if (file.getName().endsWith("." + file_name))
                        System.out.println(file.getAbsolutePath() + " " + file.getName());
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //read the File type you want to search
        String file_name = br.readLine();
        //Create object and call the function with path as home 
        FileSearch file_search = new FileSearch();
        file_search.findFiles("/home", file_name);
    }
}
