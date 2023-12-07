import java.util.*;

class calculator  {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        float x = scan.nextFloat();
        System.out.println("Enter 2nd number: ");
        float y = scan.nextFloat();

        float addition = x+y;
        float subtraction = x-y;
        float multiplication = x*y;
        float division = x/y;
        float remainder = x%y;

        System.out.println("Addition is: "+ addition);
        System.out.println("Subtraction is: "+ subtraction);
        System.out.println("Multiplication is: "+ multiplication);
        System.out.println("Division is: "+ division);
        System.out.println("Remainder is: "+ remainder);

        scan.close();
    }
}
