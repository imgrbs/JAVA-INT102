import java.util.Scanner;
class Post11_2{
	public static void main(String[] args){
		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 100-999 : ");
		num = input.nextInt();
		int x = num%10;
		int y = (num/10)%10;
		int z = num/100;
		
		System.out.print("Result = " + x);
		System.out.print(y);
		System.out.print(z);
		} 
}