package com.ngu.wedding.dto.table;

import java.util.Set;

import com.ngu.wedding.domains.actors.Person;
import com.ngu.wedding.dto.actors.PersonDTO;

public class TableDTO
{
	private int tableID;

	private Set<PersonDTO> people;

	public int getTableID()
	{
		return tableID;
	}

	public void setTableID(int tableID)
	{
		this.tableID = tableID;
	}

	public Set<PersonDTO> getPeople()
	{
		return people;
	}

	public void setPeople(Set<PersonDTO> people)
	{
		this.people = people;
	}
}
