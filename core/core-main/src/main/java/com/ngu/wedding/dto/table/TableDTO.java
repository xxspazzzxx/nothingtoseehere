package com.ngu.wedding.dto.table;

import java.util.Set;

import com.ngu.wedding.dto.actors.PersonDTO;

public class TableDTO
{

	private Set<PersonDTO> people;

	public Set<PersonDTO> getPeople()
	{
		return people;
	}

	public void setPeople(Set<PersonDTO> people)
	{
		this.people = people;
	}
}
