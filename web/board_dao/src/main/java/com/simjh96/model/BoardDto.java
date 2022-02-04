package com.simjh96.model;

public class BoardDto {
	private int no;
	private String name;
	private String subject;
	private String email;
	private String password;
	private String contents;
	private String reDate;
	private int hit;
	public BoardDto() {}
	
	public BoardDto(int no, String name, String subject, String email, String password, String contents, String reDate,
			int hit) {
		super();
		this.no = no;
		this.name = name;
		this.subject = subject;
		this.email = email;
		this.password = password;
		this.contents = contents;
		this.reDate = reDate;
		this.hit = hit;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getReDate() {
		return reDate;
	}

	public void setReDate(String reDate) {
		this.reDate = reDate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}
	
}
