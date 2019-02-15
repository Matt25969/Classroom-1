package com.qa.business;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Service;

import com.qa.persistence.domain.Trainee;
import com.qa.persistence.repository.TraineeRepository;

@Service
public class TraineeServiceImpl implements TraineeService {
	@Autowired
	private TraineeRepository trainRepo;

	public Trainee addTrainee(String firstName, String lastName, Integer classroomID) {
		Trainee trainee = new Trainee();

		trainee.setFirstName(firstName);
		trainee.setLastName(lastName);
		trainee.setClassroomID(classroomID);
		return trainRepo.save(trainee);
	}

	public Optional<Trainee> getTrainee(Integer id) {
		return trainRepo.findById(id);
	}

	public List<Trainee> getAllTrainees() {
		return trainRepo.findAll();
	}

	public String removeTrainee(Integer id) {
		trainRepo.deleteById(id);
		return "Trainee " + id + " deleted.";
	}

}
