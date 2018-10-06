package com.ngu.wedding.domains.actors;

import com.ngu.wedding.domains.wedding.Wedding;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Host extends Person
{
    public Host()
    {

    }

    public Host(String firstName, String lastName)
    {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Host (Host host)
    {
        setLastName(host.getLastName());
        setFirstName(host.getFirstName());
    }

    @Id
    private String personID;


}
