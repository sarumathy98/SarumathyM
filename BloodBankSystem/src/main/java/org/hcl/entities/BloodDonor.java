package org.hcl.entities;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



@Entity
@Table
@PrimaryKeyJoinColumn(name="userID")
public class BloodDonor extends User {


	@OneToMany(mappedBy="bloodDonor")
    private Set<AcceptedRequests> ar = new HashSet<AcceptedRequests>();
	
	public Set<AcceptedRequests> getAr() {
		return ar;
	}

	public void setAr(Set<AcceptedRequests> ar) {
		this.ar = ar;
	}

	@Column(name="bloodgroup")
	private String bloodgroup;

	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
		

	
	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public BloodDonor(){
		
	}
	
}
