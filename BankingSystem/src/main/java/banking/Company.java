package banking;

import java.net.URISyntaxException;

public class Company  extends AccountHolder{
	private String companyName;
	private int taxId;
	

	public Company(String companyName, int taxId) {
		// complete the function
		super(taxId);
		this.companyName=companyName;
		this.taxId=taxId;
		
	}

	public String getCompanyName() {
		// complete the function
        return companyName;
	}
}
