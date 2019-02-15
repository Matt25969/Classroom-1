package com.qa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.persistence.domain.Trainee;

@Repository
public interface TraineeRepository extends JpaRepository<Trainee, Integer> {

}
