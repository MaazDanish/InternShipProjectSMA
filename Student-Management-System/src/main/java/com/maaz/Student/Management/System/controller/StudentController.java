package com.maaz.Student.Management.System.controller;

import com.maaz.Student.Management.System.model.Student;
import com.maaz.Student.Management.System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
	@Autowired
	private StudentService studentService;

//	Add Api
	@PostMapping("/add")
	public String add(@RequestBody Student student) {
		studentService.saveStudent(student);
		return "New student is added";
	}

//	get Api
	@GetMapping("/getAll")
	public List<Student> list() {
		return studentService.getAllStudents();
	}
}