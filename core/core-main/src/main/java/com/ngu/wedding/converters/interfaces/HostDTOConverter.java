package com.ngu.wedding.converters.interfaces;

import com.ngu.wedding.domains.actors.Host;
import com.ngu.wedding.dto.actors.HostDTO;

public interface HostDTOConverter
{
    Host convertDTO(HostDTO dto);
}
