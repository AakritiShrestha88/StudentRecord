package com.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.student.dal.entities.Student;
import com.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	@Test
	public void testCreateStudent() {
		
		Student student= new Student();
		student.setName("Priya");
		student.setCourse("Javascript");
		student.setFee(70d);
		
		
		studentRepository.save(student);
	}
	//note
	//where ever i am doing update delete and findby it is creating 1 row in database.
	@Test
	public void testFindStudentById() {
		Student student=studentRepository.findById(1l).get();
//		Optional<Student>studentOptional=studentRepository.findById(1l);
//		if(studentOptional.isPresent()) {
//			Student student =studentOptional.get();
//			System.out.println(student);
//		}
		System.out.println(student);
	}
	
	
	@Test
	public void testUpdateStudent() {
//		Optional<Student>studentOptional=studentRepository.findById(1l);
//		if(studentOptional.isPresent()) {
//			Student student =studentOptional.get();
//			student.setFee(70d);
//			student.setName("hana");
//			
//			
//			studentRepository.save(student);
//		}
		Student student=studentRepository.findById(2l).get();
		student.setFee(70d);
		student.setName("hana");
		studentRepository.save(student);
	}
	
	@Test
	public void testDeleteStudent() {
		Student student= new Student();
		student.setId(3l);
		studentRepository.delete(student);
	}

}
