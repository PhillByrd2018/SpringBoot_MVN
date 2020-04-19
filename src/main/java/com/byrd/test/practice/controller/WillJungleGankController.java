package com.byrd.test.practice.controller;

import com.byrd.test.practice.service.GankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WillJungleGankController {

    @Autowired
    private GankService gankService;

    @GetMapping("gankPlease")
    public ResponseEntity<Boolean> willJungleGank(@RequestParam boolean canIhaveFarm){

        return new ResponseEntity<Boolean>(gankService.willGank(canIhaveFarm), HttpStatus.INTERNAL_SERVER_ERROR);

    }
}