import java.util.*;
import java.text.DecimalFormat;
class Post5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.##");
		
		System.out.print("Enter Expression : ");
		String input = sc.nextLine();
		int plus = input.indexOf("+");
		int minus = input.indexOf("-");
		int multi = input.indexOf("*");
		int div = input.indexOf("/");
		int mod = input.indexOf("%");
		double cal=0;
		if(plus>0&&plus<input.length()-1)
			cal = Integer.parseInt(input.substring(0,plus))+Integer.parseInt(input.substring(plus+1,input.length()));
		else if(minus>0&&plus<input.length()-1)
			cal = Integer.parseInt(input.substring(0,minus))-Integer.parseInt(input.substring(minus+1,input.length()));
		else if(multi>0&&plus<input.length()-1)
			cal = Integer.parseInt(input.substring(0,multi))*Integer.parseInt(input.substring(multi+1,input.length()));
		else if(div>0&&plus<input.length()-1)
			cal = Integer.parseInt(input.substring(0,div))/Integer.parseInt(input.substring(div+1,input.length()));
		else if(mod>0&&plus<input.length()-1)
			cal = Integer.parseInt(input.substring(0,mod))%Integer.parseInt(input.substring(mod+1,input.length()));
		else
			System.out.println("Please Enter Number and (+,-,*,/,%) \n EX. 1+1 , 100*100" );
			
		System.out.println("Answer : " + df.format(cal));
		
	}
}
