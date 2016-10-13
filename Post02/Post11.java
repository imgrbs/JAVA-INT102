import java.util.Scanner;
class Post11{
	public static void main(String[] args){
		System.out.println("---------------- \n Post9 V.2.0 \n----------------");
		final int HR=60;
		double y;
		Scanner hm = new Scanner(System.in);
		System.out.print("Enter Your hours : ");
		y = hm.nextDouble();
		double min = y*HR;
		System.out.println("Your time's "+ min + " mintues");
		
		final double MI=0.621371192;
		double k;
		Scanner mk = new Scanner(System.in);
		System.out.print("Enter Your Kilometer : ");
		k = mk.nextDouble();
		double kilo = k*MI;
		System.out.println("Your distance's "+ kilo + " miles");
		} 
}