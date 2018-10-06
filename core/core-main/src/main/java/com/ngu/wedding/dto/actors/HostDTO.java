package com.ngu.wedding.dto.actors;

import com.ngu.wedding.domains.actors.Person;

public class HostDTO extends Person
{
    public HostDTO(String firstName, String lastName)
    {
        setFirstName(firstName);
        setLastName(lastName);
    }

    private String hostID;

    public String getHostID()
    {
        return hostID;
    }

    public void setHostID(String hostID)
    {
        this.hostID = hostID;
    }
}
