import java.util.Scanner;
class Post5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 6 Characters : ");
		String str = sc.nextLine();
		char last = str.charAt(str.length()-1);
		char cfive = str.charAt(4);
		char cfour = str.charAt(3);
		char cthree = str.charAt(2);
		char ctwo = str.charAt(1);
		char first = str.charAt(0);
		System.out.print("Reverse : " + last + cfive + cfour + cthree + ctwo + first);
	}
}