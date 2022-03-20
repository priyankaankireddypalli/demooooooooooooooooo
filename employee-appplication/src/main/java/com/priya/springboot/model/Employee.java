package com.priya.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	@Pattern(regexp = "[a-zA-Z ]{2,}" , message = "Invalid person full name")
	@Column(name = "first_name")
	private String firstName;
	@Pattern(regexp = "[a-zA-Z ]{2,}" , message = "Invalid person full name")
	@Column(name = "last_name")
	private String lastName;
	@NotBlank(message = "Note cant be blank or empty")
	@Column(name = "email")
	private String email;
	@Min(value = 500,message = "Min salary should start with 500")
	@Column(name="salary")
	private double salary;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
