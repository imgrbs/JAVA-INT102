class TestPen{
	public static void main(String[] args){
		Pen p = new Pen();
		//p.setProductId(123);
		p.setModel("KB-9753");
		p.setBrand("Parker");
		/*p.setPrice(3500);
		System.out.println(p.toString());
		System.out.println("Price with TAX : "+p.calPriceWithTax());*/
		Pen p2 = new Pen();
		p2.setModel("KB-9753");
		p2.setBrand("Parker");
		System.out.println(p.comparePen(p2));
	}
}
