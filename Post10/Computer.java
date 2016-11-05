class Computer{
	public final double MAXHDD=1000.0;
	public final double DECEASEHDD=10.0;
	private double hdd;
	private boolean format;
	private double sum;
	
	public void setHdd(double MAXHDD){
		hdd = MAXHDD;
	}
	public double getHdd(){
		return hdd;
	}
	
	public void setFormat(boolean format){
		this.format = format;
	}
	public boolean getformat(){
		return format;
	}
	
	public double calPlus(double num1, double num2){
		sum = num1+num2;
		return sum;
	}
	public double deHdd(double num1, double num2){
		sum = num1+num2;
		if(sum>0)
			hdd-=DECEASEHDD;
		else
			hdd-=0.0;
		return hdd;
	}
	
	public boolean formatHdd(){
		if(hdd==0)
			format=true;
		if(format)
			hdd=MAXHDD;
		return format;
	}
}