import java.util.Scanner;
public class CalculateSimpleInterest{
    public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Principal amount : ");
		int principal = scanner.nextInt();
		System.out.println("Enter rate : ");
		int rate = scanner.nextInt();
		System.out.println("Enter time : ");
		float time = scanner.nextFloat();
		float Simple_Intrest = (principal * rate * time) / 100;
		System.out.println("The Simple Interest is : "+Simple_Intrest);
		}
	}
	