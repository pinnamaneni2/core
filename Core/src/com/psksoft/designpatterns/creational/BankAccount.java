package com.psksoft.designpatterns.creational;

public class BankAccount {

	private String name;
	private String accNumber;
	private String number;
	private String email;
	private boolean optAlerts;
	
	private BankAccount(BankAccountBuilder bankAcc){
		this.name = bankAcc.name;
		this.accNumber = bankAcc.accNumber;
		this.number = bankAcc.number;
		this.email = bankAcc.email;
		this.optAlerts = bankAcc.optAlerts;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAccNumber() {
		return accNumber;
	}



	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public boolean isOptAlerts() {
		return optAlerts;
	}



	public void setOptAlerts(boolean optAlerts) {
		this.optAlerts = optAlerts;
	}



	public static class BankAccountBuilder {
		public String name;
		public String accNumber;
		public String number;
		public String email;
		public boolean optAlerts;
		
		public BankAccountBuilder(String name, String accNumber, String number) {
			this.name = name;
			this.accNumber = accNumber;
			this.number = number;
		}
		
		public BankAccountBuilder addEamil(String email) {
			this.email = email;
			return this;
		}
		
		public BankAccountBuilder optAlerts(boolean optAlerts) {
			this.optAlerts = optAlerts;
			return this;
		}
		
		public BankAccount build() {
			return new BankAccount(this);
		}
	}
}
