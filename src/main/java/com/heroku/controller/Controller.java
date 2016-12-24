package com.heroku.controller;

import com.heroku.service.HerokuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pperiasami on 23/12/16.
 */
@RestController
public class Controller {

    @Autowired
    HerokuService herokuService;

    @RequestMapping("/")
    public String run(){
        return herokuService.getDynoConfig("conqa03-gs-jms-pnpfetch");
    }

}
