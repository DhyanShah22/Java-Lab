import java.io.*;

public class encdec {
    public static void main(String args[]){
        if(args.length != 3){
            System.out.println("Usage: Java FileEncryption <filename> <key> <encrypt|decrypt>");
            return;
        }
        String filename = args[0];
        int key = Integer.parseInt(args[1]);
        String operation = args[2].toLowerCase();

        try{
            if(operation.equals("encrypt")){
                encryptFile(filename, key);
                System.out.println("File Encrypted successfully");
            }
            else if(operation.equals("decrypt")){
                decryptFile(filename, key);
                System.out.println("File Decrypted successfully");
            }
            else{
                System.out.println("Invalid operation!");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void encryptFile(String filename, int key) throws IOException {
        try (InputStream is = new FileInputStream(filename);
        OutputStream os = new FileOutputStream(filename + ".encrypted")) {
        encrypt(is, os, key);}} 
        
    public static void decryptFile(String filename, int key) throws
        IOException {
        try (InputStream is = new FileInputStream(filename);
        OutputStream os = new FileOutputStream(filename + ".decrypted")) {
        decrypt(is, os, key);}}
    public static void encrypt(InputStream is, OutputStream os, int key) throws IOException {
        int bytesRead;
        while ((bytesRead = is.read()) != -1) {
        os.write(bytesRead + key);}}
    public static void decrypt(InputStream is, OutputStream os, int key) throws IOException {
        int bytesRead;
        while ((bytesRead = is.read()) != -1) {
        os.write(bytesRead - key);}}
}
