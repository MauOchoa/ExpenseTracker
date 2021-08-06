package com.expensetracker.releasev1.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	public long number;
	public long balance;
	public String name;
	
	@ManyToOne
	@JoinColumn(name="userId", nullable=false)
	private User user;
	
	public Account() {}
	
	public Account(long balance, String name, long userId, long number) {
		this.balance = balance;
		this.name = name;
		this.number = number;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}
	
	@Override
	public String toString(){
		return "Account{"
				+ "id=" + user.getId() + '\''
				+ ", name=" + name + '\''
				+ ", number=" + number + '\''
				+ ", balance=" + balance + '\''
				+ "}";
	}
	
	

}
