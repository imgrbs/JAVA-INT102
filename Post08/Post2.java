import java.util.Scanner;
class Post2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Sentences : ");
		String input = " "+sc.nextLine();
		int count, round=0;
		int posStr=input.length();
		int lastStr = input.lastIndexOf(" ",posStr);
		String keepLength="",keepStr="";
		for(count=0; count<input.length();){
			keepLength=input.substring(lastStr,posStr);
			lastStr=input.lastIndexOf(" ",posStr-=keepLength.length()+1);
			posStr+=1;
			keepStr+=keepLength;
			count+=keepLength.length();
			round++;
		}
		System.out.println(+round+" words");
		System.out.println("Reverse : " + keepStr.substring(1,keepStr.length()));
	}
}