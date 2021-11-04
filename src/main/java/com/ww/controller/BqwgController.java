package com.ww.controller;

import com.ww.service.BqwgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BqwgController {

    @Autowired
    private BqwgService bqwgService;
    @GetMapping("/bqwg")
    public String bqwg(){
        bqwgService.forEach();
        return bqwgService.getName();
    }
}
