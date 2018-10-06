package com.ngu.wedding.converters.impl;

import com.ngu.wedding.domains.actors.Host;
import com.ngu.wedding.dto.actors.HostDTO;
import com.ngu.wedding.converters.interfaces.HostDTOConverter;
import org.springframework.stereotype.Component;

@Component
public class HostDTOConverterImpl implements HostDTOConverter
{
    @Override
    public Host covertToDTO(HostDTO dto)
    {
        return new Host(dto.getFirstName(), dto.getLastName());
    }

    @Override
    public HostDTO covertFromDTO(Host to) {
        return new HostDTO(to.getFirstName(), to.getFirstName());
    }

}
