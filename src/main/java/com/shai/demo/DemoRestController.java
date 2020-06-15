package com.shai.demo;

import com.google.common.collect.ImmutableMap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Map;

@RestController
public class DemoRestController {

    @Value("${spring.profiles.active:dev}")
    private String activeProfile;

    @GetMapping(path = "/time")
    public Map getName() {
        return ImmutableMap.of("profile", activeProfile,"time", LocalDateTime.now(ZoneId.of("US/Eastern")));
    }
}
