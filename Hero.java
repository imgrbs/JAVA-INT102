class Hero{
	private int hp;
	private int atk;
	private int def;
	
	public Hero(){
		this(0,0,0);
	}
	public Hero(int hp,int atk, int def){
		this.hp=hp;
		this.atk=atk;
		this.def=def;
	}
	public int getHp(){
		return hp;
	}
	public void setHp(int hp){
		this.hp=hp;
	}
	public int getAtk(){
		return atk;
	}
	public void setAtk(int atk){
		this.atk=atk;
	}
	public int getDef(){
		return def;
	}
	public void setDef(int def){
		this.def=def;
	}
	public int hurt(Hero mon){
		return (this.hp+this.def)-mon.getAtk();
	}
	public int attack(Hero mon){
		return (mon.getHp()+mon.getDef())-this.atk();
	}
	public int heal(int regen){
		this.hp+=regen;
		return this.hp;
	}
	public void dead(){
		this.atk=0;
		this.def=0;
		this.hp=0;
	}
	public static Hero dead(Hero h){
		h = null;
		return h;
	}
	public static void main(String[] args){
	}
}
