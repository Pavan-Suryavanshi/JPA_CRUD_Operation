package com.data.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.Entity.Student;
import com.data.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository resp;
	public String saveemp(Student s)
	{
		resp.save(s);
		return "Record added Successfully";
	}

	public String saveallstud(List<Student> slist)
	{
		resp.saveAll(slist);
		return "All records added successfully";
	}

	public List<Student> findallstud()
	{
		return resp.findAll();
	}

	public Student findstudbyid(int rollno)
	{
		return resp.findById(rollno) .orElse(null);
	}


	public String deletebyid(int rollno)
	{
		resp.deleteById(rollno);
		return "record deleted successfully";

	}


	public String updatestudent(int rollno, Student newstudent)
	{
		Student existingstudent=resp.findById(rollno) .orElse(null);
		if(existingstudent != null)
		{

			
		if(newstudent != null)
		{
			if(newstudent.getName() != null)
			{
				existingstudent.setName(newstudent.getName());
			}
			if(newstudent.getCourse() != null)
			{
				existingstudent.setCourse(newstudent.getCourse());
			}
			resp.save(existingstudent);
			return "record updated successfully";
		}
		//return "updation failed ";
	}
	else
	{
		return "record not found";
	}
	return "failed";

}
	public long count()
	{
		return resp.count();
		
	}
}
