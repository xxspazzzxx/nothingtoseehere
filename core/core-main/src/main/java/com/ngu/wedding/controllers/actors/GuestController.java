package com.ngu.wedding.controllers.actors;

import com.ngu.wedding.controllers.MainController;
import com.ngu.wedding.domains.actors.Guest;
import com.ngu.wedding.dto.actors.GuestDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/guest")
public class GuestController extends MainController
{
    private static final Logger LOG = LoggerFactory.getLogger(GuestController.class);

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Guest addNewGuest(@RequestBody GuestDTO guestDTO)
    {
        Guest guest = getGuestDTOConverter().covertToDTO(guestDTO);
        guest = getGuestRepository().save(guest);

        LOG.info(guest.toString() + " successfully saved into DB");

        return guest;
    }

    @GetMapping
    public ResponseEntity<List<Guest>> listAllGuests()
    {
        List<Guest> guests = getGuestRepository().findAll();
        if (guests.isEmpty())
        {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Guest>>(guests, HttpStatus.OK);
    }
}
