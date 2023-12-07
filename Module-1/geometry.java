import java.util.Scanner;

class geometry {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Area of Rectangle");
        System.out.print("Enter the length of the rectangle: ");
        double len = scan.nextDouble();
        System.out.print("Enter the width of the ractangle: ");
        double width = scan.nextDouble();
        double area = GeometryCalculate.calculateArea(len, width);
        System.out.println("The area of the rectangle is: "+area);
        System.out.println("Area of Circle");
        System.out.print("Enter the radius of the circle: ");
        double rad = scan.nextDouble();
        double area1 = GeometryCalculate.calculateArea(rad);
        System.out.println("The area of the circle is: "+area1);
        System.out.println("Area of Triangle");
        System.out.print("Enter the base of the triangle: ");
        double base = scan.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scan.nextDouble();
        double area2 = GeometryCalculate.calculateAreaTriangle(base, height);
        System.out.println("The area of the triangle is: "+area2);

        scan.close();
    }
    class GeometryCalculate{
        static double calculateArea(double length, double width){
            return length*width;
        }
        static double calculateArea(double radius){
            return 3.14*radius*radius;
        }
        static double calculateAreaTriangle(double base, double height){
            return 0.5*base*height;
        }
    }
}
