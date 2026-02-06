import java.util.ArrayList;
import java.util.List;

public class Bank {
	//1.variable
	private ArrayList<BankAccount> accounts;
	//2.constructor
	public Bank(){
		accounts = new ArrayList<BankAccount>();
	}
	//3.methods
	//add an account to this bank
	public void addAccount(BankAccount a){
		accounts.add(a);
	}
	//gets the sum of the balances of all accounts in this bank
	public double getTotalBalance(){
		
		//**************** YOUR CODE HERE****************
        double sum = 0;
        for (BankAccount e: accounts){
            sum = sum + e.getBalance();
        }
		return sum;
		//*********************************************
	}
	//counts the number of bank account whose balance is at least given value.
	public int countBalanceAtLeast(double atLeast){
		
		//**************** YOUR CODE HERE****************
		int count = 0;
        for (BankAccount e: accounts){
            if (e.getBalance() >= atLeast)
                count++;
        }
		return count;
		//*********************************************
	}
	
	//finds a bank account with a given number
	public BankAccount find(int accountNumber){
		
		//**************** YOUR CODE HERE****************
        for (BankAccount e: accounts){
            if (e.getAccountNumber() == accountNumber)
                return e;
        }
		return null;
		//*********************************************
	}
	
	//gets the bank account with the largest balance.
	public BankAccount getMax(){
		
		//**************** YOUR CODE HERE****************
        if (accounts.isEmpty()){
            return null;
        }
        BankAccount max = accounts.get(0);
		for (BankAccount e: accounts){
            if (e.getBalance() >= max.getBalance()){
                max = e;
            }
        }
        return max;
		//*********************************************
	}
	
	//gets the bank account with the minimum balance.
	public BankAccount getMin(){
		
		//**************** YOUR CODE HERE****************
		if (accounts.isEmpty()){
		return null;
        }
        BankAccount min = accounts.get(0);
        for (BankAccount e: accounts){
            if (e.getBalance() <= min.getBalance()){
                min = e;
            }
        }
        return min;
		//*********************************************
	}
	
	
	
	
	
}