import java.util.Scanner;

class linevc {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String str = scan.nextLine();
        int ccount=0;
        int vcount=0;
        str = str.toLowerCase();
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o'|| str.charAt(i)== 'u'){
                vcount++;
            }
            else if(str.charAt(i) >='a' && str.charAt(i)<='z'){
                ccount++;
            }
        }
        System.out.println("The vowels are: "+ vcount);
        System.out.println("The consonants are: "+ ccount);

        scan.close();
    }
}
