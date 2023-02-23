package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
