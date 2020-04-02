package com.contactlist.contacts.dao;

import com.contactlist.contacts.model.Contact;

public interface IContactDAO {
    
    public Contact fetch(String searchString);
    public Contact fetchById(int id);
}
