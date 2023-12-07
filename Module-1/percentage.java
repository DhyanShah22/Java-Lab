import java.util.*;

class percentage {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter marks in DS: ");
        float m1 = scan.nextFloat();
        System.out.print("Enter marks in MPI: ");
        float m2 = scan.nextFloat();
        System.out.print("Enter marks in DECO: ");
        float m3 = scan.nextFloat();
        System.out.print("Enter marks in OOPs: ");
        float m4 = scan.nextFloat();
        System.out.print("Enter marks in OE: ");
        float m5 = scan.nextFloat();
        System.out.print("Enter marks in Maths: ");
        float m6 = scan.nextFloat();

        float sum = m1+m2+m3+m4+m5+m6;
        float average = sum/6;

        System.out.println("The percenatge obtained is: "+ average);

        scan.close();
    }
}
