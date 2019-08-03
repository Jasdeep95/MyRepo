import java.util.Scanner;

public class NameAndAge {
	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);
		System.out.print("Please provide your First name:");
		String name = Input.nextLine();
		System.out.print("Please provide your age: ");
		int age = Input.nextInt();
		System.out.println("Hello " + name);
		System.out.println("Next year you will be: " + (age+1));
	}

}
