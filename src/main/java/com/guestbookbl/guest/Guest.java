package com.guestbookbl.guest;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity 
@Data
@Table (name = "event")
public class Guest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private Long id;
	
	@Column (name = "name")
	private String name;
	
	@Column (name = "institution")
	private String institution;
	
	@Column (name = "email")
	private String email;
	
	@Column (name = "message")
	private String message;
	
	@Column (name = "creation_time")
	private Date creationTime;
	

}
