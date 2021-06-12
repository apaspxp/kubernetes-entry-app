package com.pxp.kubernetesentryapp.controller;

import com.pxp.kubernetesentryapp.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    private AppService appService;

    @RequestMapping(value = "greet", method = RequestMethod.GET)
    public String greet(){
        return appService.getBackEndResponse();
    }
}
