class Fan{
	final int SLOW=1;
	final int MEDIUM=2;
	final int FAST=3;
	
	private int speed=SLOW;
	private boolean on=false;
	private double radius=5;
	private String color="blue";
	public Fan(){
		
	}
	public void setSpeed(int spd){
		speed = spd;
	}
	public int getSpeed(){
		return speed;
	}
	public void setOn(boolean open){
		on=open;
	}
	public boolean getOn(){
		return on;
	}
	public void setRadius(double rad){
		radius=rad;
	}
	public double getRadius(){
		return radius;
	}
	public void setColor(String col){
		color=col;
	}
	public String getColor(){
		return color;
	}
	public String toString(){
		return 	"Speed = " + speed + 
		"\nFan = " + on + 
		"\nRadius = " + radius + 
		"\nFan Color = " + color;
	}
}
