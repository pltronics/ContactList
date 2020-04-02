package com.contactlist.contacts.service;

import com.contactlist.contacts.dao.IContactDAO;
import com.contactlist.contacts.model.Contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContactService implements IContactService{

    @Autowired
    IContactDAO contactDAO;


    @Override
    public Contact fetchById(int id) {
        return contactDAO.fetchById(id);
    }

    @Override
    public void save(Contact contact) {

    }

}