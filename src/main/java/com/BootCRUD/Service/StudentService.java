package com.BootCRUD.Service;

import java.util.List;
import java.util.Optional;

import com.BootCRUD.Model.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	public Optional<Student> getId(Integer id);
	public  List<Student> getAllStudent();
	public void deleteById(Integer id);
	
	public List<Student> getByCity(String city);

	
}
