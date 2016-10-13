import java.util.Scanner;
class Post4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String cateProduct="";
		String typeProduct="";
		String numOfCate="";
		System.out.println("Enter Name of Product : ");
		String product = sc.nextLine();
		char ch = product.charAt(0);
		if(ch>='a'&&ch<='p'||ch>='A'&&ch<='P')
			cateProduct = "AP";
		else
			cateProduct = "QZ";
		
		System.out.println("Enter Type (Toy,Accessory,Bag) : ");
		String type = sc.nextLine();
		if(type.equalsIgnoreCase("toy"))
			typeProduct = "TOY";
		else if(type.equalsIgnoreCase("accessory"))
			typeProduct = "ACC";
		else if(type.equalsIgnoreCase("bag"))
			typeProduct = "BAG";
		else
			typeProduct = " Invalid Type ";
		
		String toNum = cateProduct+typeProduct;
		if(toNum.equals("APTOY"))
			numOfCate = "11";
		else if (toNum.equals("APACC"))
			numOfCate = "12";
		else if (toNum.equals("APBAG"))
			numOfCate = "13";
		else if (toNum.equals("QZTOY"))
			numOfCate = "18";
		else if (toNum.equals("QZACC"))
			numOfCate = "19";
		else if (toNum.equals("QZBAG"))
			numOfCate = "20";
		else
			numOfCate = "00";
		
		System.out.println("Catagory = " +cateProduct+typeProduct+numOfCate);
		
		
	}
}