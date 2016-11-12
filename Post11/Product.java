class Product{
	private long id;
	private String name;
	private String detail;
	
	public Product(){
		this(0,null,null);
	}
	public Product(long id){
		this(id,null,null);
	}
	public Product(long id,String name){
		this(id,name,null);
	}
	public Product(long id,String name,String detail){
		this.id = id;
		this.name = name;
		this.detail = detail;
	}
	
	public void setId(long id){
		this.id=id;
	}
	public long getId(){
		return id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setDetail(String detail){
		this.detail=detail;
	}
	public String getDetail(){
		return detail;
	}
}