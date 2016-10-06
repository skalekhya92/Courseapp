package com.courseapp.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user")

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;

	private String username;

	private String password;

	private int age;

	public enum gender {

		MALE, FEMALE;

	}

	private String firstname;
	private String middlename;

	private String lastname;

	private String phone_number;
	private String company_name;
	private LocalDateTime created_time;

	private List<Course> course_table = new ArrayList<>();

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;

	}

	public List<Course> getCourse_table() {
		return course_table;
	}

	public void setCourse_table(List<Course> course_table) {
		this.course_table = course_table;

	}

	public String getUsername() {
		return username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public LocalDateTime getCreate_time() {
		return created_time;
	}

	public void setCreate_time(LocalDateTime create_time) {
		this.created_time = create_time;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhonenumber(String phone_number) {
		this.phone_number = phone_number;
	}

}
