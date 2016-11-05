class TestComputer{
	public static void main(String[] args){
		Computer com = new Computer();
		com.setHdd(com.MAXHDD);
		System.out.println("Calculate : 10 + 10 = "+com.calPlus(10,10));
		System.out.println("Format : "+com.formatHdd());
		System.out.println("HDD : "+com.deHdd(10,10));
		
	}
}