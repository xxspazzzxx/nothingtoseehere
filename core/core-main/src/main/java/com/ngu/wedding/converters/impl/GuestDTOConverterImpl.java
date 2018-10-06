package com.ngu.wedding.converters.impl;

import com.ngu.wedding.domains.actors.Guest;
import com.ngu.wedding.dto.actors.GuestDTO;
import com.ngu.wedding.converters.interfaces.GuestDTOConverter;
import org.springframework.stereotype.Component;

/**
 * DTO Converter
 */
@Component
public class GuestDTOConverterImpl implements GuestDTOConverter
{
    @Override
    public Guest convertDTO(GuestDTO dto)
    {
        return new Guest(dto.getFirstName(), dto.getLastName());
    }
}
