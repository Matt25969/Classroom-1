package com.qa.persistence.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "trainees")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Trainee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer traineeID;

	private String firstName;
	private String lastName;
	private Integer classroomID;

	public Trainee() {

	}

	public Trainee(Integer traineeID, String firstName, String lastName, Integer classroomID) {
		super();
		this.traineeID = traineeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.classroomID = classroomID;
	}

	public Integer getTraineeID() {
		return traineeID;
	}

	public Integer getClassroomID() {
		return classroomID;
	}

	public void setClassroomID(Integer classroomID) {
		this.classroomID = classroomID;
	}

	public void setTraineeID(Integer traineeID) {
		this.traineeID = traineeID;
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

	@Override
	public String toString() {
		return String.format(
				"Trainee[traineeID=" + traineeID + ", firstName=" + firstName + ", lastName=" + lastName + "]",
				traineeID, firstName, lastName);
	}

}
