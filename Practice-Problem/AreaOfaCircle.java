import java.util.Scanner;
public class AreaOfaCircle{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of circle : ");
		int radius = scanner.nextInt();
		float area = (22/7)*(radius*radius);
		System.out.println("Area of circle is : "+ area);
		}
	}	