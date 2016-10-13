import java.util.Scanner;
class Post2{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print(" Enter Name of Subject1 : ");
		String Sub1 = sc.next();
        System.out.print("Enter Credits of Subject1 : ");
        int Cre1 = sc.nextInt();
                
        System.out.print(" Enter Name of Subject2 : ");
		String Sub2 = sc.next();
        System.out.print("Enter Credits of Subject2 : ");
        int Cre2 = sc.nextInt();
                
        System.out.print(" Enter Name of Subject3 : ");
		String Sub3 = sc.next();
        System.out.print("Enter Credits of Subject3 : ");
        int Cre3 = sc.nextInt();
                
        System.out.println(Sub1 + " : " + Cre1 + " Credits ");
        System.out.println(Sub2 + " : " + Cre2 + " Credits ");
        System.out.println(Sub3 + " : " + Cre3 + " Credits ");
		System.out.println(" -------Result------- "); 
		System.out.println("Price = " + ((Cre1+Cre2+Cre3)*1000));     
		}
}