import java.util.Scanner;
public class VolumeOfaCylinder{
    public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of cylinder : ");
		int radius = scanner.nextInt();
		System.out.println("Enter the height of cylinder : ");
		int height = scanner.nextInt();
		double volume = (3.14)*(radius*radius)*(height);
		System.out.println("Volume of cylinder is : " +volume);
		}
	}		