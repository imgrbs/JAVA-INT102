class Stopwatch{
	private long startTime;
	private long endTime;
	
	public Stopwatch(){
		this.startTime=System.currentTimeMillis();
	}
	
	public void setStartTime(long startTime){
		this.startTime=startTime;
	}
	public long getStartTime(){
		return startTime;
	}
	public void setEndTime(long endTime){
		this.endTime=endTime;
	}
	public long getEndTime(){
		return endTime;
	}
	
	public void start(){
		this.startTime=System.currentTimeMillis();
	}
	public void stop(){
		this.endTime=System.currentTimeMillis();
	}
	public long getElapsedTime(){
		return endTime-startTime;
		
	}
}
