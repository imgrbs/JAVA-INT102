class Pen{
	private long productId;
	private String model;
	private String brand;
	private double price;
	private static double VAT = 0.07;
		
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
	
	public String toString(){
		return "Product ID : "+productId+
			   "\nModel : "+model+
			   "\nBrand : "+brand+
			   "\nPrice : "+price;
	}
}
