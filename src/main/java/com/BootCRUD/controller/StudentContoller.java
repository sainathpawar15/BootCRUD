package com.BootCRUD.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BootCRUD.Model.Student;
import com.BootCRUD.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentContoller {
	
    @Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student)
	{
		Student stu=studentService.saveStudent(student);
		return ResponseEntity.ok().body(stu);
	}
	@GetMapping("/getId/{id}")
	public ResponseEntity<Optional<Student>> getId(@PathVariable Integer id)
	{
	Optional<Student> stu1=	studentService.getId(id);
	return ResponseEntity.ok().body(stu1);
		
	}
	@GetMapping("/getAllStudent")
	public List<Student> getAllStudent()
	{
		List<Student> list=studentService.getAllStudent();
		return list;
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity deleteById(@PathVariable("id")int id)
	{
		studentService.deleteById(id);
		
		return ResponseEntity.ok().body(id);
	}
	@GetMapping("/getByCity/{city}")
	public ResponseEntity<List<Student>> getByCity(@PathVariable("city") String city)
	{
		List<Student> list=studentService.getByCity(city);
		return ResponseEntity.ok().body(list);
	}

}
