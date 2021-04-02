package dmacc.beans;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Joel Martinez-Gonzalez - jmartinezgonzale
 * CIS175 - Spring 2021
 * Mar 28, 2021
 */

@Data
@Embeddable
@AllArgsConstructor
public class Store {
	private String name;
	private String storeId;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
