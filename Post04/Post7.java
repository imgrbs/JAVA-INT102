import java.util.Scanner;
import java.util.Random;
class Post7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random gen = new Random();
		
		int ran = gen.nextInt(1001);
		System.out.print("Register Username : ");
		String username = sc.nextLine();
		System.out.print("Register Password : ");
		String password = sc.nextLine();
		
		String temp = username.toUpperCase();
		
		char first = temp.charAt(0);
		char last1 = username.charAt(username.length()-2);
		char last2 = username.charAt(username.length()-1);
		System.out.println("Secure Code = " + first + last1 + last2 + ran);
		
		System.out.println("-----------------------------");
		System.out.print("Login Username : ");
		String login = sc.nextLine();
		System.out.print("Login Password : ");
		String upass = sc.nextLine();
		System.out.print("Enter Secure Code : ");
		String secure = sc.nextLine();
		System.out.print("Confirm Secure Code : ");
		String secure2 = sc.nextLine();
		
		boolean checku = username.equalsIgnoreCase(login);
		boolean checkp = password.equalsIgnoreCase(upass);
		boolean keepsecure = secure.equals(secure2);	
		
		if ( (checku == true )&&(checkp == true) )
			System.out.println("Login Pass!");
		else if (checkp == false)
			System.out.println("Failed! Error : invalid username or password");
		else if (checku == false)
			System.out.println("Failed! Error : invalid username or password");
		
		if ( keepsecure == true )
			System.out.println("You're not Robot :)");
		else if ( keepsecure == false )
			System.out.println("You shall not pass!!!");
	}
}