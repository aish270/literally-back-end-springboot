package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Entity.StudentEntity;
import com.example.demo.Repository.StudentRepository;
@Service
public class StudentService {
	@Autowired(required=true)
	StudentRepository srep;
	public StudentEntity saveDetails(StudentEntity e)
	{
		return srep.save(e);
	}
	public List<StudentEntity> getDetails()
	{
		return srep.findAll();
	}
	
	public StudentEntity updateDetails(StudentEntity e1)
	{
		return srep.saveAndFlush(e1);
	}
	public void deleteDetails(int n)
	{
		srep.deleteById(n);
	}
	public List<StudentEntity> getSorted(String field){
		return srep.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	public List<StudentEntity> getWithPagination(@PathVariable int offset,@PathVariable int pagesize){
		Page<StudentEntity> page=srep.findAll(PageRequest.of(offset,pagesize));
		return page.getContent();
	}
	public List<StudentEntity> getbook(int s,String a){
		return srep.getAllbook(s,a);
	}
	public Integer delbyid(int i) {
		return srep.deleteByBid(i);
	}
	public Integer upid(String s,int i) {
		return srep.updatebid(s,i);
	}

}
