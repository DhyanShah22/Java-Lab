import java.util.Scanner;

class capital {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the line: ");
        String str = scan.nextLine();
        int ccount=0;
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                ccount++;
            }
        }
        System.out.println("The number of words starting with capital letters are: "+ ccount);
        scan.close();
    }
}
