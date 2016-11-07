class MyComplex{
	private double real;
	private double image;
	
	public MyComplex(){
		this(0.0,0.0);
	}
	public MyComplex(double real, double image){
		this.real=real;
		this.image=image;
	}
	public double getReal(){
		return real;
	}
	public void setReal(double real){
		this.real=real;
	}
	public double getImage(){
		return image;
	}
	public void setImage(double image){
		this.image=image;
	}
	public void setValue(double real, double image){
		this.real=real;
		this.image=image;
	}
	public String toString(){
		return "("+real+"+"+image+"i"+")";
	}
	public boolean isReal(double real){
		return this.real==0;
	}
	public boolean isImaginary(double image){
		return this.image!=0;
	}
	public boolean equals(double real,double image){
		return this.real==real&&this.image==image;
	}
	public boolean equals(MyComplex mc){
		return this.real==mc.getReal()&&this.image==mc.getImage();
	}
	public MyComplex add(MyComplex mc){
		this.real+=real;
		this.image+=image;
		return this;
	}
	public MyComplex substract(MyComplex mc){
		this.real-=real;
		this.image-=image;
		return this;
	}
	public MyComplex multiply(MyComplex mc){
		this.real=this.real*mc.getReal()+(this.image*mc.getImage()*-1);
		return this;
	}
	public MyComplex comjugate(MyComplex mc){
		this.image*=-1;
		return this;
	}
	public static void main(String[] args){
		MyComplex a = new MyComplex(1,1);
		MyComplex b = new MyComplex(6,5);
		System.out.println(a.equals(b));
		System.out.println(a.equals(1,1));
		System.out.println(b.equals(6,5));
		System.out.println(a.toString());
		System.out.println(b.toString());
	}
	
}
