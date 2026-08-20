import java.util.Scanner;
public class PowerCalculation{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter base : ");
	int base = scanner.nextInt();
	System.out.println("Enter power : ");
	int power = scanner.nextInt();
	double Result = Math.pow(base,power);
	System.out.println("Power Calculation is : "+ Result);
	}
}	