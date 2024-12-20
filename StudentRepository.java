package com.data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
	//Bydefault methods 
	//findByID()
	//save()
	//saveall()
	//findall()
	//deleteById()
	//count()

}
