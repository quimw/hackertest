package banking;

/**
 * Abstract Account Holder.
 */
public abstract class AccountHolder {
    private int idNumber;
    
    /**
     * @param idNumber The holder unique ID.
     */
    public AccountHolder(int idNumber) {
        // TODO: complete the constructor
    	this.idNumber=idNumber;
    }

    public int getIdNumber() {
        // TODO: complete the method
    	
        return idNumber;
    }
}
