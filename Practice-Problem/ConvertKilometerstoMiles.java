import java.util.Scanner;
public class ConvertKilometerstoMiles{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the value in Kilometers : ");
	float kilometers = scanner.nextFloat();
	double Miles = kilometers * 0.621371;
	System.out.println("The conversion is : "+Miles);
	}
}