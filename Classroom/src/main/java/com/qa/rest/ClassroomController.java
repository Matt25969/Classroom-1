package com.qa.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.business.ClassroomServiceImpl;
import com.qa.persistence.domain.Classroom;

@RestController
public class ClassroomController {

	@Autowired
	public ClassroomServiceImpl svc;

	@RequestMapping("/addClassroom/{trainer}")

	public Classroom addClassroom(@PathVariable String trainer) {
		Classroom result = svc.addClassroom(trainer);

		return result;
	}

	@RequestMapping("/getClassroom/{classroomID}")
	public Optional<Classroom> getClassroom(@PathVariable Integer classroomID) {

		return svc.getClassroom(classroomID);
	}

	@RequestMapping("/getAllClassrooms")
	public List<Classroom> getAllClassrooms() {
		List<Classroom> allClasses = svc.getAllClassrooms();

		return allClasses;
	}

	@RequestMapping("/removeClassroom/{classroomID}")
	public String removeClassroom(@PathVariable Integer classroomID) {
		return svc.removeClassroom(classroomID);
	}

}
