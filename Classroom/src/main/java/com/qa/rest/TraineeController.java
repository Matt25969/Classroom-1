package com.qa.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.business.TraineeServiceImpl;

import com.qa.persistence.domain.Trainee;

@RestController
public class TraineeController {
	@Autowired
	public TraineeServiceImpl svc;

	@RequestMapping("/addTrainee/{firstName}/{lastName}/{classroomID}")

	public Trainee addTrainee(@PathVariable String firstName, @PathVariable String lastName, @PathVariable Integer classroomID) {
		Trainee result = svc.addTrainee(firstName, lastName, classroomID);

		return result;
	}

	@RequestMapping("/getTrainee/{traineeID}")
	public Optional<Trainee> getTrainee(@PathVariable Integer traineeID) {

		return svc.getTrainee(traineeID);
	}

	@RequestMapping("/getAllTrainees")
	public List<Trainee> getAllTrainees() {
		List<Trainee> allClasses = svc.getAllTrainees();

		return allClasses;
	}

	@RequestMapping("/removeTrainee/{traineeID}")
	public String removeTrainee(@PathVariable Integer traineeID) {
		return svc.removeTrainee(traineeID);
	}
}
