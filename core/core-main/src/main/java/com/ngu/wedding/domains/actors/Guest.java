package com.ngu.wedding.domains.actors;

import org.springframework.data.annotation.Id;

public class Guest extends Person
{
	public Guest()
	{

	}
	public Guest(String firstName, String lastName)
	{
		setFirstName(firstName);
		setLastName(lastName);
	}

	@Id private String personID;

	private String weddingID;

	private int guestCount;

	public int getGuestCount() {
		return guestCount;
	}

	public void setGuestCount(int guestCount) {
		this.guestCount = guestCount;
	}


}