package com.BootCRUD.DAO;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BootCRUD.Model.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, Serializable> {
	
	@Query(value="select *from student where city=?", nativeQuery=true)
	public List<Student> getByCity(String city);

}
