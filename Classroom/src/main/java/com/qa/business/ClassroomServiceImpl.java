package com.qa.business;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Service;

import com.qa.persistence.domain.Classroom;
import com.qa.persistence.repository.ClassroomRepository;

@Service
public class ClassroomServiceImpl implements ClassroomService {
	@Autowired
	private ClassroomRepository classRepo;

	@Override
	public Classroom addClassroom(String trainer) {
		Classroom classroom = new Classroom();
		classroom.setTrainer(trainer);

		return classRepo.save(classroom);
	}

	@Override
	public Optional<Classroom> getClassroom(Integer id) {

		return classRepo.findById(id);

	}

	@Override
	public List<Classroom> getAllClassrooms() {

		return classRepo.findAll();
	}

	@Override
	public String removeClassroom(Integer id) {
		classRepo.deleteById(id);
		return "Classroom " + id + " deleted.";
	}

}
