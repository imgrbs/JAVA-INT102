import java.util.Scanner;
class TestStudent{
	public static void main(String[] args){
		Student std = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Student ID : ");
		long getId = sc.nextLong();
		std.setStudentId(getId);
		System.out.print("Enter Your Name : ");
		String getName = sc.next();
		std.setStudentName(getName);
		sc.nextLine();
		System.out.print("Enter Your GPA : ");
		double getGpa = sc.nextDouble();
		std.setStudentGpa(getGpa);
		sc.nextLine();
		long stdId = std.getStudentId();
		String stdName = std.getStudentName();
		double stdGpa = std.getStudentGpa();	
		System.out.println("Your Student is " + stdId);
		System.out.println("Your Name is " + stdName);
		System.out.println("Your GPA is " + stdGpa);
	}
}