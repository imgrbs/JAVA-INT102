import java.util.*;
class Post7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your word : ");
		String input = sc.nextLine();
		int i=input.length()-1;
		while(input.equals("0")==false){
			System.out.print("Reverse : ");
			while(i!=-1){
				System.out.print(input.charAt(i));
				i--;
			}
			System.out.print("\nEnter your word : ");
			input = sc.nextLine();
			i=input.length()-1;
		}
		System.out.println("End Program");
	}
}