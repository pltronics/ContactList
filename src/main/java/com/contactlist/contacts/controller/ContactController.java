package com.contactlist.contacts.controller;

import com.contactlist.contacts.model.Contact;
import com.contactlist.contacts.service.IContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/")
public class ContactController {

    @Autowired
    private IContactService contactService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        Iterable<Contact> contacts = contactService.fetchAllContacts();
        try {
            modelAndView.setViewName("home");
            modelAndView.addObject("message", contacts);
        } catch(Exception e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
        }
        return modelAndView;
    }

}