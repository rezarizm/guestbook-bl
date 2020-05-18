package com.guestbookbl.guest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GuestServiceImpl implements GuestService{
	private GuestRepository guestRepo;
	
	@Autowired
	public void setGuestRepo(GuestRepository guestRepo) {
		this.guestRepo = guestRepo;
	}


	@Override
	public java.util.ArrayList<com.guestbookbl.guest.GuestProto.Guest> getAllGuests() {	
		List<Guest> guests = guestRepo.findData();
		java.util.ArrayList<com.guestbookbl.guest.GuestProto.Guest> guestsDTO = new ArrayList<com.guestbookbl.guest.GuestProto.Guest>();
		for (int i=0;i<guests.size();i++) {
			com.guestbookbl.guest.GuestProto.Guest guest= 
					com.guestbookbl.guest.GuestProto.Guest.newBuilder().setName(guests.get(i).getName())
					.setInstitution(guests.get(i).getInstitution()).setEmail(guests.get(i).getEmail()).setMessage(guests.get(i).getMessage()).build();
			guestsDTO.add(guest);
		}
		return guestsDTO;
	}



	@Override
	public void addGuest(com.guestbookbl.guest.GuestProto.Guest guestDTO) {
		Guest guest = new Guest();
		guest.setName(guestDTO.getName());
		guest.setEmail(guestDTO.getEmail());
		guest.setInstitution(guestDTO.getInstitution());
		guest.setCreationTime(new Date());
		guestRepo.save(guest);
		
	}


}
