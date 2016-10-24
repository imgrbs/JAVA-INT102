import java.util.Scanner;
class toEight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num - ");
		int num = sc.nextInt();
		String keep = "";
		for(int i=8;num!=0;){
			keep=num%i+keep;
			num=num/i;
		}
		System.out.println(keep);
	}
}