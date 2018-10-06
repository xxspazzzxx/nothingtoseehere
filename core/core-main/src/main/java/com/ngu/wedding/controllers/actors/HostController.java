package com.ngu.wedding.controllers.actors;

import com.ngu.wedding.controllers.MainController;
import com.ngu.wedding.domains.actors.Host;
import com.ngu.wedding.dto.actors.HostDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/host")
public class HostController extends MainController
{
    private static final Logger LOG = LoggerFactory.getLogger(HostController.class);

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Host addNewHost(@RequestBody HostDTO hostDTO)
    {
        Host newHost = getHostDTOConverter().covertToDTO(hostDTO);
        getHostRepository().save(newHost);

        LOG.info(newHost.toString() + " successfully saved into DB");

        return newHost;
    }

    @GetMapping
    public ResponseEntity<List<Host>> listAllHosts()
    {
        List<Host> hosts = getHostRepository().findAll();
        if (hosts.isEmpty())
        {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Host>>(hosts, HttpStatus.OK);
    }
}
