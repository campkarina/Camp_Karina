import java.util.Scanner;
public class password
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		String username = "computer";
		String password = "karina";
		passCheck();
	}
	public static void passCheck()
	{
		System.out.println("Enter username: ");
		String choice1 = kb.next();
		System.out.println("Enter password: ");
		String choice2 = kb.next();
		
		if(choice1.equals("computer")&&choice2.equals("karina"))
		{
			System.out.println("You are granted access!");
		}
		else 
		{
			if (choice1.equals("computer"))
			{
				System.out.println("Your password is incorrect!");
			}
			else if (choice2.equals("karina"))
			{
				System.out.println("Your username is incorrect!");
			}
			else
			{
				System.out.println("Your username and password are incorrect!");
				passCheck();
			}
		}
		
	}
}