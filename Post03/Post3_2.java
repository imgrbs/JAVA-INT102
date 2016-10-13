import java.util.Scanner;
class Post3_2{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print(" Enter Price of Product1 : ");
        int Pri1 = sc.nextInt();
        System.out.print(" Enter Price of Product2 : ");
        int Pri2 = sc.nextInt();
        System.out.print(" Enter Price of Product3 : ");
        int Pri3 = sc.nextInt();       
				
        int min = Pri1;
        if (Pri2 < min){
			min=Pri2;}
        if (Pri3 < min){
			min=Pri3;}
        System.out.println("The Cheapest's = " + min);
		}
}