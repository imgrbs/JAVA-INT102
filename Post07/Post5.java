import java.util.Scanner;
class Post5{
	public static void main(String[] args){
		int count=1;
		int keepFloor=1;
		int currentFloor=1;
		int haveFloor=50;
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("Enter Floor : ");
			int getFloor = sc.nextInt();
			if(getFloor<1){
				System.out.println("Wrong Floor");
			}
			else if(getFloor<=haveFloor){
				if(getFloor>currentFloor){
					while(getFloor>currentFloor){
						System.out.print(currentFloor+".. ");
						currentFloor++;
					}
					System.out.print(currentFloor);
					System.out.println("\nNow " + currentFloor + " Floor");
				}
				else{
					while(getFloor<currentFloor){
						System.out.print(currentFloor+".. ");
						currentFloor--;
					}
					System.out.print(currentFloor);
					System.out.println("\nNow " + currentFloor + " Floor");
				}
			}
			else
				System.out.println("Please Enter 1-"+haveFloor);
		}
	}
}