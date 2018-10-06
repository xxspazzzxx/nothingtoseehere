package com.ngu.wedding.controllers;

import com.ngu.wedding.converters.interfaces.GuestDTOConverter;
import com.ngu.wedding.converters.interfaces.HostDTOConverter;
import com.ngu.wedding.repo.GuestRepository;
import com.ngu.wedding.repo.HostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
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
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping(path = "/health")
    public @ResponseBody String sayHello()
    {
        return "Healthy";
    }

    @PostMapping("/attend/{name}")
    public void example(@PathVariable String name)
    {
        //B, if you see this, maybe its an event where you accept invite and get push notes?
        kafkaTemplate.send("guests", "Thanks, Brian: I'd like to attend. My name is " + name);
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
