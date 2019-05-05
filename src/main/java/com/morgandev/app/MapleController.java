package com.morgandev.app;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapleController {

    @PostMapping(path = "/convert", consumes = "application/json", produces = "application/json")
    public MapleResponse convert(@RequestBody MapleRequest request) {
        return new MapleResponse(request);
    }
}
