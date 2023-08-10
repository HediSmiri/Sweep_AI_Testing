package com.sweepbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    private DataDao dataDao;
    
    @PostMapping("/data")
    public ResponseEntity<String> handlePostRequest(@RequestBody String data) {
        dataDao.insertData(data);
        return ResponseEntity.ok("Data received: " + data);
    }
}