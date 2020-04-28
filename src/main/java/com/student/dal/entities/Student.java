package com.student.dal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//the class is map to the database table
@Entity
//but the table name is different in database so name="studenttab"
@Table(name="studenttab")
public class Student {
	//id is same name in database table.uppercase doesnot matter
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	//field name is different in database table ie sname
	@Column(name="sname")
	private String name;
	//field course is different in database table ie scourse
	@Column(name="scourse")
	private String course;
	//field fee is different in database table ie sfee
	@Column(name="sfee")
	private Double fee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", fee=" + fee + "]";
	}
}
