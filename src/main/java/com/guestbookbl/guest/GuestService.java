package com.guestbookbl.guest;

import com.guestbookbl.guest.GuestProto.Guest;

public interface GuestService {
	void addGuest(Guest guestDTO);
	java.util.ArrayList<com.guestbookbl.guest.GuestProto.Guest> getAllGuests();
}
