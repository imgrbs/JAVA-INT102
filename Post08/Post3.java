import java.util.Scanner;
class Post3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num : ");
		double input = sc.nextDouble();
		int forMod=2;
		String keep ="";
		while(input%forMod==0){
			input/=forMod;
			keep+=forMod+" x ";
			if(input%forMod!=0)
				forMod++;
		}
		System.out.print("Result : 1 x "+ keep + (int)input);
	}
}	