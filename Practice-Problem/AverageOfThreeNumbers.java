import java.util.Scanner;
public class AverageOfThreeNumbers{
    public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = scanner.nextInt();
		System.out.println("Enter second number : ");
		int b = scanner.nextInt();
		System.out.println("Enter third number : ");
		int c = scanner.nextInt();
		float average = ((a)+(b)+(c))/3;
		System.out.println("Average of three numbers is : "+average);
		}
	}	