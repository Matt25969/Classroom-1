package com.qa.business;

import java.util.List;
import java.util.Optional;

import com.qa.persistence.domain.*;

public interface TraineeService {

	public Trainee addTrainee(String firstName, String lastName, Integer classroomID);

	public Optional<Trainee> getTrainee(Integer id);

	public List<Trainee> getAllTrainees();

	public String removeTrainee(Integer id);
}
