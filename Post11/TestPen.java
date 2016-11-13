class TestPen{
	public static void main(String[] args){
		/*Pen p = new Pen();
		p.setProductId(123);
		p.setModel("KB-9753");
		p.setBrand("Parker");
		p.setPrice(3500);
		System.out.println(p.toString());
		System.out.println("Price with TAX : "+p.calPriceWithTax());
		Pen p2 = new Pen();
		p2.setModel("KB-9753");
		p2.setBrand("Parker");
		System.out.println(p.comparePen(p2));*/
		Pen p1 = new Pen(1,"001","pentel",200);
		Pen p2 = new Pen(2,"075","Wanpen",100);
		Pen p3 = new Pen(3,"089","Duanpen",60);
		System.out.println("Pen : "+Pen.allPen());
	}
}
