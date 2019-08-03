import java.util.Scanner;

public class Age {
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Hello what is your age:");
		int age = in.nextInt();
		System.out.println("Next year your age will be: " + (age+1));
	}
 
}
