package com.contactlist.contacts.dao;

import com.contactlist.contacts.model.Contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContactDAO implements IContactDAO {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact fetch(String searchString) {
        return null;
    }

    @Override
    public Contact fetchById(int id) {
        return contactRepository.findById(id).get();
    }

    @Override
	public Iterable<Contact> fetchAllContacts() {
		return contactRepository.findAll();
	}

}