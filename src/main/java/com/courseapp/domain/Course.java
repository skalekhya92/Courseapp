package com.courseapp.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course_table")

public class Course implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int course_id;
	private String coursename;
	private String course_description;
	private String prerequisites;
	@Enumerated(EnumType.STRING)

	private String author;


	
	public Course(){
	}
	
	public Course(int course_id, String coursename, String course_description, String prerequisites) {
		super();
		this.course_id = course_id;
		this.coursename = coursename;
		this.course_description = course_description;
		this.prerequisites = prerequisites;
	}


	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCourse_description() {
		return course_description;
	}

	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}

	public String getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course_description == null) ? 0 : course_description.hashCode());
		result = prime * result + course_id;
		result = prime * result + ((coursename == null) ? 0 : coursename.hashCode());
		result = prime * result + ((prerequisites == null) ? 0 : prerequisites.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (course_description == null) {
			if (other.course_description != null)
				return false;
		} else if (!course_description.equals(other.course_description))
			return false;
		if (course_id != other.course_id)
			return false;
		if (coursename == null) {
			if (other.coursename != null)
				return false;
		} else if (!coursename.equals(other.coursename))
			return false;
		if (prerequisites == null) {
			if (other.prerequisites != null)
				return false;
		} else if (!prerequisites.equals(other.prerequisites))
			return false;
		return true;
	}

}
