import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    //Problem 1
    Scanner sc = new Scanner(System.in); //Initializes sc as a scanner object
    System.out.println("Enter the radius of the circle: ");
    double desiredRadius = sc.nextDouble(); //Method to scan for doubles
    Circle circl1 = new Circle(desiredRadius);
    System.out.println(circl1.toString() + " has a circumference of " + circl1.getCircumference() + " and an area of " + circl1.getArea());

    //Problem 2
    System.out.println("Enter number of sides: ");
    int sideNumbers = sc.nextInt();
    System.out.println("Enter the side length: ");
    double sideLengths = sc.nextDouble();
    RegularPolygon rp1 = new RegularPolygon(sideNumbers, sideLengths);
    System.println("Area with " + rp1.getNumSides() + " sides: " + rp1.getArea());
    System.out.println("Incrementing the number of sides by two ");
    rp1.addSides(2);
    System.out.println("Area with " + rp1.getNumSides() + " sides: " + rp1.getArea());
  }
  
}
