import java.util.Scanner;
class Post2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Word : ");
		
		String word = sc.nextLine();
		char ch = word.charAt(0);
		
		if ((ch=='A')||(ch=='a'))
			System.out.print("an "+ word );
		else if ((ch=='E')||(ch=='e'))
			System.out.print("an "+ word );
		else if ((ch=='I')||(ch=='i'))
			System.out.print("an "+ word );
		else if ((ch=='O')||(ch=='o'))
			System.out.print("an "+ word );
		else if ((ch=='U')||(ch=='u'))
			System.out.print("an "+ word );
		else 
			System.out.print("a "+ word );		
	}
}