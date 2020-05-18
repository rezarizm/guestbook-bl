package com.guestbookbl.guest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GuestDTO {

	private String name;
	
	private String institution;
	
	private String email;

	private String message;

	
	
	
	public GuestDTO(String name, String institution, String email, String message) {
		this.name = name;
		this.institution = institution;
		this.email = email;
		this.message = message;

	}

}
