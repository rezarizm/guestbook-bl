package com.guestbookbl.guest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GuestRepository extends JpaRepository<Guest, Integer> {
	@Query(nativeQuery=true, value="select * from guest")
	List<Guest> findData();
}


