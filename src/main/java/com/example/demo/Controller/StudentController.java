package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.StudentEntity;
import com.example.demo.Service.StudentService;

@RestController
	public class StudentController {
		
		@Autowired(required=true)
		StudentService st;
		@PostMapping("/addDetails")
		public StudentEntity addinfo(@RequestBody StudentEntity s) {
			return st.saveDetails(s);
		}
		@GetMapping("/showDetails")
		public List<StudentEntity> fetchDetails(){
			return st.getDetails();
		}
		@PutMapping("/updateDetails")
		public StudentEntity updateinfo(@RequestBody StudentEntity s1) {
			return st.updateDetails(s1);
		}
		@DeleteMapping("/deleteDetails/{sid}")
		public String deleteInfo(@PathVariable("sid") int sid) {
			st.deleteDetails(sid);
			return "deleted";
		}

}

