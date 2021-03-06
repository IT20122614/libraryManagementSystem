package com.customer;

public class Book {
	
	private String code;
	private String title;
	private String author;
	private byte[] photo;
	private String description;
	
	
	public Book() {
		super();
	}
	
	public Book(String code, String title, String author, byte[] photo, String description) {
		super();
		this.code = code;
		this.title = title;
		this.author = author;
		this.photo = photo;
		this.description = description;
	}

	private String base64Image;
    
    public String getBase64Image() {
        return base64Image;
    }
 
    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
    }
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
