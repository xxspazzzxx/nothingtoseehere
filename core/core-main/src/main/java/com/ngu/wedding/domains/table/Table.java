package com.ngu.wedding.domains.table;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.ngu.wedding.domains.actors.Person;


public class Table
{

	@Id private int id;

	@DBRef private Set<Person> people;

	public Table()
	{

	}

	public Table(int id, Set<Person> people)
	{
		setId(id);
		setPeople(people);
	}


	public Set<Person> getPeople()
	{
		return people;
	}

	public void setPeople(Set<Person> people)
	{
		this.people = people;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
}
