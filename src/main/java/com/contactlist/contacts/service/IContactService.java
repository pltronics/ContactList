package com.contactlist.contacts.service;

import com.contactlist.contacts.model.Contact;


public interface IContactService {

    public Contact fetchById(int id);

    public void save(Contact contact);

	public Iterable<Contact> fetchAllContacts();
}