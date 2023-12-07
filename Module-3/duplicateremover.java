import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class duplicateremover {
    private static BufferedWriter bw;
    public duplicateremover(String inputFilePath, String outputFilePath){
        try{
            BufferedReader br = new BufferedReader(new FileReader((inputFilePath)));
            bw = new BufferedWriter(new FileWriter(outputFilePath, true));

            String line;
            Set<String> set = new HashSet<>();
            while((line = br.readLine()) != null){
                if(set.add(line)){
                    bw.write(line);
                    bw.newLine();
                }
            }
            br.close();
            bw.close();
            System.out.println("Task Completed!");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        new duplicateremover("duplicate.txt", "duplicated.txt");
    }
}
