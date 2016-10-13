import java.util.Scanner;
class Post3{
    public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print(" Enter Price of Product1 : ");
        int Pri1 = sc.nextInt();
        System.out.print(" Enter Price of Product2 : ");
        int Pri2 = sc.nextInt();
        System.out.print(" Enter Price of Product3 : ");
        int Pri3 = sc.nextInt();       
        
		int temp = Math.min(Pri2, Pri1);				
        int temp2 = Math.min(Pri3, temp);                
        
		System.out.println("The Cheapest's : " + temp2);
		}
}
