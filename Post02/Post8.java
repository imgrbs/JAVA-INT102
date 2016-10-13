class Post8{
	public static void main(String[] args){
		int m = 2;
		int n = 5;
		int o = 10;
		int result = n+m++;
		System.out.println("result = "+result);
		int result1= ++m+n;
		System.out.println("result1 = "+result1);
		double result2 = 0;
		result2+= 0+5*10/4-5%4;
		System.out.println("result2 = "+result2);
		m+= n*o+m ; 
		System.out.println("m = "+m);
		} 
}