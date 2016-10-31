import java.util.Scanner;
import java.text.DecimalFormat;
class BankRegister{
	private String username;
	private long password;
	private int genotp =(int)(Math.random()*10000);
	
	public void setUsername(String user){
		username = user;
	}
	public String getUsername(){
		return username;
	}
	
	public void setPassword(long pass){
		password = pass;
	}
	public long getPassword(){
		return password;
	}
	public int getGenOtp(){
		return genotp;
	}
	
	//Test BankRegister
	public static void main(String[] args) {
		BankRegister bn = new BankRegister();
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0000");
		System.out.print("Enter Your Name : ");
		String getName = sc.next();
		sc.nextLine();
		System.out.print("Enter Your Password : ");
		long getPass = sc.nextLong();
		bn.setUsername(getName);
		bn.setPassword(getPass);
		
		System.out.println("Your Name is " + bn.getUsername());
		System.out.println("Your Password is " + bn.getPassword());
		System.out.println("OTP Code : "+ df.format(bn.getGenOtp()));
		
	}
}
