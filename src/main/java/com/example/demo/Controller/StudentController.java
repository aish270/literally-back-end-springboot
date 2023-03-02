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
		@DeleteMapping("/deleteDetails/{bid}")
		public String deleteInfo(@PathVariable("bid") int bid) {
			st.deleteDetails(bid);
			return "deleted";
		}
		@GetMapping("/page/{field}")
		public List<StudentEntity> getSort(@PathVariable String field){
			return st.getSorted(field);
		}
		@GetMapping("/page/{offset}/{pagesize}")
		public List<StudentEntity> getpage(@PathVariable int offset,@PathVariable int pagesize){
			return st.getWithPagination(offset, pagesize);
		}
		
		@GetMapping("/p/{bid}/{author}")
		public List<StudentEntity> getboo(@PathVariable("bid") int id ,@PathVariable("author") String auth){
			return st.getbook(id,auth);
			
		}
		@DeleteMapping("/d/{bid}")
		public String del(@PathVariable("bid") int bid) {
			 st.delbyid(bid);
			 return "deleted";
		}
		@PutMapping("/u/{bname}/{bid}")
		public String upbid(@PathVariable("bname") String bname,@PathVariable("bid") int bid) {
			st.upid(bname, bid);
			return "updated";
		}

}

