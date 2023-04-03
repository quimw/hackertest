package banking;

/**
 * The concrete Account holder of Person type.
 */
public class Person extends AccountHolder{
    private String firstName;
    private String lastName;
    private int idNumber;

    public Person(String firstName, String lastName, int idNumber) {
        // TODO: complete the constructor
    	super(idNumber);
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.idNumber=idNumber;
    	
    }

    public String getFirstName() {
        // TODO: complete the method
    	
        return firstName;
    }

    public String getLastName() {
        // TODO: complete the method
        return lastName;
    }
}
