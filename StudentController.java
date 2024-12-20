package com.data.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.data.Entity.Student;
import com.data.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/save")
	public String saveemp(@RequestBody Student s)
	{
		return service.saveemp(s);
	}
	
	@PostMapping("/saveall")
	public String saveallstud(@RequestBody List<Student> slist)
	{
		return service.saveallstud(slist);
	}
	
	@GetMapping("/findall")
	public List<Student> findall()
	{
		return service.findallstud();
		
	}
	
	@GetMapping("/findbyid")
	public Student findbyid(@RequestParam int rollno)
	{
		return service.findstudbyid(rollno);
	}
	
	@DeleteMapping("/delete")
	public String deletebyid(@RequestParam int rollno)
	{
		return service.deletebyid(rollno);
	}
	
	@PutMapping("/updated")
	public String updatestudent(@RequestParam int rollno, @RequestBody Student newstudent)
	{
		return service.updatestudent(rollno, newstudent);
	}
	
	
	@GetMapping("/countrecords")
	
	public long count()
	{
		return service.count();
	}
	

}
