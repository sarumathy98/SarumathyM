package org.hcl.entities;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class BloodGroup {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int blood_id;
	private String blood_type;
	@ManyToMany(mappedBy="bloodGroups")
	private Set<User> user;
	public BloodGroup()
	{
		
	}
	public int getBlood_id() {
		return blood_id;
	}
	public void setBlood_id(int blood_id) {
		this.blood_id = blood_id;
	}
	public String getBlood_type() {
		return blood_type;
	}
	public void setBlood_type(String blood_type) {
		this.blood_type = blood_type;
	}
	

}
