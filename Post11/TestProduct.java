class TestProduct{
	public static void main(String[] args){
		Product p1 = new Product(123);
		System.out.println(p1.toString());
		
		Product p2 = new Product(123,"Toy");
		System.out.println(p2.toString());
		
		Product p3 = new Product(123,"Toy","Green");
		System.out.println(p3.toString());
	}
}
