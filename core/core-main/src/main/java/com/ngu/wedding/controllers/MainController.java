package com.ngu.wedding.controllers;

import com.ngu.wedding.converters.interfaces.GuestDTOConverter;
import com.ngu.wedding.converters.interfaces.HostDTOConverter;
import com.ngu.wedding.repo.GuestRepository;
import com.ngu.wedding.repo.HostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api")
public class MainController
{
    private static final Logger LOG = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private GuestRepository guestRepository;
    @Autowired
    private HostRepository hostRepository;
    @Autowired
    private HostDTOConverter hostDTOConverter;
    @Autowired
    private GuestDTOConverter guestDTOConverter;

    @RequestMapping(path = "/hello")
    public @ResponseBody String sayHello()
    {
        LOG.info("GET called on /hello resource");
        return "Can you see me Jenbo";
    }


    public GuestRepository getGuestRepository()
    {
        return guestRepository;
    }

    public void setGuestRepository(GuestRepository guestRepository)
    {
        this.guestRepository = guestRepository;
    }

    public HostRepository getHostRepository()
    {
        return hostRepository;
    }

    public void setHostRepository(HostRepository hostRepository)
    {
        this.hostRepository = hostRepository;
    }

    public HostDTOConverter getHostDTOConverter()
    {
        return hostDTOConverter;
    }

    public void setHostDTOConverter(HostDTOConverter hostDTOConverter)
    {
        this.hostDTOConverter = hostDTOConverter;
    }

    public GuestDTOConverter getGuestDTOConverter()
    {
        return guestDTOConverter;
    }

    public void setGuestDTOConverter(GuestDTOConverter guestDTOConverter)
    {
        this.guestDTOConverter = guestDTOConverter;
    }
}
