class Pen{
	private long productId;
	private String model;
	private String brand;
	private double price;
	private static double VAT = 0.07;
	private static int count;
	private static String print;
	
	public Pen(){
		this(0);
	}
	public Pen(long productId){
		this(productId,null);
	}
	public Pen(long productId,String model){
		this(productId,model,null);
	}
	public Pen(long productId,String model,String brand){
		this(productId,model,brand,0);
	}
	public Pen(long productId,String model,String brand,double price){
		this.productId=productId;
		this.model=model;
		this.brand=brand;
		this.price=price;
		count++;
		print = print+"Pen id "+id+" model "+model+" "+brand+" "+price+"\n";
	}
	
	public static int numberOfPen(){
		return count;
	}
	
	public void setProductId(long pid){
		productId=pid;
	}
	public long getProductId(){
		return productId;
	}
	
	public void setModel(String penModel){
		model=penModel;
	}
	public String getModel(){
		return model;
	}
	
	public void setBrand(String penBrand){
		brand=penBrand;
	}
	public String getBrand(){
		return brand;
	}
	
	public void setPrice(double penPrice){
		price=penPrice;
	}
	public double getPrice(){
		return price;
	}
	
	public double calPriceWithTax(){
		double calPrice = price+(price*VAT);
		return calPrice;
	}
	
	public String comparePen(Pen a){
		if(brand.equalsIgnoreCase(a.brand)){
			if(model.equalsIgnoreCase(a.model))
				return "same Brand same Model";
			else
				return "same Brand difference Model";
		}
		else
			return "difference Brand";
	}
	
	public static String allPen(){
		return print;
	}
	
	public String toString(){
		return "Product ID : "+productId+
			   "\nModel : "+model+
			   "\nBrand : "+brand+
			   "\nPrice : "+price;
	}

}
