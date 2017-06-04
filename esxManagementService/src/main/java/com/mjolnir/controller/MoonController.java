package com.mjolnir.controller;

import com.mjolnir.dao.impl.HostDao;
import com.mjolnir.datamodel.Host;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/moon")
public class MoonController {

    private HostDao hostDao;

    @RequestMapping(path = "/{name}", method = RequestMethod.GET)
    public void getMoon(@PathVariable String name) {
        // Get moon
        hostDao.getHost(name);
    }

    @RequestMapping(method = RequestMethod.GET)
    public void getMoons() {
        hostDao.getHosts();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addMoon(@RequestBody Host host) {
        hostDao.addHost(host);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateMoon(@RequestBody Host host) {
        hostDao.updateHost(host);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteMoon(@PathVariable String name) {
        hostDao.deleteHost(name);
    }
}
