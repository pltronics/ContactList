package com.contactlist.contacts.controller;

import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/")
public class ContactController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        try {
            modelAndView.setViewName("home");
            modelAndView.addObject("message", "Hello World!");
        } catch(Exception e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
        }
        return modelAndView;
    }
}