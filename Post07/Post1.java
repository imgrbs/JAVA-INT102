import java.util.Scanner;
class Post1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count=0;
		String keepRan="";
		while(count<10){
			int ran = (int)(Math.random()*10);
			keepRan+=ran ;
			count++;
		}
		System.out.println("num = " + keepRan);
		while(true){
			System.out.print("Enter Lotto : ");
			String getDigit = sc.nextLine();
			if(getDigit.equals("0")){
				System.out.println("End Program");
				break;
			}
			else if(getDigit.length()==10){
				if(getDigit.equals(keepRan))
					System.out.println("Reward : all digits!");
				else if((getDigit.substring(7)).equals(keepRan.substring(7)))
					System.out.println("Reward : the last 3 digits");
					else if((getDigit.substring(8)).equals(keepRan.substring(8)))
						System.out.println("Reward : the last 2 digits");
						else
							System.out.println("No Reward!");
			}
			else
				System.out.println("Please Enter 10 Digits");
		}	
	}
}