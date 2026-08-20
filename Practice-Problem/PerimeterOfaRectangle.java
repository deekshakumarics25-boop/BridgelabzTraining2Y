import java.util.Scanner;
public class PerimeterOfaRectangle{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter length of rectangle : ");
	int length = scanner.nextInt();
	System.out.println("Enter breadth of rectangle : ");
	int breadth = scanner.nextInt();
	int perimeter = 2*((length) + (breadth));
	System.out.println("Perimeter of Rectangle is : "+perimeter);
	}
}