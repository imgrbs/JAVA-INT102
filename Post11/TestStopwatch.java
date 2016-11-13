class TestStopwatch{
	public static void main(String[] args){
		Stopwatch sw = new Stopwatch();
		sw.start();
		for(int i=0; i<1000; i++){
			System.out.println("Count : "+i);
		}
		sw.stop();
		System.out.println("ElapsedTime : "+sw.getElapsedTime()+" milliseconds");
	}
}