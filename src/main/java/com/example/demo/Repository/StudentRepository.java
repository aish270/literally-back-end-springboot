package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.StudentEntity;

import jakarta.transaction.Transactional;
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Integer>{
	@Query(value="select * from book1 where bid=:s or author=:st",nativeQuery=true)
	public List<StudentEntity> getAllbook(@Param("s") int s,@Param("st") String st);
	@Query(value="select*from book1 where bname=:sa",nativeQuery=true)
	public List<StudentEntity> getbookr(@Param("sa") String sa);

	@Modifying
	@Transactional
	@Query(value="delete from book1 where bid=:i",nativeQuery=true)
	public Integer deleteByBid(@Param ("i") int i);
	
	@Modifying
	@Transactional
	@Query(value="delete from book1 where bname=:i",nativeQuery=true)
	public Integer deleteByBname(@Param ("i") String i);
	
	

	@Modifying
	@Transactional 
	@Query(value="UPDATE book b set b.bname=:name where b.bid=:id",nativeQuery=true)
	public Integer updatebid(@Param("name") String s,@Param("id") int i);
	
	
}
