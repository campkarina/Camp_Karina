public class UserNamesRunner
{
	public static void main (String[]args)
	{
		UserNames object = new UserNames("proHndsm", "Professor", "Handsome");
		System.out.println("<<<<<<<<<<< USER INFO >>>>>>>>>>>>");
		System.out.println("Name: " + object.getfirstName() + " " + object.getlastName());
		System.out.println("User Name: " + object.getUserName());
		
		UserNames object1 = new UserNames();
		System.out.println("<<<<<<<<<<< USER INFO >>>>>>>>>>>>");
		System.out.println("Name: " + object1.getfirstName() + " " + object1.getlastName());
		System.out.println("User Name: " + object1.getUserName());
		
		object.setUserName("pHandsome");
		System.out.println("<<<<<<<<<<< USER INFO >>>>>>>>>>>>");
		System.out.println("Name: " + object.getfirstName() + " " + object.getlastName());
		System.out.println("User Name: " + object.getUserName());
	}
}