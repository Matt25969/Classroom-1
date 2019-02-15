package com.qa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.persistence.domain.Classroom;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Integer> {

}
