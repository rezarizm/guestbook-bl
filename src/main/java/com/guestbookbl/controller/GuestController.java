package com.guestbookbl.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.guestbookbl.guest.GuestProto.Guest;
import com.guestbookbl.guest.GuestService;

@RestController
@RequestMapping(value = "/guestbook-bl")
public class GuestController {
	private GuestService guestService;
	
	@Autowired
	public void setGuestService(GuestService guestService) {
		this.guestService = guestService;
	}


	@PostMapping (value ="/addguest",consumes = "application/x-protobuf")
	public String addGuest (@RequestBody Guest guestDTO) {
		guestService.addGuest(guestDTO);
		return "Success";
	}
	@GetMapping (value ="/getallguests", produces = "application/protobuf" )
	public java.util.ArrayList<com.guestbookbl.guest.GuestProto.Guest> getAllGuest (){
		return guestService.getAllGuests();
	}
}
