import java.util.Scanner;

class scicalc {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Scientific Calculator.");
        System.out.println("1. Square root");
        System.out.println("2. Power");
        System.out.println("3. Trigonometric Sine");
        System.out.println("4. Trigonometric Cosine");
        System.out.println("5. Trigonometric Tangent");
        System.out.print("Enter your choice (1-5): ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                double number = scan.nextInt();
                double squareRoot = Math.sqrt(number);
                System.out.println("The square root of " + number + "is: " + squareRoot);
                break;
            case 2:
                System.out.print("Enter a base: ");
                double base = scan.nextInt();
                System.out.print("Enter an exponent: ");
                double exponent = scan.nextInt();
                double power = Math.pow(base, exponent);
                System.out.println(base + "raised to the power " + exponent + "is: " + power);
                break;
            case 3:
                System.out.print("Enter an angle: ");
                double angle = scan.nextInt();
                double sine = Math.sin(Math.toRadians(angle));
                System.out.println("The sine of the angle " + angle + "is: " + sine);
                break;
            case 4:
                System.out.print("Enter an angle: ");
                double angle1 = scan.nextInt();
                double cosine = Math.cos(Math.toRadians(angle1));
                System.out.println("The cosine of the angle " + angle1 + "is: " + cosine);
                break;
            case 5:
                System.out.print("Enter an angle: ");
                double angle2 = scan.nextInt();
                double tangent = Math.tan(Math.toRadians(angle2));
                System.out.println("The tangent of the " + angle2 + "is: " + tangent);
                break;
            default:
                System.out.println("Invalid Choice!");
                break;
        }
        scan.close();
    }
}
