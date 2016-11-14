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
		return (mon.getHp()+mon.getDef())-this.atk;
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
		Hero h = new Hero(100,350,90);
		System.out.println("Hp Hero : "+h.getHp());
		System.out.println("Atk Hero : "+h.getAtk());
		System.out.println("Def Hero : "+h.getDef());
		System.out.println("------------------------");
		Hero mon = new Hero(50,200,150);
		System.out.println("Hp Monster : "+mon.getHp());
		System.out.println("Atk Monster : "+mon.getAtk());
		System.out.println("Def Monster : "+mon.getDef());
		System.out.println("------------------------");
		System.out.println("Hero Attack Monster : "+h.attack(mon));
		mon.dead();
		System.out.println("Hero Hurt : "+mon.hurt(h));
		h.dead();
		System.out.println("------------------------");
		System.out.println("Hero Hp : "+h.getHp());
		System.out.println("Hero Dead!");
		System.out.println("Hp Monster : "+mon.getHp()+"\nMonster Dead!");
		System.out.println("------------------------");
		System.out.println("Hp Hero Regen : "+h.heal(300)+"\nHp Hero : "+h.getHp());
		System.out.println("Hp Monster Regen : "+mon.heal(50)+"\nHp Monster : "+mon.getHp());
		
	}
}
