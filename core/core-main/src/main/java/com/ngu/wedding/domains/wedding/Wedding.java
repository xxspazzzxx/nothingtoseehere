package com.ngu.wedding.domains.wedding;

import com.ngu.wedding.domains.actors.Guest;
import com.ngu.wedding.domains.actors.Host;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

public class Wedding
{
    @Id
    private String weddingID;

    private String weddingTitle;
    private String weddingLocation;
    private boolean active;
    @DBRef private List<Host> hosts;
    @DBRef private List<Guest> guests;

    public String getWeddingID()
    {
        return weddingID;
    }

    public void setWeddingID(String weddingID)
    {
        this.weddingID = weddingID;
    }

    public String getWeddingTitle()
    {
        return weddingTitle;
    }

    public void setWeddingTitle(String weddingTitle)
    {
        this.weddingTitle = weddingTitle;
    }

    public String getWeddingLocation()
    {
        return weddingLocation;
    }

    public void setWeddingLocation(String weddingLocation)
    {
        this.weddingLocation = weddingLocation;
    }

    public List<Host> getHosts()
    {
        return hosts;
    }

    public void setHosts(List<Host> hosts) {
        this.hosts = hosts;
    }

    public List<Guest> getGuests()
    {
        return guests;
    }

    public void setGuests(List<Guest> guests)
    {
        this.guests = guests;
    }

    public boolean isActive()
    {
        return active;
    }
}
