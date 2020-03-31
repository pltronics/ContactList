package com.contactlist.contacts.service;

import com.contactlist.contacts.model.Contact;

import org.springframework.stereotype.Component;

@Component
public class ContactService implements IContactService{

    @Override
    public Contact fetchById(int id) {

        Contact contact = new Contact();
        contact.setId(id);
        return contact;
    }

    @Override
    public void save(Contact contact) {

    }

}