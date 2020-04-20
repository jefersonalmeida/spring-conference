package com.pluralsight.conference.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @Value("${app.version}")
    private String appVersion;

    @Value("${app.author}")
    private String appAuthor;

    @GetMapping(value = "/")
    public Map getStatus() {
        HashMap<String, String> map = new HashMap<>();
        map.put("version", appVersion);
        map.put("author", appAuthor);
        return map;

    }
}
