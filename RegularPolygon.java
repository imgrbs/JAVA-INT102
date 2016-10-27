class RegularPolygon{
	private int n;
	private double side;
	private double x;
	private double y;
	
	public RegularPolygon(){
		
	}
	public RegularPolygon(int n, double side){
		this.n=n;
		this.side=side;
	}
	public RegularPolygon(int n , double side , double x , double y){
		this.n=n;
		this.side=side;
		this.x=x;
		this.y=y;
	}
	public void setN(int valuen){
		n = valuen;
	}
	public int getN(){
		return n;
	}
	
	public void setSide(double valueSide){
		side = valueSide;
	}
	public double getSide(){
		return side;
	}
	
	public void setX(double valueX){
		x = valueX;
	}
	public double getX(){
		return x;
	}
	
	public void setY(double valueY){
		y = valueY;
	}
	public double getY(){
		return y;
	}
	public double getParameter(){
		double parameter= n*side;
		return parameter;
	}
	public double getArea(){
		double area= (n*(side*side))/ (4*(Math.tan(Math.PI/n)));
		return area;
	}
}
