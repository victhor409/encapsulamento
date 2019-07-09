	package entites;
	
	public class Account {
	
		private int number;
		private String holder;
		private double balance;
		
		public Account() {
			
		}
		
		public Account(int number, String holder,double balance) {
			
			this.number = number;
			this.holder = holder;
			this.balance = balance;
		}
		
		public Account(int number, String holder) {
			
			this.number = number;
			this.holder = holder;
		}
		
		
		public int getNumber() {
			return number;
		}
	
		public void setNumber(int number) {
			this.number = number;
		}
	
		public String getHolder() {
			return holder;
		}
	
		public void setHolder(String holder) {
			this.holder = holder;
		}
	
		public double getBalance() {
			return balance;
		}
	
		public void deposit(double amount) {
			 balance += amount ;
		}
		
		public void withdrow(double amount) {
			balance -= amount  + 5.0 ;
		}
		
		public String toString() {
			return "Account "
					+number
					+" , Holder: "
					+holder
					+", Balance: $ "
					+String.format("%.2f", balance);
		}
	}
	
