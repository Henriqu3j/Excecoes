package entities;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double WithDrawLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		WithDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithDrawLimit() {
		return WithDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		WithDrawLimit = withDrawLimit;
	}
	
	//instanciado o Account e agora vamos implementar a função de depositar e sacar um valor.

	public void deposit(double amount) {
		balance += amount; //recebe o valor que já tinha, agora acrescentado do amount
	}
	
	public void withdraw(double amount) {
		balance -= amount; //recebe o valor que já tinha, agora subtraindo com o valor do amount
	
	}
}
	
