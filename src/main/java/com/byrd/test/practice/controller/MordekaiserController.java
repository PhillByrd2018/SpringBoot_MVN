package com.byrd.test.practice.controller;
import com.byrd.test.practice.service.MordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MordekaiserController {

    @Autowired
    private MordService mordService;

    @GetMapping("/abilities")
    public ResponseEntity<String> getAbilities(@RequestParam int id) {
        
        return new ResponseEntity<>(mordService.getAbilities(id), HttpStatus.OK);
    }
}