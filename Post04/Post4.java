import java.util.Scanner;
import java.text.DecimalFormat;
class Post4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Real Scores : ");
		float realscore = sc.nextInt();	
		System.out.print("Total Scores : ");
		float total = sc.nextInt();	
		System.out.print("Your Total Scores : ");
		float yourtotal = sc.nextInt();		
		DecimalFormat forscore = new DecimalFormat("0.##");
		float result = (yourtotal/(total/realscore));
		System.out.print("Your Real Scores : " + forscore.format(result) + "/" + realscore );
	}
}