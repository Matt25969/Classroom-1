package com.qa.persistence.domain;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "classrooms")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Classroom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer classroomID;

	private String trainer;
	@OneToMany
	@JoinColumn(name = "traineeID", nullable = false, insertable = false, updatable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Set<Trainee> trainees;

	public Classroom() {

	}

	public Classroom(Integer classroomID, String trainer, Set<Trainee> trainees) {
		super();
		this.classroomID = classroomID;
		this.trainer = trainer;
		this.trainees = trainees;
	}

	public Set<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(Set<Trainee> trainees) {
		this.trainees = trainees;
	}

	public Integer getClassroomID() {
		return classroomID;
	}

	public void setClassroomID(Integer classroomID) {
		this.classroomID = classroomID;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return String.format(
				"Classroom[classroomID=" + classroomID + ", trainer=" + trainer + ", trainees=" + trainees + "]",
				classroomID, trainer, trainees);
	}
}
