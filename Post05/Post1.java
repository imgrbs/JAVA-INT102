import java.util.Scanner;
class Post1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		
		if((age>=4)&&(age<=6))
			System.out.print("Kindergarten");
		else if ((age>=7)&&(age<=12))
			System.out.print("Elementary education");
		else if ((age>=13)&&(age<=18))
			System.out.print("High school");
		else if ((age>=19)&&(age<=22))
			System.out.print("University");
		else if (age>22)
			System.out.print("Unknown");		
	}
}