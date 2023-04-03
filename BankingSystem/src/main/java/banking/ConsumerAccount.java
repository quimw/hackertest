package banking;

/**
 * Account implementation for consumer (domestic) customers.
 * The account's holder is a {@link Person}.
 */
public class ConsumerAccount {
private Person person;
private Long accountNumber;
private int pin;
private double currentBalance;


    public ConsumerAccount(Person person, Long accountNumber, int pin, double currentBalance) {
        // TODO: complete the constructor
    	this.person=person;
    	this.accountNumber=accountNumber;
    	this.pin=pin;
    	this.currentBalance=currentBalance;
    	
    }
}
