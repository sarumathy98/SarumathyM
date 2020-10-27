package org.hcl.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;




@Entity
@Table(name="BloodRequester")
@PrimaryKeyJoinColumn(name="personID")
public class BloodRequester extends User{
	
	@Column(name="requesterBloodGroup")
	private String requesterBloodGroup;

	
	@Column(name="requesterAddress")
	private String requesterAddress;
	
	
	@Column(name="requesterCity")
	private String requesterCity;
	
	
	
	public String getRequesterBloodGroup() {
		return requesterBloodGroup;
	}

	public void setRequesterBloodGroup(String requesterBloodGroup) {
		this.requesterBloodGroup = requesterBloodGroup;
	}

	public String getRequesterAddress() {
		return requesterAddress;
	}

	public void setRequesterAddress(String requesterAddress) {
		this.requesterAddress = requesterAddress;
	}

	public String getRequesterCity() {
		return requesterCity;
	}

	public void setRequesterCity(String requesterCity) {
		this.requesterCity = requesterCity;
	}
	

	

}
