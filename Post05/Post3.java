import java.util.Scanner;
class Post3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Code : ");	
		String code = sc.nextLine();
		StringBuffer re = new StringBuffer(code).reverse();
		String ch1, ch2, ch3, ch4, ch5, ch6 ,check;
		ch1= re.substring(0, 1);
		ch2= re.substring(1, 2);
		ch3= re.substring(2, 3);
		ch4= re.substring(3, 4);	
		ch5= re.substring(4, 5);
		ch6= re.substring(5, 6);	
		if (ch1.equals(ch1.toUpperCase()))
			ch1= ch1.toLowerCase();
		else ch1= ch1.toUpperCase();
		if(ch2.equals(ch2.toUpperCase()))
			ch2= ch2.toLowerCase();
		else ch2= ch2.toUpperCase();
		if(ch3.equals(ch3.toUpperCase()))
			ch3= ch3.toLowerCase();
		else ch3= ch3.toUpperCase();
		if(ch4.equals(ch4.toUpperCase()))
			ch4= ch4.toLowerCase();
		else ch4= ch4.toUpperCase();
		if(ch5.equals(ch5.toUpperCase()))
			ch5= ch5.toLowerCase();
		else ch5= ch5.toUpperCase();
		if(ch6.equals(ch6.toUpperCase()))
			ch6= ch6.toLowerCase();
		else ch6= ch6.toUpperCase();
		System.out.print("Reverse = " + ch1+ch2+ch3+ch4+ch5+ch6);
	}
}