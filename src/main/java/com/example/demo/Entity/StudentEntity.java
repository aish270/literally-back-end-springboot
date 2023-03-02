package com.example.demo.Entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class StudentEntity {
	@Id
	@Column(name="bid")
	private int bid;
	@Column(name="bname")
	private String bname;
	@Column(name="author")
	private String author;
	public StudentEntity(int bid, String bname,String author) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author= author;
	}
	public StudentEntity() {
		
	}
	
	public int getbid() {
		return bid;
	}
	public void setbid(int bid) {
		this.bid = bid;
	}
	public String getbname() {
		return bname;
	}
	public void setbname(String bname) {
		this.bname = bname;
	}
	public void setauthor(String author) {
		this.author = author;
	}
	public String getauthor() {
		return author;
	}
	
	public String toString() {
		return "bid= "+bid+"bname= "+bname+"author= "+author;
	}
}
