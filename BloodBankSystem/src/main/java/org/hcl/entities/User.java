package org.hcl.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity

public class User
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
        private int userId;
		private String name;
		private int age;
		private String gender;
		private int phonenumber;
		private int password;
	    private String bloodGroup;
	    @ManyToMany(cascade=CascadeType.ALL)
	    @JoinTable(name="user_blood",joinColumns={@JoinColumn(name="user_id")},inverseJoinColumns= {@JoinColumn(name="blood_id")})
	    private Set<BloodGroup>bloodGroups;
		public User()
		{
			
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(int phonenumber) {
			this.phonenumber = phonenumber;
		}
		public String getBloodGroup() {
			return bloodGroup;
		}
		public void setBloodGroup(String bloodGroup) {
			this.bloodGroup = bloodGroup;
		}
		
		public int getPassword() {
			return password;
		}
		public void setPassword(int password) {
			this.password = password;
		}
		public Set<BloodGroup> getBloodGroups() {
			return bloodGroups;
		}
		public void setBloodGroups(Set<BloodGroup> bloodGroups) {
			this.bloodGroups = bloodGroups;
		}
}
		
	
		