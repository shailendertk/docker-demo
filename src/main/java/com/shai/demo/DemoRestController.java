package com.shai.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.Map;

@RestController
public class DemoRestController {

    @Value("${spring.profiles.active:dev}")
    private String activeProfile;

    @GetMapping(path = "/time")
    public Map getName() {
//        ImmutableMap
        return Collections.singletonMap("time", LocalDateTime.now(ZoneId.of("US/Eastern")));
    }
}
