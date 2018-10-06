package com.ngu.wedding.converters.impl;

import com.ngu.wedding.domains.actors.Guest;
import com.ngu.wedding.dto.actors.GuestDTO;
import com.ngu.wedding.converters.interfaces.GuestDTOConverter;
import org.springframework.stereotype.Component;

@Component
public class GuestDTOConverterImpl implements GuestDTOConverter
{
    @Override
    public Guest covertToDTO(GuestDTO dto)
    {
        return new Guest(dto.getFirstName(), dto.getLastName());
    }

    @Override
    public GuestDTO covertFromDTO(Guest to)
    {
        return new GuestDTO(to.getFirstName(), to.getLastName());
    }
}
