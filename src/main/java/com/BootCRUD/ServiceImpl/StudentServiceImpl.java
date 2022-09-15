package com.BootCRUD.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BootCRUD.DAO.StudentDao;
import com.BootCRUD.Model.Student;
import com.BootCRUD.Service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.save(student);
	}
	@SuppressWarnings("deprecation")
	
	@Override
	public Optional<Student> getId(Integer id) {
		// TODO Auto-generated method stub
		
		Optional<Student> stu=studentDao.findById(id);
		return stu;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		
		Iterable<Student> list=studentDao.findAll();
		return (List<Student>) list;
	}
	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		 studentDao.deleteById(id);
		
	}
	@Override
	public List<Student> getByCity(String city) {
		// TODO Auto-generated method stub
		List<Student> list=studentDao.getByCity(city);
		return list;
	}
	
	
	

}
