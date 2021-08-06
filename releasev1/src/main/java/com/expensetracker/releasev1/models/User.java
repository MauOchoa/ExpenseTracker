package com.expensetracker.releasev1.models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private long userId;
	public String username;
	private String password;
	public String name;
	public String lastname;
	
	@OneToMany(mappedBy="user")
	private Set<Account> accounts;
	
	public User() {}
	
	public User(String username, String password, String name, String lastname) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.lastname = lastname;
	}

	public long getId() {
		return userId;
	}

	public void setId(long id) {
		this.userId = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Override
	public String toString(){
		return "User{"
				+ "id=" + userId + '\''
				+ ", name=" + name + '\''
				+ ", lastname=" + lastname + '\''
				+ ", username=" + username + '\''
				+ ", password= ********"  + '\''
				+ "}";
	}
	

}	
