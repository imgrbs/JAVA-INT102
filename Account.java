class Account{
	private String id;
	private String name;
	private int balance;
	
	public void Account(String id, String name){
	}
	public void Account(String id, String name, int balance){
	}
	
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setBalance(int balance){
		this.balance=balance;
	}
	public int getBalance(){
		return balance;
	}
	
	public int debit(int amount){
		return amount;
	}
	
	public int transferTo(String account, int amount){
		int debit = amount;
		return debit;
	}
	
	public String toString(){
		return "\nID = "+id+
			   "\nName = "+name+
			   "\nBalance = "+balance;
	}
	
	public static void main(String[] args){
		Account a = new Account();
		a.setId("59130500007");
		a.setName("Keerati");
		a.setBalance(3521);
		System.out.print("---Information---"+a.toString()+"\nTransfer:Debit = "+a.transferTo("59130500007",a.debit(a.getBalance())));
	}
}
