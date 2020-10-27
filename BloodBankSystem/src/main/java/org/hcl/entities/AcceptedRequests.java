package org.hcl.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="AcceptedRequests")
public class AcceptedRequests {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ARId")
	private long ARId;
		
	@Column(name="dateaccepted")
	private Date dateaccepted;
	
	public Date getDateaccepted() {
		return dateaccepted;
	}

	public void setDateaccepted(Date dateaccepted) {
		this.dateaccepted = dateaccepted;
	}
	
	
	@Column(name="Status")
	private String Status;
	
	@Column(name="Verification")
	private String Verification;
	
	public String getVerification() {
		return Verification;
	}

	public void setVerification(String verification) {
		Verification = verification;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="personID")
	private BloodDonor bloodDonor;

	


	public BloodDonor getBloodDonor() {
		return this.bloodDonor;
	}

	public void setBloodDonor(BloodDonor bloodDonor) {
		this.bloodDonor = bloodDonor;
	}

	public AcceptedRequests(){
		
	}


	public long getARId() {
		return ARId;
	}

	public void setARId(long aRId) {
		ARId = aRId;
	}




}

