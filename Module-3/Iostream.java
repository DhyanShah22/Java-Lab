import java.io.*;

public class Iostream {
    private static BufferedWriter bw;
    public Iostream(FileReader fileReader) {} 

    public static void main(String args[]){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("TextFile.txt"));
            bw = new BufferedWriter(new FileWriter("lowercasetextfile.txt", true));
            String line = br.readLine();
            while(line!=null){
                bw.write(line.toLowerCase()+ "\n");
                line = br.readLine();
            }
            bw.flush();
            System.out.println("R-W Complete!");
        }
        catch(IOException e){
            System.out.println(e);

        } finally {
            if(br!=null){
                try{
                    br.close();
                }
                catch(Exception e){
                    System.out.println("File Not Opened!");
                }
            }
        }
    }
}
