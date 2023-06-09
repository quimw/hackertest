package banking;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
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
     	Long currAcc=0L;
        if(!(account==null)) {
    	account=new Account(company,currAcc , pin, startingDeposit);
    	
    	accounts.put(currAcc, account);
        }
        return currAcc;
    }

    public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
        // TODO: complete the method
    	Long currAcc=0L;
    if(!(account==null)) {
    	currAcc=account.getAccountNumber();
    	account=new Account(person, currAcc, pin, startingDeposit);
    	
    }
    	
    	
        return currAcc;
    }

    public double getBalance(Long accountNumber) {
        // TODO: complete the method
    	double balance=0.0;
    	if(account!=null) {
    		account=accounts.get(accountNumber);	
    		balance=account.getBalance();
    		
    	}
        return balance;
    }

    public void credit(Long accountNumber, double amount) {
        // TODO: complete the method
    	if(account!=null) {
    		account=accounts.get(accountNumber);
        
    	account.creditAccount(amount);
    	}
    	
    }

    public boolean debit(Long accountNumber, double amount) {
        // TODO: complete the method
    	boolean isdebit=false;
    	if(account!=null) {
    		account=accounts.get(accountNumber);
        	
    		account.debitAccount(amount);
    		isdebit=true;
    	}
    	
        return isdebit;
    }

    public boolean authenticateUser(Long accountNumber, int pin) {
        // TODO: complete the method
    	boolean authuser=false;
    	if(account!=null) {
    		account=accounts.get(accountNumber);
        	
    		account.validatePin(pin);
    		authuser=true;
    	}
        return authuser;
    }
    
    public void addAuthorizedUser(Long accountNumber, Person authorizedPerson) {
        // TODO: complete the method
    	if(account!=null) {
    		account=accounts.get(accountNumber);	
    	
    		if(account.getAccountHolder().getIdNumber()==authorizedPerson.getIdNumber()) {
        		
        		accounts.put(account.getAccountNumber(), account);
        	}
        	
    	}
    	
    	
    	
    }

    public boolean checkAuthorizedUser(Long accountNumber, Person authorizedPerson) {
        // TODO: complete the method
    	if(account!=null) {
    		account=accounts.get(accountNumber);	
    	
        if(account.getAccountHolder().getIdNumber()==authorizedPerson.getIdNumber()) {
        	return true;
        }
        
    	}
        return false;
    }

    public Map<String, Double> getAverageBalanceReport() {
        // TODO: complete the method
    	//Stream.of(accounts).filter(a->a.);
   double averageperson=accounts.values().stream().filter(a->a.getAccountHolder() instanceof Person).collect(Collectors.averagingDouble(n->n.getBalance()));
   
   double averagecompany=accounts.values().stream().filter(a->a.getAccountHolder() instanceof Company).collect(Collectors.averagingDouble(n->n.getBalance()));
    	
   Map<String,Double> globalavarege=new HashMap<>();
   globalavarege.put("ConsumerAccount", averageperson);
   globalavarege.put("CommercialAccount", averagecompany);
    	
        return globalavarege;
    }

	
}
