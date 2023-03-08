package com.example.demo.Entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book1")
public class StudentEntity {
	@Id
	@Column(name="bid")
	private int bid;
	@Column(name="bname")
	private String bname;
	@Column(name="author")
	
	private String author;
	@Column(name="image")
	private String image;
	@Column(name="description")
	private String description;
	@Column(name="cost")
	private int cost;
	@Column(name="readonline")
	private String readonline;
	public StudentEntity() {
		
	}
	
	public StudentEntity(int bid, String bname, String author, String image, String description, int cost,
			String readonline) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.image = image;
		this.description = description;
		this.cost = cost;
		this.readonline = readonline;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getReadonline() {
		return readonline;
	}

	public void setReadonline(String readonline) {
		this.readonline = readonline;
	}

	public String toString() {
		return "bid= "+bid+"bname= "+bname+"author= "+author+"image= "+image+"description= "+description+"cost= "+cost+"readonline= "+readonline;
	}
}
