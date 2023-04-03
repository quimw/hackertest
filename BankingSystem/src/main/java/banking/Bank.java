package banking;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Bank implementation.
 */
public class Bank implements BankInterface {
    private LinkedHashMap<Long, Account> accounts;
    private Account account;

    public Bank() {
        // TODO: complete the constructor
    	
    }

    private Account getAccount(Long accountNumber) {
        // TODO: complete the method
    	
  this.account=accounts.get(accountNumber);
    	
        return account;
    }

    public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
        // TODO: complete the method
    	Long currAcc=account.getAccountNumber();
    	
    	account=new Account(company,currAcc , pin, startingDeposit);
    	
    	accounts.put(currAcc, account);
    	
        return currAcc;
    }

    public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
        // TODO: complete the method
    	Long currAcc=account.getAccountNumber();
    	account=new Account(person, currAcc, pin, startingDeposit);
    	
    	
        return currAcc;
    }

    public double getBalance(Long accountNumber) {
        // TODO: complete the method
    	
    	account=accounts.get(accountNumber);
        return account.getBalance();
    }

    public void credit(Long accountNumber, double amount) {
        // TODO: complete the method
    	account=accounts.get(accountNumber);
    	
    	account.creditAccount(amount);
    	
    }

    public boolean debit(Long accountNumber, double amount) {
        // TODO: complete the method
    	
    	account=accounts.get(accountNumber);
    	
        return account.debitAccount(amount);
    }

    public boolean authenticateUser(Long accountNumber, int pin) {
        // TODO: complete the method
    account=accounts.get(accountNumber);
    	
        return account.validatePin(pin);
    }
    
    public void addAuthorizedUser(Long accountNumber, Person authorizedPerson) {
        // TODO: complete the method
    	account=accounts.get(accountNumber);
    	if(account.getAccountHolder().getIdNumber()==authorizedPerson.getIdNumber()) {
    		
    		accounts.put(account.getAccountNumber(), account);
    	}
    	
    	
    }

    public boolean checkAuthorizedUser(Long accountNumber, Person authorizedPerson) {
        // TODO: complete the method
    	
    	account=accounts.get(accountNumber);
        if(account.getAccountHolder().getIdNumber()==authorizedPerson.getIdNumber()) {
        	return true;
        }
        return false;
    }

    public Map<String, Double> getAverageBalanceReport() {
        // TODO: complete the method
    	//Stream.of(accounts).
    	
   
    	
    	
        return new HashMap<>();
    }

	
}
