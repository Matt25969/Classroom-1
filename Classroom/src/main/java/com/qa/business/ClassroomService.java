package com.qa.business;

import java.util.List;
import java.util.Optional;

import com.qa.persistence.domain.*;

public interface ClassroomService {

	public Classroom addClassroom(String trainer);

	public Optional<Classroom> getClassroom(Integer id);

	public List<Classroom> getAllClassrooms();

	public String removeClassroom(Integer id); 
	
	public String updateClassroom(Integer id);

}
