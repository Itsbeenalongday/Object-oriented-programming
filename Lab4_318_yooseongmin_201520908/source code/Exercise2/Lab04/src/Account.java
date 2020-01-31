public class Account {

	private String name;
	private double balance;
	private int accountNo; // a. initialize 
	private int no = 1000;
    public Account(String name, double balance) {
		this.name=name;
		
		if(balance>0.0) {
			this.balance=balance;
		}	
		accountNo=getNo();
    }	
    
    private int getNo() {
    	return ++no;
    }
    
    public int getAccountNo() {
    	return accountNo;
    }
    
	public void deposit(double depositAmount) {
		if(depositAmount>0.0) {
			balance=balance+depositAmount;
		}
	}
	
	public double getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	Boolean transfer(Account name, double amt) {
		
		if(name.balance>=amt) {
			balance+=amt;
			name.balance-=amt;
			return true;
		}
		else {
			System.out.println("You don't have enough money");
			return false;
		}
	}
	
}
