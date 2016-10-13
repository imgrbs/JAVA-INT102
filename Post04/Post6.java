import java.util.Scanner;
import java.util.Random;
class Post6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random gen = new Random();
		int ran = gen.nextInt(101)-101;				
		System.out.print("Username : ");
		String username = sc.nextLine();	
		String temp = username.toUpperCase();
		char first = temp.charAt(0);
		char seclast = username.charAt(username.length()-1);
		char last = username.charAt(username.length()-2);
		System.out.print("Password = " + first + seclast + last + ran);	
	}
}